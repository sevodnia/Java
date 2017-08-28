package com.doschechko.matylionak.data.net.RestApiForHW11;


import android.util.Log;
import android.widget.Toast;

import com.doschechko.matylionak.data.entity.People;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestServiceForHW11 {



    private static final RestServiceForHW11 instance = new RestServiceForHW11();
    private RestApiForHW11 restApi;


    private RestServiceForHW11() {
        init();
    }

    public static RestServiceForHW11 getInstance() {
        return instance;
    }


    private void init() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        //обеспечевает скачивание для RETROFIT
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS) //максимальное время получения данных от сервера
                .connectTimeout(10, TimeUnit.SECONDS) //максимальное время подключения к серверу
                .addInterceptor(logging)
                .build();
        //парсинг ГСОН
        Gson gson = new GsonBuilder().create();
        //сам ретрофит
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/30D50B7B-B5A7-7E64-FFFB-170C1588BA00/DD4392F8-C2C1-E087-FFF8-229EC8428500/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//добавляем RX2 Java
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient).build();
        restApi = retrofit.create(RestApiForHW11.class);

    }

//получаем профили всех пользователей
    public Observable<List<People>> getPeople() {
        return restApi.getPeople();
    }

//получаем пользователя по ID
    public Observable<People> getPeopleByName(String name){
        return restApi.getPeopleByName(name);
    }

//сохраняем профиль пользователя
   public void saveProfile(String s, People people) {
        Log.e("AAAAA", "BODY="+people.toString()+" ID="+s);


      Call<People> object = restApi.savePeople(s, people);
       //асинхронный вызов метода
       object.enqueue(new Callback<People>() {
            @Override
            public void onResponse(Call<People> call, Response<People> response) {
               Log.e("AAAAAAAA", "Все прошло успешно! Название потока"+Thread.currentThread().toString());
            }

            @Override
            public void onFailure(Call<People> call, Throwable t) {

            }
        });


       //return restApi.savePeople(s, people);

    }

}

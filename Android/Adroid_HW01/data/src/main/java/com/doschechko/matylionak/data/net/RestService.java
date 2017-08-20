package com.doschechko.matylionak.data.net;


import com.doschechko.matylionak.data.entity.Profile;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.List;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

public class RestService {

    private static final RestService instance = new RestService();
    private RestApi restApi;


    private RestService() {
        init();
    }

    public static RestService getInstance() {


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
                .baseUrl("https://api.backendless.com/70E26EEB-3ACD-601D-FF12-541F239F8800/FDBEBFDC-2C3B-E045-FF00-D718E4134700/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//добавляем риск джава
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient).build();


        restApi = retrofit.create(RestApi.class);

    }

    public Observable<List<Profile>> getProfiles() {
        return restApi.getProfiles();


    }

    public Observable<Void> saveProfile(Profile profile) {
        return restApi.saveProfile(profile);
    }


}

package com.doschechko.matylionak.data.net.Rest;

/*
API сервис для получения Obserable цитат
 */

import com.doschechko.matylionak.data.entity.AuthorData;
import com.doschechko.matylionak.data.entity.QuoteData;
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
    private RestAPI restApi;

    private RestService() {
        init();
    }

    public static RestService getInstance() {
        return instance;
    }


    private void init() {
        HttpLoggingInterceptor logging = new HttpLoggingInterceptor();
        logging.setLevel(HttpLoggingInterceptor.Level.BODY);
        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .readTimeout(10, TimeUnit.SECONDS) //максимальное время получения данных от сервера
                .connectTimeout(10, TimeUnit.SECONDS) //максимальное время подключения к серверу
                .addInterceptor(logging)
                .build();
        Gson gson = new GsonBuilder().create();
        //сам ретрофит
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl("https://api.backendless.com/30D50B7B-B5A7-7E64-FFFB-170C1588BA00/DD4392F8-C2C1-E087-FFF8-229EC8428500/")
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//добавляем RX2 Java
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient).build();
        restApi = retrofit.create(RestAPI.class);


    }


    public Observable<List<QuoteData>> getQuotes() {

        return restApi.getQuotes();

    }

    public Observable<QuoteData> getQuoteByID(String id) {


        return restApi.getQuoteByID(id);
    }


    public Observable<List<QuoteData>> getId() {

        return restApi.getId();


    }


    public Observable<List<QuoteData>> getQuotesWithNumber(String number) {
        return restApi.getQuotesWithNumber(number);

    }


    public Observable<List<AuthorData>> getAuthors() {
        return restApi.getAuthors();


    }


    public Observable<List<QuoteData>> getQuotesByAuthor(String s ) {
        return restApi.getQuotesByAuthor(s);
    }



}

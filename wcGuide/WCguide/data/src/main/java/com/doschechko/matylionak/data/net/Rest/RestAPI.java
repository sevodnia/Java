package com.doschechko.matylionak.data.net.Rest;

import com.doschechko.matylionak.data.entity.AuthorData;
import com.doschechko.matylionak.data.entity.QuoteData;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;
import retrofit2.http.Url;


public interface RestAPI {

    //загружает 5 объектов
    @GET("data/quotes?pageSize=5")
    Observable<List<QuoteData>> getQuotes();

    //загружает определенный объект
    @GET("data/quotes/{id}")
    Observable<QuoteData> getQuoteByID(@Path("id") String id);


    //загружет все id коллекции
    @GET("data/quotes?props=objectId")
    Observable<List<QuoteData>> getId();


    //для работы с данным авторов


    //загружает 5 объектов c пагинацией
    @GET("data/quotes?pageSize=5")
    Observable<List<QuoteData>> getQuotesWithNumber(@Query("offset") String number);

    //загружает все объекты авторов
    @GET("data/authors")
    Observable<List<AuthorData>> getAuthors();



//    //загружает по условию "имя автора
//    @GET("data/quotes?where=")
//    Observable<List<QuoteData>> getQuotesByAuthor(@Query("quote_author")String s);


//    //загружает по условию "имя автора
//    @GET("data/quotes?where={path}")
//    Observable<List<QuoteData>> getQuotesByAuthor(@Path("path")String s);


        //загружает по условию "имя автора"
    @GET
    Observable<List<QuoteData>> getQuotesByAuthor(@Url String s);


}

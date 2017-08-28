package com.doschechko.matylionak.data.net.RestApiForHW11;

import com.doschechko.matylionak.data.entity.People;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.PUT;
import retrofit2.http.Path;

/**
 * Интерфейс для обеспечения API retrofit
 */

public interface RestApiForHW11 {

    @GET("data/example?pageSize=100")
    Observable<List<People>> getPeople();


    @GET("data/example/{name}")
    Observable<People> getPeopleByName(@Path("name") String name);

    @PUT("data/example/{id}")
    Call<People> savePeople(@Path("id") String id, @Body People people );

//    @POST("data/example")
//    Observable<Void> savePeople(@Body People people);
}

package com.doschechko.matylionak.data.net;


import com.doschechko.matylionak.data.entity.Profile;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RestApi {

    @GET("data/profile")
    Observable<List<Profile>> getProfiles();



    @POST("data/profile")
    Observable<Void> saveProfile(@Body Profile profile);



}

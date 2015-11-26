package me.mattak.retrofitsample;

import retrofit.Call;
import retrofit.http.GET;

/**
 * IfconfigInterface
 * Created by maruyama on 15/11/26.
 */
public interface IfconfigApi {
    @GET("/all.json")
    Call<AllEntity> all();
}
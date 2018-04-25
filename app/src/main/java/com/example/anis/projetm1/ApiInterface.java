package com.example.anis.projetm1;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anis on 4/4/2018.
 */

public interface ApiInterface {

    @GET("/api/routers/default/index/routes/")
    Call<List<Line>> getLines();

}

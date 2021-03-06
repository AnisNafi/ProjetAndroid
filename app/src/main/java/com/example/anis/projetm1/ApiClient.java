package com.example.anis.projetm1;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Anis on 4/4/2018.
 */

public class ApiClient {

    public static final String BASE_URL = "https://data.metromobilite.fr";
    public static Retrofit retrofit = null;

    public static Retrofit getApiClient()
    {
        if(retrofit == null)
        {
            retrofit = new Retrofit.Builder().baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create()).build();
        }
        return retrofit;
    }

}

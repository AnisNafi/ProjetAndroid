package com.example.anis.projetm1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.GridView;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {

    private GridAdapter adapter;
    private List<Line> lines;
    private ApiInterface apiInterface;
    private GridView grid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        grid = findViewById(R.id.grid);

        apiInterface = ApiClient.getApiClient().create(ApiInterface.class);

        Call<List<Line>> call = apiInterface.getLines();

        call.enqueue(new Callback<List<Line>>() {
            @Override
            public void onResponse(Call<List<Line>> call, Response<List<Line>> response) {

                lines = response.body();
                adapter = new GridAdapter(MainActivity.this, lines);
                grid.setAdapter(adapter);
            }

            @Override
            public void onFailure(Call<List<Line>> call, Throwable t) {

            }
        });

    }
}

package com.laaptu.popmovies.moviedetail;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.laaptu.popmovies.R;
import com.laaptu.popmovies.network.MovieApiService;

import javax.inject.Inject;

import dagger.android.AndroidInjection;

public class MovieDetailActivity extends AppCompatActivity {

    @Inject
    MovieApiService movieApiService;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AndroidInjection.inject(this);
        setContentView(R.layout.activity_movie_detail);
    }
}

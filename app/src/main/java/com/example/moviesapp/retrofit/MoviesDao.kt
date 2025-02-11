package com.example.moviesapp.retrofit

import com.example.moviesapp.data.entity.MoviesResponse
import retrofit2.http.GET

interface MoviesDao {

    @GET("filmler_yeni/tum_filmler.php")
    suspend fun uploadMovie(): MoviesResponse
}
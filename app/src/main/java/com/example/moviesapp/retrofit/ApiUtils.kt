package com.example.moviesapp.retrofit

class ApiUtils {

    companion object {
        val base_url = "http://kasimadalan.pe.hu/"

        fun getMoviesDao(): MoviesDao {
            return RetrofitClient.getClient(base_url).create(MoviesDao::class.java)
        }
    }
}
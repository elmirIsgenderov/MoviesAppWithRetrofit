package com.example.moviesapp.data.datasource

import com.example.moviesapp.data.entity.Movies
import com.example.moviesapp.retrofit.MoviesDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource(private var mdao: MoviesDao) {

    suspend fun movieUpload(): List<Movies> =
        withContext(Dispatchers.IO) {
            return@withContext mdao.uploadMovie().movie
        }
}
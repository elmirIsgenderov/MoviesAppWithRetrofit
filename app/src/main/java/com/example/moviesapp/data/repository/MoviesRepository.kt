package com.example.moviesapp.data.repository

import com.example.moviesapp.data.datasource.MoviesDataSource
import com.example.moviesapp.data.entity.Movies

class MoviesRepository(private var fds: MoviesDataSource) {

    suspend fun movieUpload(): List<Movies> = fds.movieUpload()
}
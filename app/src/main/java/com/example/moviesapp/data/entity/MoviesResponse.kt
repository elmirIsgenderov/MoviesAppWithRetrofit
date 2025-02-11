package com.example.moviesapp.data.entity

data class MoviesResponse(
    var movie: List<Movies>,
    var success: Int
) {
}
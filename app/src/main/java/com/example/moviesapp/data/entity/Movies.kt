package com.example.moviesapp.data.entity

import java.io.Serializable

data class Movies(
    var id: Int,
    var name: String,
    var picture: String,
    var price: Int
) : Serializable {
}
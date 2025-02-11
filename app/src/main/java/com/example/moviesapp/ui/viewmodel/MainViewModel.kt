package com.example.moviesapp.ui.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.moviesapp.data.entity.Movies
import com.example.moviesapp.data.repository.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(private var frepo: MoviesRepository) : ViewModel() {

    val moviesList = MutableLiveData<List<Movies>>()

    init {
        movieUpload()
    }

    fun movieUpload() {
        CoroutineScope(Dispatchers.Main).launch {
            moviesList.value = frepo.movieUpload()
        }
    }
}
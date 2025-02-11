package com.example.moviesapp.di

import com.example.moviesapp.data.datasource.MoviesDataSource
import com.example.moviesapp.data.repository.MoviesRepository
import com.example.moviesapp.retrofit.ApiUtils
import com.example.moviesapp.retrofit.MoviesDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class AppModule {


    @Provides
    @Singleton
    fun provideMoviesRepo(fds: MoviesDataSource): MoviesRepository {
        return MoviesRepository(fds)
    }

    @Provides
    @Singleton
    fun provideMoviesDataSource(mdao: MoviesDao): MoviesDataSource {
        return MoviesDataSource(mdao)
    }

    @Provides
    @Singleton
    fun provideMovieDao(): MoviesDao {
        return ApiUtils.getMoviesDao()
    }


}
package com.example.tmdb.data.repository

import com.example.tmdb.BuildConfig
import com.example.tmdb.data.local.MovieDao
import com.example.tmdb.data.local.MovieEntity
import com.example.tmdb.data.remote.TMDBApiClient
import com.example.tmdb.data.remote.TMDBApiService
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.map

class MovieRepository(
    private val movieDao: MovieDao,
    private val apiService: TMDBApiService = TMDBApiClient.apiService
) {
    // Local database operations
    fun getFavoriteMovies(): Flow<List<MovieEntity>> {
        return movieDao.getFavoriteMovies()
    }
    
    suspend fun getMovieById(movieId: Int): MovieEntity? {
        return movieDao.getMovieById(movieId)
    }
    
    suspend fun toggleFavorite(movieId: Int) {
        val movie = movieDao.getMovieById(movieId)
        if (movie != null) {
            movieDao.updateFavoriteStatus(movieId, !movie.isFavorite)
        }
    }
    
    // Remote API operations
    suspend fun getPopularMovies(page: Int = 1): List<MovieEntity> {
        val response = apiService.getPopularMovies(BuildConfig.TMDB_API_KEY, page)
        val movies = response.results.map { it.toMovieEntity() }
        
        // Check if any of these movies are favorites
        movies.forEach { movie ->
            val localMovie = movieDao.getMovieById(movie.id)
            if (localMovie?.isFavorite == true) {
                movieDao.insertMovie(movie.copy(isFavorite = true))
            } else {
                movieDao.insertMovie(movie)
            }
        }
        
        return movies
    }
    
    suspend fun getMovieDetails(movieId: Int): MovieEntity {
        val localMovie = movieDao.getMovieById(movieId)
        
        return if (localMovie != null) {
            localMovie
        } else {
            val remoteMovie = apiService.getMovieDetails(movieId, BuildConfig.TMDB_API_KEY)
            val movieEntity = remoteMovie.toMovieEntity()
            movieDao.insertMovie(movieEntity)
            movieEntity
        }
    }
    
    suspend fun searchMovies(query: String, page: Int = 1): List<MovieEntity> {
        val response = apiService.searchMovies(BuildConfig.TMDB_API_KEY, query, page)
        val movies = response.results.map { it.toMovieEntity() }
        
        // Check if any of these movies are favorites
        movies.forEach { movie ->
            val localMovie = movieDao.getMovieById(movie.id)
            if (localMovie?.isFavorite == true) {
                movieDao.insertMovie(movie.copy(isFavorite = true))
            } else {
                movieDao.insertMovie(movie)
            }
        }
        
        return movies
    }
}
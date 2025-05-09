package com.example.tmdb.ui.screens.details

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.example.tmdb.data.local.MovieEntity
import com.example.tmdb.data.repository.MovieRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch

class MovieDetailsViewModel(
    private val repository: MovieRepository,
    private val movieId: Int
) : ViewModel() {
    
    private val _uiState = MutableStateFlow<MovieDetailsUiState>(MovieDetailsUiState.Loading)
    val uiState: StateFlow<MovieDetailsUiState> = _uiState.asStateFlow()
    
    init {
        loadMovieDetails()
    }
    
    private fun loadMovieDetails() {
        viewModelScope.launch {
            try {
                val movie = repository.getMovieDetails(movieId)
                _uiState.value = MovieDetailsUiState.Success(movie)
            } catch (e: Exception) {
                _uiState.value = MovieDetailsUiState.Error(e.message ?: "Unknown error")
            }
        }
    }
    
    fun toggleFavorite() {
        viewModelScope.launch {
            try {
                repository.toggleFavorite(movieId)
                // Reload the movie details to reflect the updated favorite status
                loadMovieDetails()
            } catch (e: Exception) {
                // Handle error if needed
            }
        }
    }
    
    class Factory(
        private val repository: MovieRepository,
        private val movieId: Int
    ) : ViewModelProvider.Factory {
        @Suppress("UNCHECKED_CAST")
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MovieDetailsViewModel::class.java)) {
                return MovieDetailsViewModel(repository, movieId) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}

sealed class MovieDetailsUiState {
    object Loading : MovieDetailsUiState()
    data class Success(val movie: MovieEntity) : MovieDetailsUiState()
    data class Error(val message: String) : MovieDetailsUiState()
}
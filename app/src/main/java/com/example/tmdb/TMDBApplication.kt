package com.example.tmdb

import android.app.Application
import com.example.tmdb.data.local.AppDatabase
import com.example.tmdb.data.repository.MovieRepository

class TMDBApplication : Application() {
    // Lazy initialization of the database
    val database by lazy { AppDatabase.getDatabase(this) }
    
    // Lazy initialization of the repository with the DAO from the database
    val repository by lazy { MovieRepository(database.movieDao()) }
}
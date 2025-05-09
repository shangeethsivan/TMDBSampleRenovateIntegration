package com.example.tmdb.data.repository;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u0012\u0010\u0007\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\t0\bJ\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\u0019\u0010\u000f\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\t2\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ)\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0006\u0010\u0013\u001a\u00020\u00142\b\b\u0002\u0010\u0011\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0015J\u0019\u0010\u0016\u001a\u00020\u00172\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/tmdb/data/repository/MovieRepository;", "", "movieDao", "Lcom/example/tmdb/data/local/MovieDao;", "apiService", "Lcom/example/tmdb/data/remote/TMDBApiService;", "(Lcom/example/tmdb/data/local/MovieDao;Lcom/example/tmdb/data/remote/TMDBApiService;)V", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "Lcom/example/tmdb/data/local/MovieEntity;", "getMovieById", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovieDetails", "getPopularMovies", "page", "searchMovies", "query", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "toggleFavorite", "", "app_debug"})
public final class MovieRepository {
    private final com.example.tmdb.data.local.MovieDao movieDao = null;
    private final com.example.tmdb.data.remote.TMDBApiService apiService = null;
    
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.example.tmdb.data.local.MovieDao movieDao, @org.jetbrains.annotations.NotNull
    com.example.tmdb.data.remote.TMDBApiService apiService) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.Flow<java.util.List<com.example.tmdb.data.local.MovieEntity>> getFavoriteMovies() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMovieById(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.tmdb.data.local.MovieEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object toggleFavorite(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getPopularMovies(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.tmdb.data.local.MovieEntity>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMovieDetails(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.tmdb.data.local.MovieEntity> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String query, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.tmdb.data.local.MovieEntity>> continuation) {
        return null;
    }
}
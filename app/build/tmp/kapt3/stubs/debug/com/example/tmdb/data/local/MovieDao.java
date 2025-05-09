package com.example.tmdb.data.local;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0014\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\r0\fH\'J\u001b\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J!\u0010\u0010\u001a\u00020\u00032\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0012H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u00f8\u0001\u0001\u0082\u0002\n\n\u0002\b\u0019\n\u0004\b!0\u0001\u00a8\u0006\u0015\u00c0\u0006\u0001"}, d2 = {"Lcom/example/tmdb/data/local/MovieDao;", "", "deleteMovie", "", "movie", "Lcom/example/tmdb/data/local/MovieEntity;", "(Lcom/example/tmdb/data/local/MovieEntity;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "deleteMovieById", "movieId", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getFavoriteMovies", "Lkotlinx/coroutines/flow/Flow;", "", "getMovieById", "insertMovie", "updateFavoriteStatus", "isFavorite", "", "(IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "updateMovie", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.NotNull
    @androidx.room.Query(value = "SELECT * FROM movies WHERE isFavorite = 1")
    public abstract kotlinx.coroutines.flow.Flow<java.util.List<com.example.tmdb.data.local.MovieEntity>> getFavoriteMovies();
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM movies WHERE id = :movieId")
    public abstract java.lang.Object getMovieById(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.tmdb.data.local.MovieEntity> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert(onConflict = 1)
    public abstract java.lang.Object insertMovie(@org.jetbrains.annotations.NotNull
    com.example.tmdb.data.local.MovieEntity movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Update
    public abstract java.lang.Object updateMovie(@org.jetbrains.annotations.NotNull
    com.example.tmdb.data.local.MovieEntity movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "UPDATE movies SET isFavorite = :isFavorite WHERE id = :movieId")
    public abstract java.lang.Object updateFavoriteStatus(int movieId, boolean isFavorite, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object deleteMovie(@org.jetbrains.annotations.NotNull
    com.example.tmdb.data.local.MovieEntity movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "DELETE FROM movies WHERE id = :movieId")
    public abstract java.lang.Object deleteMovieById(int movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}
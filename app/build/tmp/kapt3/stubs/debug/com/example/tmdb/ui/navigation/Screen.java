package com.example.tmdb.ui.navigation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0003\u0007\b\tB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\n\u000b\f\u00a8\u0006\r"}, d2 = {"Lcom/example/tmdb/ui/navigation/Screen;", "", "route", "", "(Ljava/lang/String;)V", "getRoute", "()Ljava/lang/String;", "Favorites", "Home", "MovieDetails", "Lcom/example/tmdb/ui/navigation/Screen$Favorites;", "Lcom/example/tmdb/ui/navigation/Screen$Home;", "Lcom/example/tmdb/ui/navigation/Screen$MovieDetails;", "app_debug"})
public abstract class Screen {
    @org.jetbrains.annotations.NotNull
    private final java.lang.String route = null;
    
    private Screen(java.lang.String route) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.lang.String getRoute() {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/tmdb/ui/navigation/Screen$Home;", "Lcom/example/tmdb/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Home extends com.example.tmdb.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.example.tmdb.ui.navigation.Screen.Home INSTANCE = null;
        
        private Home() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002\u00a8\u0006\u0003"}, d2 = {"Lcom/example/tmdb/ui/navigation/Screen$Favorites;", "Lcom/example/tmdb/ui/navigation/Screen;", "()V", "app_debug"})
    public static final class Favorites extends com.example.tmdb.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.example.tmdb.ui.navigation.Screen.Favorites INSTANCE = null;
        
        private Favorites() {
            super(null);
        }
    }
    
    @kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/example/tmdb/ui/navigation/Screen$MovieDetails;", "Lcom/example/tmdb/ui/navigation/Screen;", "()V", "ARG_MOVIE_ID", "", "createRoute", "movieId", "", "app_debug"})
    public static final class MovieDetails extends com.example.tmdb.ui.navigation.Screen {
        @org.jetbrains.annotations.NotNull
        public static final com.example.tmdb.ui.navigation.Screen.MovieDetails INSTANCE = null;
        @org.jetbrains.annotations.NotNull
        public static final java.lang.String ARG_MOVIE_ID = "movieId";
        
        private MovieDetails() {
            super(null);
        }
        
        @org.jetbrains.annotations.NotNull
        public final java.lang.String createRoute(int movieId) {
            return null;
        }
    }
}
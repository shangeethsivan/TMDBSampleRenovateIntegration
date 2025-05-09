package com.example.tmdb.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u00a2\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H\u00c6\u0003J\t\u0010\u0011\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\u0006H\u00c6\u0003J\t\u0010\u0013\u001a\u00020\u0006H\u00c6\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006H\u00c6\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0006H\u00d6\u0001J\t\u0010\u0019\u001a\u00020\u001aH\u00d6\u0001R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0016\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b\u00a8\u0006\u001b"}, d2 = {"Lcom/example/tmdb/data/remote/MovieResponse;", "", "results", "", "Lcom/example/tmdb/data/remote/MovieDto;", "page", "", "totalPages", "totalResults", "(Ljava/util/List;III)V", "getPage", "()I", "getResults", "()Ljava/util/List;", "getTotalPages", "getTotalResults", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "", "app_debug"})
public final class MovieResponse {
    @org.jetbrains.annotations.NotNull
    private final java.util.List<com.example.tmdb.data.remote.MovieDto> results = null;
    private final int page = 0;
    @com.google.gson.annotations.SerializedName(value = "total_pages")
    private final int totalPages = 0;
    @com.google.gson.annotations.SerializedName(value = "total_results")
    private final int totalResults = 0;
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tmdb.data.remote.MovieResponse copy(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.tmdb.data.remote.MovieDto> results, int page, int totalPages, int totalResults) {
        return null;
    }
    
    @java.lang.Override
    public boolean equals(@org.jetbrains.annotations.Nullable
    java.lang.Object other) {
        return false;
    }
    
    @java.lang.Override
    public int hashCode() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull
    @java.lang.Override
    public java.lang.String toString() {
        return null;
    }
    
    public MovieResponse(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.tmdb.data.remote.MovieDto> results, int page, int totalPages, int totalResults) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tmdb.data.remote.MovieDto> component1() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    public final java.util.List<com.example.tmdb.data.remote.MovieDto> getResults() {
        return null;
    }
    
    public final int component2() {
        return 0;
    }
    
    public final int getPage() {
        return 0;
    }
    
    public final int component3() {
        return 0;
    }
    
    public final int getTotalPages() {
        return 0;
    }
    
    public final int component4() {
        return 0;
    }
    
    public final int getTotalResults() {
        return 0;
    }
}
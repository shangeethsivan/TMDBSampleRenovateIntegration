package com.example.tmdb.data.remote;

import java.lang.System;

@kotlin.Metadata(mv = {1, 8, 0}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u00042\b\u0010\u000f\u001a\u0004\u0018\u00010\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u0011\u0010\u0005\u001a\u00020\u0006\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0016\u0010\u000b\u001a\n \r*\u0004\u0018\u00010\f0\fX\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0010"}, d2 = {"Lcom/example/tmdb/data/remote/TMDBApiClient;", "", "()V", "IMAGE_BASE_URL", "", "apiService", "Lcom/example/tmdb/data/remote/TMDBApiService;", "getApiService", "()Lcom/example/tmdb/data/remote/TMDBApiService;", "okHttpClient", "Lokhttp3/OkHttpClient;", "retrofit", "Lretrofit2/Retrofit;", "kotlin.jvm.PlatformType", "getImageUrl", "path", "app_debug"})
public final class TMDBApiClient {
    @org.jetbrains.annotations.NotNull
    public static final com.example.tmdb.data.remote.TMDBApiClient INSTANCE = null;
    private static final java.lang.String IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500";
    private static final okhttp3.OkHttpClient okHttpClient = null;
    private static final retrofit2.Retrofit retrofit = null;
    @org.jetbrains.annotations.NotNull
    private static final com.example.tmdb.data.remote.TMDBApiService apiService = null;
    
    private TMDBApiClient() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final com.example.tmdb.data.remote.TMDBApiService getApiService() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.String getImageUrl(@org.jetbrains.annotations.Nullable
    java.lang.String path) {
        return null;
    }
}
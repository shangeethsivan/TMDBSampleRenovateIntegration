package com.example.tmdb.data.remote

import com.example.tmdb.BuildConfig
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

object TMDBApiClient {
    private const val IMAGE_BASE_URL = "https://image.tmdb.org/t/p/w500"
    
    private val okHttpClient = OkHttpClient.Builder()
        .addInterceptor(HttpLoggingInterceptor().apply {
            level = HttpLoggingInterceptor.Level.BODY
        })
        .connectTimeout(30, TimeUnit.SECONDS)
        .readTimeout(30, TimeUnit.SECONDS)
        .writeTimeout(30, TimeUnit.SECONDS)
        .build()
    
    private val retrofit = Retrofit.Builder()
        .baseUrl(BuildConfig.TMDB_BASE_URL)
        .client(okHttpClient)
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    
    val apiService: TMDBApiService = retrofit.create(TMDBApiService::class.java)
    
    fun getImageUrl(path: String?): String? {
        return if (path != null) {
            "$IMAGE_BASE_URL$path"
        } else {
            null
        }
    }
}
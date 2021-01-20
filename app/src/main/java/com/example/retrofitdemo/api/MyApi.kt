package com.example.retrofitdemo.api

import com.example.retrofitdemo.model.Post
import retrofit2.Retrofit
import retrofit2.http.GET

interface MyApi {
    @GET("posts/1")
    suspend fun getPost():Post


}
package com.example.retrofitdemo.repository

import com.example.retrofitdemo.api.MyRetrofitBuilder
import com.example.retrofitdemo.model.Post
import retrofit2.Retrofit

object MyRepository {
    suspend fun getPost():Post = MyRetrofitBuilder.myApi.getPost()
}
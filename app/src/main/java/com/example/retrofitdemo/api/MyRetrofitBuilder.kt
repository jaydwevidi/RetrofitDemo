package com.example.retrofitdemo.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object MyRetrofitBuilder {
    val myURL = "https://jsonplaceholder.typicode.com/"

    private val myRetrofitBuilder by lazy {
        Retrofit.Builder()
            .baseUrl(myURL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val myApi: MyApi by lazy {
        myRetrofitBuilder.create(MyApi::class.java)
    }
}
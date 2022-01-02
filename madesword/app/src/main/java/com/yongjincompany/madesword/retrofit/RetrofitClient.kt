package com.yongjincompany.madesword.retrofit

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitClient {
    const val MainServer = "http://"

    val retrofitClient: Retrofit.Builder by lazy {

        Retrofit.Builder()
            .baseUrl("http://")
            .client(OkHttpClient.Builder().build())
            .addConverterFactory(GsonConverterFactory.create())
    }

    val apiInterface: ApiInterface by lazy {
        retrofitClient
            .build()
            .create(ApiInterface::class.java)
    }
}
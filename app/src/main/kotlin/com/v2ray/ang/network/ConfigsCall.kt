package com.v2ray.ang.network

import android.graphics.Bitmap.Config
import com.v2ray.ang.dto.JsonResponse
import com.v2ray.ang.dto.TextResponse
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.converter.scalars.ScalarsConverterFactory
import retrofit2.create
import retrofit2.http.GET


private const val BASE_URL =
    "https://raw.githubusercontent.com/MrMohebi/xray-proxy-grabber-telegram/"



private val retrofit = Retrofit.Builder()
    .addConverterFactory(ScalarsConverterFactory.create())
    .baseUrl(BASE_URL)
    .build()

interface ConfigsCall {
    // https://raw.githubusercontent.com/yebekhe/ConfigCollector/main/json/configs.json


    /*
    @GET("main/json/configs.json")
    suspend fun getJsonData() : List<JsonResponse>
    */

    @GET("master/collected-proxies/row-url/actives.txt")
    suspend fun getJsonData() : String

}


object ConfigsObject {
    val retrofitService: ConfigsCall by lazy {
        retrofit.create(ConfigsCall::class.java)
    }
}
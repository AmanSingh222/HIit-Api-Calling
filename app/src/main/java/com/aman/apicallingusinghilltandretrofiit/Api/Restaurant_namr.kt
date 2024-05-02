package com.aman.apicallingusinghilltandretrofiit.Api

import retrofit2.Response
import retrofit2.http.GET

interface Restaurant_namr {
    @GET("display/display_resturent_info")
    suspend fun getResInfo():Response<List<Restaurant_namr>>

}
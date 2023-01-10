package com.kamuran.retrofit100123

import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.http.GET
import retrofit2.http.Query

interface RetroSeviceServisi {

    //repositories?q=network


    @GET("repositories")
    fun getDataFromApi(@Query("q") query: String): Call<RecyclerListDataModeli>

}
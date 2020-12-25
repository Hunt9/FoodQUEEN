package com.example.foodqueen.data.api

import com.example.foodqueen.data.model.ItemsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SOService {

    @GET("/Items/showitems.php")
    suspend fun getItemList(@Query("category")category:String):Response<ItemsList>

}
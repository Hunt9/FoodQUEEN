package com.example.foodqueen.data.api

import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.data.model.ItemsList
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface SOService {

    @GET("Items/showitems.php?")
    suspend fun getItemList(@Query("category")category:String):Response<ItemsList>

    @GET("Cards/showcard.php?")
    suspend fun getCartItemList(@Query("mobile_id")mobile_id:String):Response<Cart>

    @GET("Cards/addtocard.php?")
    suspend fun updateCart(@Query("item_id")item_id:Int,
                            @Query("mobile_id")mobile_id:String,
                            @Query("price")price:Double,
                            @Query("quantity")quantity:Int,
                            @Query("unit")unit:String,
                            ):Response<AddtoCart>

}
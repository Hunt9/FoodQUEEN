package com.example.foodqueen.data.model


import com.google.gson.annotations.SerializedName
import java.lang.reflect.Constructor

data class Cart(
    @SerializedName("cartItems")
    val cartItems: List<CartItem>,
    @SerializedName("grandtotal")
    val grandtotal: String,
    @SerializedName("status_message")
    val statusMessage: String,
    @SerializedName("total")
    val total: String,
    @SerializedName("totalitems")
    val totalitems: Int

)
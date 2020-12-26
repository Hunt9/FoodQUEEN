package com.example.foodqueen.data.model


import com.google.gson.annotations.SerializedName

data class CartItem(
    @SerializedName("card_id")
    val cardId: String,
    @SerializedName("image")
    val image: String,
    @SerializedName("item_id")
    val itemId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("price")
    val price: String,
    @SerializedName("priceGRAM")
    val priceGRAM: String,
    @SerializedName("priceKG")
    val priceKG: String,
    @SerializedName("quantity")
    val quantity: String,
    @SerializedName("unit")
    val unit: String,
    @SerializedName("urdu_name")
    val urduName: String
)
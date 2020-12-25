package com.example.foodqueen.data.model


import com.google.gson.annotations.SerializedName

data class Item(
    @SerializedName("image")
    val image: String,
    @SerializedName("item_id")
    val itemId: String,
    @SerializedName("name")
    val name: String,
    @SerializedName("priceGRAM")
    val priceGRAM: String,
    @SerializedName("priceKG")
    val priceKG: String,
    @SerializedName("urdu_name")
    val urduName: String
)
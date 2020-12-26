package com.example.foodqueen.data.model


import com.google.gson.annotations.SerializedName

data class AddtoCart(
    @SerializedName("status")
    val status: Boolean,
    @SerializedName("status_message")
    val statusMessage: String
)
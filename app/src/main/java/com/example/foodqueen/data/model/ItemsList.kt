package com.example.foodqueen.data.model


import com.example.foodqueen.data.model.Item
import com.google.gson.annotations.SerializedName

data class ItemsList(
    @SerializedName("items")
    val items: List<Item>,
    @SerializedName("status_message")
    val statusMessage: String
)
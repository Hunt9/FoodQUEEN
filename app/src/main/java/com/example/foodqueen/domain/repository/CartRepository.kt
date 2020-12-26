package com.example.foodqueen.domain.repository

import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.data.model.Cart
import retrofit2.http.Query

interface CartRepository {
    suspend fun getCart(): Cart?
    suspend fun updateCart(
        item_id: Int,
        mobile_id: String,
        price: Double,
        quantity: Int,
        unit: String
    ): AddtoCart?
}
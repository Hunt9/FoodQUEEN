package com.example.foodqueen.data.repository.cart.datasource

import com.example.foodqueen.data.model.AddtoCart
import retrofit2.Response

interface AddToCartDataSource {
    suspend fun updateCart(): Response<AddtoCart>
}
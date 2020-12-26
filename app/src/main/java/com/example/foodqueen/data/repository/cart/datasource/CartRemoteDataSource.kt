package com.example.foodqueen.data.repository.cart.datasource

import com.example.foodqueen.data.model.Cart
import retrofit2.Response

interface CartRemoteDataSource {

    suspend fun getCart(): Response<Cart>
}
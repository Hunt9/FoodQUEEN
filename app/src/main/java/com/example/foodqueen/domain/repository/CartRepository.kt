package com.example.foodqueen.domain.repository

import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.data.model.Cart

interface CartRepository {
    suspend fun getCart(): Cart?
    suspend fun updateCart(): AddtoCart?
}
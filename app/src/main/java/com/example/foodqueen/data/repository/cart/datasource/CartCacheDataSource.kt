package com.example.foodqueen.data.repository.cart.datasource

import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.data.model.Item

interface CartCacheDataSource {

    suspend fun getCartFromCache():Cart
    suspend fun saveCartFromCache(cart: Cart)
}
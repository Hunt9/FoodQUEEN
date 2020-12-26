package com.example.foodqueen.data.repository.cart.datasourceimpl

import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.data.repository.cart.datasource.CartCacheDataSource

class CartCacheDataSourceImpl : CartCacheDataSource {

    private lateinit var cart:Cart

    override suspend fun getCartFromCache(): Cart {
        return cart
    }

    override suspend fun saveCartFromCache(cart: Cart) {
        this.cart = cart
    }
}
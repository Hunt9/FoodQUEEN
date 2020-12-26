package com.example.foodqueen.data.repository.cart.datasourceimpl

import com.example.foodqueen.data.api.SOService
import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.data.model.ItemsList
import com.example.foodqueen.data.repository.cart.datasource.AddToCartDataSource
import com.example.foodqueen.data.repository.cart.datasource.CartRemoteDataSource
import com.example.foodqueen.data.repository.item.datasource.ItemRemoteDataSource
import retrofit2.Response

class CartRemoteDataSourceImpl(private val soService: SOService, private val mobile_id:String):
CartRemoteDataSource {
    override suspend fun getCart(): Response<Cart> = soService.getCartItemList(mobile_id)
}

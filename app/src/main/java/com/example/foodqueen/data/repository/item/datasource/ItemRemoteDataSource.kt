package com.example.foodqueen.data.repository.item.datasource

import com.example.foodqueen.data.model.ItemsList
import retrofit2.Response

interface ItemRemoteDataSource {
    suspend fun getItems(): Response<ItemsList>
}
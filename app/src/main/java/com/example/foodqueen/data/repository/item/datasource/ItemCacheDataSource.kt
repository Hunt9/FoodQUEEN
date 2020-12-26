package com.example.foodqueen.data.repository.item.datasource

import com.example.foodqueen.data.model.Item

interface ItemCacheDataSource {
    suspend fun getItemsFromCache():List<Item>
    suspend fun saveItemsFromCache(item: List<Item>)
}
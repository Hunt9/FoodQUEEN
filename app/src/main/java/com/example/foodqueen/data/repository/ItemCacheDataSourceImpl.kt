package com.example.foodqueen.data.repository

import com.example.foodqueen.data.model.Item

class ItemCacheDataSourceImpl :ItemCacheDataSource {
    private var itemsList = ArrayList<Item>()
    override suspend fun getItemsFromCache(): List<Item> {
        return itemsList
    }

    override suspend fun saveItemsFromCache(item: List<Item>) {
        itemsList.clear()
        itemsList = ArrayList(item)

    }
}
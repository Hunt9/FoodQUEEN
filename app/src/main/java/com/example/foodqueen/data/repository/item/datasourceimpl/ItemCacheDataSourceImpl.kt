package com.example.foodqueen.data.repository.item.datasourceimpl

import com.example.foodqueen.data.model.Item
import com.example.foodqueen.data.repository.item.datasource.ItemCacheDataSource

class ItemCacheDataSourceImpl : ItemCacheDataSource {
    private var itemsList = ArrayList<Item>()
    override suspend fun getItemsFromCache(): List<Item> {
        return itemsList
    }

    override suspend fun saveItemsFromCache(item: List<Item>) {
        itemsList.clear()
        itemsList = ArrayList(item)

    }
}
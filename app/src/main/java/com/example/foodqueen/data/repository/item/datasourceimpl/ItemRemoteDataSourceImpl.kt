package com.example.foodqueen.data.repository.item.datasourceimpl

import com.example.foodqueen.data.api.SOService
import com.example.foodqueen.data.model.ItemsList
import com.example.foodqueen.data.repository.item.datasource.ItemRemoteDataSource
import retrofit2.Response

class ItemRemoteDataSourceImpl(private val soService: SOService,private val category:String):
    ItemRemoteDataSource {
    override suspend fun getItems(): Response<ItemsList> = soService.getItemList(category)

}
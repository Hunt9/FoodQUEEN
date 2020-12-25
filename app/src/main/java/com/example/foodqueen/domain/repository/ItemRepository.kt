package com.example.foodqueen.domain.repository

import com.example.foodqueen.data.model.Item

interface ItemRepository {

    suspend fun getItems():List<Item>?
}
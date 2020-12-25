package com.example.foodqueen.domain.usecase

import com.example.foodqueen.data.model.Item
import com.example.foodqueen.domain.repository.ItemRepository

class GetItemsUseCase(private val itemRepository: ItemRepository) {

    suspend fun execute():List<Item>?=itemRepository.getItems()
}
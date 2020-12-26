package com.example.foodqueen.domain.usecase

import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.domain.repository.CartRepository

class GetCartUseCase (private val cartRepository: CartRepository) {
    suspend fun execute(): Cart?=cartRepository.getCart()
}
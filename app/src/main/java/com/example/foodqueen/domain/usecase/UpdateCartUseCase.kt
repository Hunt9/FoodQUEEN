package com.example.foodqueen.domain.usecase

import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.domain.repository.CartRepository

class UpdateCartUseCase (private val cartRepository: CartRepository) {
    suspend fun execute(): AddtoCart?=cartRepository.updateCart()
}
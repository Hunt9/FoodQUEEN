package com.example.foodqueen.presentation.cart

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.foodqueen.domain.usecase.GetCartUseCase
import com.example.foodqueen.domain.usecase.UpdateCartUseCase

class CartViewModel(
        private val getCartUseCase: GetCartUseCase,
        private val updateCartUseCase: UpdateCartUseCase
) : ViewModel() {

    fun getCart() = liveData {
        val cart = getCartUseCase.execute()
        emit(cart)
    }

    fun updateCart() = liveData {
        val myUpdatedCart = updateCartUseCase.execute()
        emit(myUpdatedCart)
    }


}
package com.example.foodqueen.presentation.di.cart

import com.example.foodqueen.domain.usecase.GetCartUseCase
import com.example.foodqueen.domain.usecase.UpdateCartUseCase
import com.example.foodqueen.presentation.cart.CartViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class CartModule {

    @CartScope
    @Provides
    fun provideCartViewModelFactory(
        getCartUseCase: GetCartUseCase,
        updateCartUseCase: UpdateCartUseCase
    ): CartViewModelFactory{

        return CartViewModelFactory(getCartUseCase, updateCartUseCase)
    }

}
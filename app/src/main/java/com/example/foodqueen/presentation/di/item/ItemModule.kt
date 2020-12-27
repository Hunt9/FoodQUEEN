package com.example.foodqueen.presentation.di.item

import com.example.foodqueen.domain.usecase.GetCartUseCase
import com.example.foodqueen.domain.usecase.GetItemsUseCase
import com.example.foodqueen.domain.usecase.UpdateCartUseCase
import com.example.foodqueen.presentation.cart.CartViewModelFactory
import com.example.foodqueen.presentation.item.ItemViewModelFactory
import dagger.Module
import dagger.Provides

@Module
class ItemModule {

    @ItemScope
    @Provides
    fun provideItemViewModelFactory(
        getItemsUseCase: GetItemsUseCase
    ): ItemViewModelFactory{

        return ItemViewModelFactory(getItemsUseCase)
    }

}
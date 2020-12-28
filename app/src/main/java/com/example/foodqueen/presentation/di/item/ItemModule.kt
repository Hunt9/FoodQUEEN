package com.example.foodqueen.presentation.di.item

import com.example.foodqueen.domain.usecase.GetItemsUseCase
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
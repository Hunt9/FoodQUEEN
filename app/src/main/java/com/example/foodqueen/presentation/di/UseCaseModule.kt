package com.example.foodqueen.presentation.di

import com.example.foodqueen.domain.repository.CartRepository
import com.example.foodqueen.domain.repository.ItemRepository
import com.example.foodqueen.domain.usecase.GetCartUseCase
import com.example.foodqueen.domain.usecase.GetItemsUseCase
import com.example.foodqueen.domain.usecase.UpdateCartUseCase
import dagger.Module
import dagger.Provides

@Module
class UseCaseModule {

    @Provides
    fun provideGetItemUseCase(itemRepository: ItemRepository):GetItemsUseCase
    {
        return GetItemsUseCase(itemRepository)
    }

    @Provides
    fun provideGetCartUseCase(cartRepository: CartRepository):GetCartUseCase
    {
        return GetCartUseCase(cartRepository)
    }

    @Provides
    fun provideUpdateCartUseCase(cartRepository: CartRepository,
                                 item_id: Int,
                                 mobile_id: String,
                                 price: Double,
                                 quantity: Int,
                                 unit: String):UpdateCartUseCase
    {
        return UpdateCartUseCase(cartRepository,item_id,mobile_id,price,quantity,unit)
    }

}
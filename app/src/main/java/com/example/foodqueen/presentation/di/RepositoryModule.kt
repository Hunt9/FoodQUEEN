package com.example.foodqueen.presentation.di

import com.example.foodqueen.data.repository.cart.CartRepositoryImpl
import com.example.foodqueen.data.repository.cart.datasource.AddToCartDataSource
import com.example.foodqueen.data.repository.cart.datasource.CartCacheDataSource
import com.example.foodqueen.data.repository.cart.datasource.CartRemoteDataSource
import com.example.foodqueen.data.repository.item.ItemRepositoryImpl
import com.example.foodqueen.data.repository.item.datasource.ItemCacheDataSource
import com.example.foodqueen.data.repository.item.datasource.ItemRemoteDataSource
import com.example.foodqueen.domain.repository.CartRepository
import com.example.foodqueen.domain.repository.ItemRepository
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RepositoryModule {

    @Provides
    @Singleton
    fun provideItemRepository(
        itemRemoteDataSource: ItemRemoteDataSource,
        itemCacheDataSource: ItemCacheDataSource
    ):ItemRepository
    {
        return ItemRepositoryImpl(itemRemoteDataSource,itemCacheDataSource)
    }

    @Provides
    @Singleton
    fun providecartRepository(
        cartRemoteDataSource: CartRemoteDataSource,
        cartCacheDataSource: CartCacheDataSource,
        addToCartDataSource: AddToCartDataSource
    ): CartRepository
    {
        return CartRepositoryImpl(cartRemoteDataSource,cartCacheDataSource,addToCartDataSource)
    }



}
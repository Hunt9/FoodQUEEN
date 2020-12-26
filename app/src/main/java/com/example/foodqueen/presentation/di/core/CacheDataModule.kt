package com.example.foodqueen.presentation.di.core

import com.example.foodqueen.data.repository.cart.datasource.CartCacheDataSource
import com.example.foodqueen.data.repository.cart.datasourceimpl.CartCacheDataSourceImpl
import com.example.foodqueen.data.repository.item.datasource.ItemCacheDataSource
import com.example.foodqueen.data.repository.item.datasourceimpl.ItemCacheDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class CacheDataModule {

    @Singleton
    @Provides
    fun provideItemCacheDataSource():ItemCacheDataSource{
        return ItemCacheDataSourceImpl()
    }

    @Singleton
    @Provides
    fun provideCartCacheDataSource(): CartCacheDataSource {
        return CartCacheDataSourceImpl()
    }
}
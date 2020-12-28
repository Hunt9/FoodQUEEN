package com.example.foodqueen.presentation.di.core

import com.example.foodqueen.data.api.SOService
import com.example.foodqueen.data.repository.cart.datasource.CartRemoteDataSource
import com.example.foodqueen.data.repository.cart.datasourceimpl.AddToCartDataSourceImpl
import com.example.foodqueen.data.repository.cart.datasourceimpl.CartRemoteDataSourceImpl
import com.example.foodqueen.data.repository.item.datasource.ItemRemoteDataSource
import com.example.foodqueen.data.repository.item.datasourceimpl.ItemRemoteDataSourceImpl
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class RemoteDataModule (private val param : String){

    @Singleton
    @Provides
    fun provideItemRemoteDataSource(soService: SOService) : ItemRemoteDataSource {

        return ItemRemoteDataSourceImpl(soService,param)
    }

    @Singleton
    @Provides
    fun provideCartRemoteDataSource(soService: SOService) : CartRemoteDataSource {

        return CartRemoteDataSourceImpl(soService,param)
    }

}
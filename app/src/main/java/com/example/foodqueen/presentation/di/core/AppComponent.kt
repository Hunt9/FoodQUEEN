package com.example.foodqueen.presentation.di.core

import com.example.foodqueen.presentation.di.cart.CartSubComponent
import com.example.foodqueen.presentation.di.item.ItemSubComponent
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AppModule::class,
        CacheDataModule::class,
        NetModule::class,
        RemoteDataModule::class,
        RepositoryModule::class,
        UseCaseModule::class
    ]
)
interface AppComponent {

    fun cartSubComponent():CartSubComponent.Factory
    fun itemSubComponent():ItemSubComponent.Factory

}
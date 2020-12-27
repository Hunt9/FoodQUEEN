package com.example.foodqueen.presentation.di.core

import android.content.Context
import com.example.foodqueen.presentation.di.cart.CartSubComponent
import com.example.foodqueen.presentation.di.item.ItemSubComponent
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module(subcomponents = [CartSubComponent::class,ItemSubComponent::class])
class AppModule (private val context:Context){


    @Singleton
    @Provides
    fun provideApplicationContext():Context{
        return context.applicationContext
    }


}
package com.example.foodqueen.presentation.di

import com.example.foodqueen.presentation.di.cart.CartSubComponent
import com.example.foodqueen.presentation.di.item.ItemSubComponent

interface Injector {
    fun createCartSubComponent():CartSubComponent
    fun createItemSubComponent(): ItemSubComponent
    fun createPizzaComponent(): ItemSubComponent
    fun createSushiComponent(): ItemSubComponent
    fun createDrinkComponent(): ItemSubComponent




}
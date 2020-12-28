package com.example.foodqueen.presentation.di.cart

import com.example.foodqueen.CardFragment
import com.example.foodqueen.CartFragment
import com.example.foodqueen.ItemAdapter
import com.example.foodqueen.viewpager.screens.PizzaFragment
import dagger.Subcomponent

@CartScope
@Subcomponent(modules = [CartModule::class])
interface CartSubComponent {
//    fun inject (cartFragment: CartFragment)
    fun inject (cardFragment: CardFragment)

    @Subcomponent.Factory
    interface Factory{
        fun create():CartSubComponent
    }
}
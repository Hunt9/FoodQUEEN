package com.example.foodqueen.presentation.di.cart

import com.example.foodqueen.CartFragment
import dagger.Subcomponent

@CartScope
@Subcomponent(modules = [CartModule::class])
interface CartSubComponent {
    fun inject (cartFragment: CartFragment)

    @Subcomponent.Factory
    interface Factory{
        fun create():CartSubComponent
    }
}
package com.example.foodqueen.presentation.di.item

import com.example.foodqueen.viewpager.screens.DrinksFragment
import com.example.foodqueen.viewpager.screens.PizzaFragment
import com.example.foodqueen.viewpager.screens.SushiFragment
import dagger.Subcomponent

@ItemScope
@Subcomponent(modules = [ItemModule::class])
interface ItemSubComponent {
    fun inject (pizzaFragment: PizzaFragment)
    fun inject (sushiFragment: SushiFragment)
    fun inject (drinksFragment: DrinksFragment)

    @Subcomponent.Factory
    interface Factory{
        fun create():ItemSubComponent
    }
}
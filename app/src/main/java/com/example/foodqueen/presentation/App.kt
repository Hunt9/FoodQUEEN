package com.example.foodqueen.presentation

import android.app.Application
import com.example.foodqueen.presentation.di.Injector
import com.example.foodqueen.presentation.di.cart.CartSubComponent
import com.example.foodqueen.presentation.di.core.*
import com.example.foodqueen.presentation.di.item.ItemSubComponent

class App : Application(),Injector {

    private lateinit var appComponent: AppComponent

    override fun onCreate() {
        super.onCreate()


    }

    override fun createCartSubComponent(): CartSubComponent {
        return appComponent.cartSubComponent().create()
    }

    override fun createItemSubComponent(): ItemSubComponent {
        return appComponent.itemSubComponent().create()
    }

    override fun createPizzaComponent(): ItemSubComponent {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule("http://dailyfresh.circlesltd.ml/Api/"))
                .remoteDataModule(RemoteDataModule("Pizzas"))
                .build()
        return appComponent.itemSubComponent().create()
    }

    override fun createSushiComponent(): ItemSubComponent {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule("http://dailyfresh.circlesltd.ml/Api/"))
                .remoteDataModule(RemoteDataModule("Sushis"))
                .build()
        return appComponent.itemSubComponent().create()
    }

    override fun createDrinkComponent(): ItemSubComponent {
        appComponent = DaggerAppComponent.builder()
                .appModule(AppModule(applicationContext))
                .netModule(NetModule("http://dailyfresh.circlesltd.ml/Api/"))
                .remoteDataModule(RemoteDataModule("Drinks"))
                .build()
        return appComponent.itemSubComponent().create()
    }





}
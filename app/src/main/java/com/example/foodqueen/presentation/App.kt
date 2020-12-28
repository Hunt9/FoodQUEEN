package com.example.foodqueen.presentation

import android.annotation.SuppressLint
import android.app.Application
import android.provider.Settings.Secure
import android.util.Log
import com.example.foodqueen.presentation.di.Injector
import com.example.foodqueen.presentation.di.cart.CartSubComponent
import com.example.foodqueen.presentation.di.core.*
import com.example.foodqueen.presentation.di.item.ItemSubComponent
import java.security.AccessController.getContext


class App : Application(),Injector {

    private lateinit var appComponent: AppComponent

    private var android_id = ""

    @SuppressLint("HardwareIds")
    override fun onCreate() {
        super.onCreate()

        android_id = Secure.getString(
            applicationContext.contentResolver,
            Secure.ANDROID_ID)

        Log.i("DeviceID---------->" , android_id)
    }

    override fun createCartSubComponent(): CartSubComponent {
        appComponent = DaggerAppComponent.builder()
            .appModule(AppModule(applicationContext))
            .netModule(NetModule("http://dailyfresh.circlesltd.ml/Api/"))
            .remoteDataModule(RemoteDataModule("aeece1e5ca341c52"))
            .build()
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
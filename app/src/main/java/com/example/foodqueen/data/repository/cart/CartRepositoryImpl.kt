package com.example.foodqueen.data.repository.cart

import android.util.Log
import com.example.foodqueen.data.model.AddtoCart
import com.example.foodqueen.data.model.Cart
import com.example.foodqueen.data.repository.cart.datasource.AddToCartDataSource
import com.example.foodqueen.data.repository.cart.datasource.CartCacheDataSource
import com.example.foodqueen.data.repository.cart.datasource.CartRemoteDataSource
import com.example.foodqueen.domain.repository.CartRepository
import retrofit2.Response
import java.lang.Exception

class CartRepositoryImpl(
    private val cartRemoteDataSource: CartRemoteDataSource,
    private val cartCacheDataSource: CartCacheDataSource,
    private val addToCartDataSource: AddToCartDataSource
) : CartRepository {
    override suspend fun getCart(): Cart {
        return getCartFromCache()
    }

    override suspend fun updateCart(
        item_id: Int,
        mobile_id: String,
        price: Double,
        quantity: Int,
        unit: String
    ): AddtoCart {

        return updateCartFromAPI()
    }


    suspend fun getCartFromAPI(): Cart {
        lateinit var myCart: Cart
        try {
            val response: Response<Cart> = cartRemoteDataSource.getCart()
            val body: Cart? = response.body()

            if (body != null && body.statusMessage.equals("Successfull")) {
                myCart = body
            }

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        return myCart
    }


    suspend fun getCartFromCache(): Cart {
        lateinit var myCart: Cart
        try {
            myCart = cartCacheDataSource.getCartFromCache()

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        if (myCart.cartItems.size > 0) {
            return myCart
        } else {
            myCart = getCartFromAPI()
            cartCacheDataSource.saveCartFromCache(myCart)
        }

        return myCart

    }

    suspend fun updateCartFromAPI(): AddtoCart {
        lateinit var myAddtoCart: AddtoCart
        try {
            val response: Response<AddtoCart> =  addToCartDataSource.updateCart()
            val body: AddtoCart? = response.body()

            if (body != null && body.statusMessage.equals("Successfull")) {
                myAddtoCart = body
            }

        } catch (exception: Exception) {
            Log.i("MyTag", exception.message.toString())
        }

        return myAddtoCart
    }

}
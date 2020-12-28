package com.example.foodqueen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodqueen.data.model.CartItem
import com.example.foodqueen.data.model.Item
import com.example.foodqueen.databinding.ItemMenuLayoutBinding
import com.example.foodqueen.databinding.ItemOrderBinding

import java.util.ArrayList

class OrderAdapter : RecyclerView.Adapter<OrderViewHolder>() {
    private val cartList = ArrayList<CartItem>()

    fun setList(cart: List<CartItem>) {
        cartList.clear()
        cartList.addAll(cartList)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): OrderViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemOrderBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_order, parent, false)

        return OrderViewHolder(binding)

    }

//    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
//        holder.bind(cartList[position])
//    }

    override fun getItemCount(): Int {
        return cartList.size
    }

    override fun onBindViewHolder(holder: OrderViewHolder, position: Int) {
        holder.bind(cartList[position])
    }


}

class OrderViewHolder(val binding: ItemOrderBinding) : RecyclerView.ViewHolder(binding.root) {
    fun bind(cartItem: CartItem) {
        binding.Name.text = cartItem.name
        binding.Quantity.text = cartItem.quantity

        Glide.with(binding.Image.context).load(cartItem.image).into(binding.Image)


    }


}
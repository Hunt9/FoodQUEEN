package com.example.foodqueen

import android.content.Context
import android.content.res.ColorStateList
import android.graphics.Color
import android.graphics.Color.green
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodqueen.data.model.Item
import com.example.foodqueen.databinding.ItemMenuLayoutBinding
import com.example.foodqueen.presentation.cart.CartViewModel
import com.example.foodqueen.presentation.cart.CartViewModelFactory
import com.example.foodqueen.presentation.di.Injector
import com.example.foodqueen.presentation.item.ItemViewModel
import com.example.foodqueen.presentation.item.ItemViewModelFactory
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.util.ArrayList
import javax.inject.Inject

class ItemAdapter : RecyclerView.Adapter<MyViewHolder>() {
    private val itemList = ArrayList<Item>()

    fun setList(items: List<Item>) {
        itemList.clear()
        itemList.addAll(items)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding: ItemMenuLayoutBinding =
            DataBindingUtil.inflate(layoutInflater, R.layout.item_menu_layout, parent, false)

        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}

class MyViewHolder(val binding: ItemMenuLayoutBinding) : RecyclerView.ViewHolder(binding.root)
{
    fun bind(item: Item) {
        binding.ItemName.text = item.name
        binding.ItemDescription.text = item.urduName
        binding.ItemPrice.text = item.priceKG
        binding.ItemUnit.text = item.priceGRAM

        Glide.with(binding.ItemImage.context).load(item.image).into(binding.ItemImage)


        binding.CardView.setOnClickListener {
            binding.CardView.setCardBackgroundColor(
                ContextCompat.getColor(
                    itemView.context,
                    R.color.green
                )
            )
            GlobalScope.launch {

                binding.ItemPrice.text = "+1 added"
                delay(1000)
                binding.CardView.setCardBackgroundColor(Color.BLACK)
                binding.ItemPrice.text = item.priceKG
            }
        }

    }


}
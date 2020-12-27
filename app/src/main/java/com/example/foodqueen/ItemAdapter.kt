package com.example.foodqueen

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.foodqueen.data.model.Item
import com.example.foodqueen.databinding.ItemMenuLayoutBinding
import java.util.ArrayList

class ItemAdapter :RecyclerView.Adapter<MyViewHolder>() {
    private val itemList = ArrayList<Item>()

    fun setList(items: List<Item>)
    {
        itemList.clear()
        itemList.addAll(items)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layoutInflater: LayoutInflater = LayoutInflater.from(parent.context)
        val binding : ItemMenuLayoutBinding = DataBindingUtil.inflate(layoutInflater,R.layout.item_menu_layout,parent,false)

        return MyViewHolder(binding)

    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(itemList[position])
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}

class MyViewHolder(val binding: ItemMenuLayoutBinding):RecyclerView.ViewHolder(binding.root){

    fun bind(item:Item)
    {
        binding.ItemName.text = item.name
        binding.ItemDescription.text = item.urduName
        binding.ItemPrice.text = item.priceKG
        binding.ItemUnit.text = item.priceGRAM

        Glide.with(binding.ItemImage.context).load(item.image).into(binding.ItemImage)


    }

}
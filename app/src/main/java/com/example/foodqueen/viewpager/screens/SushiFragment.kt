package com.example.foodqueen.viewpager.screens

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.foodqueen.R
import com.example.foodqueen.databinding.FragmentPizzaBinding
import com.example.foodqueen.databinding.FragmentSushiBinding
import com.example.foodqueen.presentation.di.Injector
import com.example.foodqueen.presentation.item.ItemViewModel
import com.example.foodqueen.presentation.item.ItemViewModelFactory
import javax.inject.Inject

class SushiFragment : Fragment() {


    @Inject
    lateinit var factory: ItemViewModelFactory
    private lateinit var itemViewModel: ItemViewModel

    private lateinit var binding: FragmentSushiBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_sushi, container, false)

        (activity?.application as Injector).createSushiComponent().inject(this)

        itemViewModel = ViewModelProvider(this,factory).get(ItemViewModel::class.java)
        val responseLiveData = itemViewModel.getItems()
        responseLiveData.observe(viewLifecycleOwner, Observer {
            Log.i("MYTAG-SUSHI",it.toString() )
        })



        return binding.root
    }

}
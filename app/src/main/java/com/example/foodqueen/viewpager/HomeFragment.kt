package com.example.foodqueen.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.foodqueen.R
import com.example.foodqueen.databinding.FragmentHomeBinding
import com.synnapps.carouselview.ImageListener





class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    var slideImages = intArrayOf(
        R.drawable.slideone,
        R.drawable.slidetwo,
        R.drawable.slidethree,
    )

    var imageListener =
        ImageListener { position, imageView -> imageView.setImageResource(slideImages.get(position)) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        binding.carouselView.pageCount = slideImages.size
        binding.carouselView.setImageListener(imageListener)

        return binding.root
    }



}
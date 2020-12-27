package com.example.foodqueen.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.fragment.app.Fragment
import com.example.foodqueen.R
import com.example.foodqueen.databinding.FragmentHomeBinding
import com.example.foodqueen.viewpager.screens.DrinksFragment
import com.example.foodqueen.viewpager.screens.PizzaFragment
import com.example.foodqueen.viewpager.screens.SushiFragment
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator
import com.synnapps.carouselview.ImageListener
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch


class HomeFragment : Fragment() {
    private lateinit var binding: FragmentHomeBinding

    var slideImages = intArrayOf(
            R.drawable.slideone,
            R.drawable.slidetwo,
            R.drawable.slidethree,
    )

    private val titles = arrayOf("Movies", "Events", "Tickets")

    var imageListener =
        ImageListener { position, imageView -> imageView.setImageResource(slideImages.get(position)) }


    override fun onCreateView(
            inflater: LayoutInflater, container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_home, container, false)

        GlobalScope.launch {
            binding.carouselView.pageCount = slideImages.size
            binding.carouselView.setImageListener(imageListener)}

        val fragmentList = arrayListOf<Fragment>(
                PizzaFragment(),
                SushiFragment(),
                DrinksFragment()
        )


        val adapter = ViewPagerAdapter(fragmentList, requireActivity().supportFragmentManager, lifecycle)

        binding.viewpager.adapter = adapter



        TabLayoutMediator(binding.tabs, binding.viewpager)
        { tab: TabLayout.Tab, position: Int -> tab.setText(titles.get(position))
        }.attach()


        return binding.root
    }



}
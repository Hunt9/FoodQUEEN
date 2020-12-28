package com.example.foodqueen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.foodqueen.databinding.FragmentCardBinding
import com.example.foodqueen.databinding.FragmentDrinksBinding
import com.example.foodqueen.databinding.FragmentPizzaBinding
import com.example.foodqueen.presentation.cart.CartViewModel
import com.example.foodqueen.presentation.cart.CartViewModelFactory
import com.example.foodqueen.presentation.di.Injector
import com.example.foodqueen.presentation.item.ItemViewModel
import com.example.foodqueen.presentation.item.ItemViewModelFactory
import javax.inject.Inject

class CardFragment : Fragment() {


//    @Inject
//    lateinit var factory: CartViewModelFactory
//    private lateinit var cartViewModel: CartViewModel
//    private lateinit var adapter: OrderAdapter
    private lateinit var binding: FragmentCardBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_card, container, false)

        binding.Next.setOnClickListener{
            this.findNavController().navigate(R.id.action_cardFragment_to_orderFragment)

        }

//        (activity?.application as Injector).createCartSubComponent().inject(this)
//
//        cartViewModel = ViewModelProvider(this,factory).get(CartViewModel::class.java)
//
//        initRecyclerView()


        return binding.root
    }


//    private fun initRecyclerView(){
//        binding.Orders.layoutManager = LinearLayoutManager(activity)
//        adapter = OrderAdapter()
//        binding.Orders.adapter = adapter
//        showItem()
//
//    }
//
//    private fun showItem(){
//        val responseLiveData = cartViewModel.getCart()
//        responseLiveData.observe(viewLifecycleOwner, Observer {
//            if(it!=null)
//            {
//                adapter.setList(it.cartItems)
//                adapter.notifyDataSetChanged()
//            }
//        })
//    }

}
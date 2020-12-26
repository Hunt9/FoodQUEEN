package com.example.foodqueen.presentation.item

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import com.example.foodqueen.domain.usecase.GetItemsUseCase

class ItemViewModel(
        private val getItemsUseCase: GetItemsUseCase
) : ViewModel() {

    fun getItems() = liveData {
        val itemsList = getItemsUseCase.execute()
        emit(itemsList)
    }
}
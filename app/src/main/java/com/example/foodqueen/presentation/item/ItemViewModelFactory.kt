package com.example.foodqueen.presentation.item

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.foodqueen.domain.usecase.GetItemsUseCase

class ItemViewModelFactory(
    private val getItemsUseCase: GetItemsUseCase
) : ViewModelProvider.Factory {
    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return ItemViewModel(getItemsUseCase) as T
    }
}
package com.example.laba_4.ui.viewmodel

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class CityViewModel : ViewModel() {

    var selectedCategoryId: String by mutableStateOf("coffee")
        private set

    fun selectCategory(id: String) {
        selectedCategoryId = id
    }
}

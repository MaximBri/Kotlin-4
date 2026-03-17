package com.example.laba_4.data.model

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Category(
    val id: String,
    @StringRes val nameResId: Int,
    val icon: ImageVector
)

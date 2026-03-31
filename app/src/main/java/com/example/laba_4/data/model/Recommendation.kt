package com.example.laba_4.data.model

import androidx.annotation.StringRes
import androidx.compose.ui.graphics.vector.ImageVector

data class Recommendation(
    val id: String,
    val categoryId: String,
    @StringRes val nameResId: Int,
    @StringRes val shortDescriptionResId: Int,
    @StringRes val fullDescriptionResId: Int,
    @StringRes val addressResId: Int,
    val rating: Float,
    val icon: ImageVector
)

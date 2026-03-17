package com.example.laba_4.data.model

import androidx.compose.ui.graphics.vector.ImageVector

data class Recommendation(
    val id: String,
    val categoryId: String,
    val name: String,
    val shortDescription: String,
    val fullDescription: String,
    val address: String,
    val rating: Float,
    val icon: ImageVector
)

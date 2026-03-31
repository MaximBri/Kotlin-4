package com.example.laba_4.data

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountBalance
import androidx.compose.material.icons.filled.ChildCare
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Forest
import androidx.compose.material.icons.filled.LocalCafe
import androidx.compose.material.icons.filled.LocalFlorist
import androidx.compose.material.icons.filled.LocalMall
import androidx.compose.material.icons.filled.NaturePeople
import androidx.compose.material.icons.filled.Park
import androidx.compose.material.icons.filled.Restaurant
import androidx.compose.material.icons.filled.ShoppingBag
import androidx.compose.material.icons.filled.ShoppingCart
import androidx.compose.material.icons.filled.SportsEsports
import androidx.compose.material.icons.filled.Star
import androidx.compose.material.icons.filled.Store
import com.example.laba_4.R
import com.example.laba_4.data.model.Category
import com.example.laba_4.data.model.Recommendation

object DataSource {

    val categories = listOf(
        Category(id = "coffee", nameResId = R.string.category_coffee, icon = Icons.Filled.Coffee),
        Category(id = "restaurants", nameResId = R.string.category_restaurants, icon = Icons.Filled.Restaurant),
        Category(id = "parks", nameResId = R.string.category_parks, icon = Icons.Filled.Park),
        Category(id = "shopping", nameResId = R.string.category_shopping, icon = Icons.Filled.ShoppingBag),
        Category(id = "kids", nameResId = R.string.category_kids, icon = Icons.Filled.ChildCare)
    )

    val recommendations = listOf(
        // кофейни
        Recommendation(
            id = "coffee_1",
            categoryId = "coffee",
            nameResId = R.string.recommendation_coffee_1_name,
            shortDescriptionResId = R.string.recommendation_coffee_1_short_description,
            fullDescriptionResId = R.string.recommendation_coffee_1_full_description,
            addressResId = R.string.recommendation_coffee_1_address,
            rating = 4.5f,
            icon = Icons.Filled.Coffee
        ),
        Recommendation(
            id = "coffee_2",
            categoryId = "coffee",
            nameResId = R.string.recommendation_coffee_2_name,
            shortDescriptionResId = R.string.recommendation_coffee_2_short_description,
            fullDescriptionResId = R.string.recommendation_coffee_2_full_description,
            addressResId = R.string.recommendation_coffee_2_address,
            rating = 4.7f,
            icon = Icons.Filled.LocalCafe
        ),
        Recommendation(
            id = "coffee_3",
            categoryId = "coffee",
            nameResId = R.string.recommendation_coffee_3_name,
            shortDescriptionResId = R.string.recommendation_coffee_3_short_description,
            fullDescriptionResId = R.string.recommendation_coffee_3_full_description,
            addressResId = R.string.recommendation_coffee_3_address,
            rating = 4.6f,
            icon = Icons.Filled.Coffee
        ),
        Recommendation(
            id = "coffee_4",
            categoryId = "coffee",
            nameResId = R.string.recommendation_coffee_4_name,
            shortDescriptionResId = R.string.recommendation_coffee_4_short_description,
            fullDescriptionResId = R.string.recommendation_coffee_4_full_description,
            addressResId = R.string.recommendation_coffee_4_address,
            rating = 4.8f,
            icon = Icons.Filled.LocalCafe
        ),
        Recommendation(
            id = "coffee_5",
            categoryId = "coffee",
            nameResId = R.string.recommendation_coffee_5_name,
            shortDescriptionResId = R.string.recommendation_coffee_5_short_description,
            fullDescriptionResId = R.string.recommendation_coffee_5_full_description,
            addressResId = R.string.recommendation_coffee_5_address,
            rating = 4.7f,
            icon = Icons.Filled.Coffee
        ),

        // рестораны
        Recommendation(
            id = "rest_1",
            categoryId = "restaurants",
            nameResId = R.string.recommendation_rest_1_name,
            shortDescriptionResId = R.string.recommendation_rest_1_short_description,
            fullDescriptionResId = R.string.recommendation_rest_1_full_description,
            addressResId = R.string.recommendation_rest_1_address,
            rating = 4.8f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_2",
            categoryId = "restaurants",
            nameResId = R.string.recommendation_rest_2_name,
            shortDescriptionResId = R.string.recommendation_rest_2_short_description,
            fullDescriptionResId = R.string.recommendation_rest_2_full_description,
            addressResId = R.string.recommendation_rest_2_address,
            rating = 4.7f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_3",
            categoryId = "restaurants",
            nameResId = R.string.recommendation_rest_3_name,
            shortDescriptionResId = R.string.recommendation_rest_3_short_description,
            fullDescriptionResId = R.string.recommendation_rest_3_full_description,
            addressResId = R.string.recommendation_rest_3_address,
            rating = 4.5f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_4",
            categoryId = "restaurants",
            nameResId = R.string.recommendation_rest_4_name,
            shortDescriptionResId = R.string.recommendation_rest_4_short_description,
            fullDescriptionResId = R.string.recommendation_rest_4_full_description,
            addressResId = R.string.recommendation_rest_4_address,
            rating = 4.6f,
            icon = Icons.Filled.Restaurant
        ),
        Recommendation(
            id = "rest_5",
            categoryId = "restaurants",
            nameResId = R.string.recommendation_rest_5_name,
            shortDescriptionResId = R.string.recommendation_rest_5_short_description,
            fullDescriptionResId = R.string.recommendation_rest_5_full_description,
            addressResId = R.string.recommendation_rest_5_address,
            rating = 4.6f,
            icon = Icons.Filled.Restaurant
        ),

        // парки
        Recommendation(
            id = "park_1",
            categoryId = "parks",
            nameResId = R.string.recommendation_park_1_name,
            shortDescriptionResId = R.string.recommendation_park_1_short_description,
            fullDescriptionResId = R.string.recommendation_park_1_full_description,
            addressResId = R.string.recommendation_park_1_address,
            rating = 4.7f,
            icon = Icons.Filled.Park
        ),
        Recommendation(
            id = "park_2",
            categoryId = "parks",
            nameResId = R.string.recommendation_park_2_name,
            shortDescriptionResId = R.string.recommendation_park_2_short_description,
            fullDescriptionResId = R.string.recommendation_park_2_full_description,
            addressResId = R.string.recommendation_park_2_address,
            rating = 4.8f,
            icon = Icons.Filled.NaturePeople
        ),
        Recommendation(
            id = "park_3",
            categoryId = "parks",
            nameResId = R.string.recommendation_park_3_name,
            shortDescriptionResId = R.string.recommendation_park_3_short_description,
            fullDescriptionResId = R.string.recommendation_park_3_full_description,
            addressResId = R.string.recommendation_park_3_address,
            rating = 4.5f,
            icon = Icons.Filled.LocalFlorist
        ),
        Recommendation(
            id = "park_4",
            categoryId = "parks",
            nameResId = R.string.recommendation_park_4_name,
            shortDescriptionResId = R.string.recommendation_park_4_short_description,
            fullDescriptionResId = R.string.recommendation_park_4_full_description,
            addressResId = R.string.recommendation_park_4_address,
            rating = 4.6f,
            icon = Icons.Filled.Forest
        ),
        Recommendation(
            id = "park_5",
            categoryId = "parks",
            nameResId = R.string.recommendation_park_5_name,
            shortDescriptionResId = R.string.recommendation_park_5_short_description,
            fullDescriptionResId = R.string.recommendation_park_5_full_description,
            addressResId = R.string.recommendation_park_5_address,
            rating = 4.5f,
            icon = Icons.Filled.Park
        ),

        // тц
        Recommendation(
            id = "shop_1",
            categoryId = "shopping",
            nameResId = R.string.recommendation_shop_1_name,
            shortDescriptionResId = R.string.recommendation_shop_1_short_description,
            fullDescriptionResId = R.string.recommendation_shop_1_full_description,
            addressResId = R.string.recommendation_shop_1_address,
            rating = 4.5f,
            icon = Icons.Filled.LocalMall
        ),
        Recommendation(
            id = "shop_2",
            categoryId = "shopping",
            nameResId = R.string.recommendation_shop_2_name,
            shortDescriptionResId = R.string.recommendation_shop_2_short_description,
            fullDescriptionResId = R.string.recommendation_shop_2_full_description,
            addressResId = R.string.recommendation_shop_2_address,
            rating = 4.3f,
            icon = Icons.Filled.ShoppingCart
        ),
        Recommendation(
            id = "shop_3",
            categoryId = "shopping",
            nameResId = R.string.recommendation_shop_3_name,
            shortDescriptionResId = R.string.recommendation_shop_3_short_description,
            fullDescriptionResId = R.string.recommendation_shop_3_full_description,
            addressResId = R.string.recommendation_shop_3_address,
            rating = 4.4f,
            icon = Icons.Filled.ShoppingBag
        ),
        Recommendation(
            id = "shop_4",
            categoryId = "shopping",
            nameResId = R.string.recommendation_shop_4_name,
            shortDescriptionResId = R.string.recommendation_shop_4_short_description,
            fullDescriptionResId = R.string.recommendation_shop_4_full_description,
            addressResId = R.string.recommendation_shop_4_address,
            rating = 4.3f,
            icon = Icons.Filled.Store
        ),
        Recommendation(
            id = "shop_5",
            categoryId = "shopping",
            nameResId = R.string.recommendation_shop_5_name,
            shortDescriptionResId = R.string.recommendation_shop_5_short_description,
            fullDescriptionResId = R.string.recommendation_shop_5_full_description,
            addressResId = R.string.recommendation_shop_5_address,
            rating = 4.2f,
            icon = Icons.Filled.Store
        ),

        // дети
        Recommendation(
            id = "kids_1",
            categoryId = "kids",
            nameResId = R.string.recommendation_kids_1_name,
            shortDescriptionResId = R.string.recommendation_kids_1_short_description,
            fullDescriptionResId = R.string.recommendation_kids_1_full_description,
            addressResId = R.string.recommendation_kids_1_address,
            rating = 4.5f,
            icon = Icons.Filled.NaturePeople
        ),
        Recommendation(
            id = "kids_2",
            categoryId = "kids",
            nameResId = R.string.recommendation_kids_2_name,
            shortDescriptionResId = R.string.recommendation_kids_2_short_description,
            fullDescriptionResId = R.string.recommendation_kids_2_full_description,
            addressResId = R.string.recommendation_kids_2_address,
            rating = 4.8f,
            icon = Icons.Filled.AccountBalance
        ),
        Recommendation(
            id = "kids_3",
            categoryId = "kids",
            nameResId = R.string.recommendation_kids_3_name,
            shortDescriptionResId = R.string.recommendation_kids_3_short_description,
            fullDescriptionResId = R.string.recommendation_kids_3_full_description,
            addressResId = R.string.recommendation_kids_3_address,
            rating = 4.4f,
            icon = Icons.Filled.SportsEsports
        ),
        Recommendation(
            id = "kids_4",
            categoryId = "kids",
            nameResId = R.string.recommendation_kids_4_name,
            shortDescriptionResId = R.string.recommendation_kids_4_short_description,
            fullDescriptionResId = R.string.recommendation_kids_4_full_description,
            addressResId = R.string.recommendation_kids_4_address,
            rating = 4.6f,
            icon = Icons.Filled.Star
        ),
        Recommendation(
            id = "kids_5",
            categoryId = "kids",
            nameResId = R.string.recommendation_kids_5_name,
            shortDescriptionResId = R.string.recommendation_kids_5_short_description,
            fullDescriptionResId = R.string.recommendation_kids_5_full_description,
            addressResId = R.string.recommendation_kids_5_address,
            rating = 4.7f,
            icon = Icons.Filled.ChildCare
        )
    )

    fun getCategory(id: String): Category? = categories.find { it.id == id }

    fun getRecommendationsByCategory(categoryId: String): List<Recommendation> =
        recommendations.filter { it.categoryId == categoryId }

    fun getRecommendation(id: String): Recommendation? = recommendations.find { it.id == id }
}

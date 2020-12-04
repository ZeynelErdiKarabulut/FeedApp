/*
 * Copyright (c) 2020 Zeynel Erdi
 */

package com.feedapp.app.viewModels

import androidx.lifecycle.ViewModel
import com.feedapp.app.data.repositories.FoodRepository
import javax.inject.Inject

class MyMealsSearchViewModel @Inject constructor(private val foodRepository: FoodRepository) :
    ViewModel() {

    val myProducts = foodRepository.myProducts

    fun updateProducts() =
        foodRepository.updateProducts()

}
/*
 * Copyright (c) 2020 Zeynel Erdi
 */

package com.feedapp.app.di.modules

import com.feedapp.app.data.databases.daos.FoodProductDao
import com.feedapp.app.data.repositories.SearchFoodRepository
import dagger.Module
import dagger.Provides


@Module
class ProductSearchModule {

    @Provides
    fun provideSearchFoodRepository(
        foodProductDao: FoodProductDao
    ): SearchFoodRepository {
        return SearchFoodRepository(foodProductDao)
    }


}

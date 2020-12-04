/* * Copyright (c) 2020 Zeynel Erdi */package com.feedapp.app.data.models.day/** * Class to convert [Day] to hashMap for storing in Firebase */class DayToHashMapConverter {    fun convertToHashMap(day: Day): HashMap<String, Any> {        val mealsToSave = listOf(            hashMapOf(                "id" to day.meals[0].id,                "mealType" to day.meals[0].mealType,                "products" to day.meals[0].products            ),            hashMapOf(                "id" to day.meals[1].id,                "mealType" to day.meals[1].mealType,                "products" to day.meals[1].products            ),            hashMapOf(                "id" to day.meals[2].id,                "mealType" to day.meals[2].mealType,                "products" to day.meals[2].products            ),            hashMapOf(                "id" to day.meals[3].id,                "mealType" to day.meals[3].mealType,                "products" to day.meals[3].products            )        )        return hashMapOf(            "meals" to mealsToSave,            "dayId" to day.dayId,            "date" to day.date,            "waterNum" to day.waterNum        )    }}
package com.centennial.mapd711.assignment2.ui.explore

import com.centennial.mapd711.assignment2.model.ProductModel
import com.centennial.mapd711.assignment2.repo.ExploreRepository

class ExploreViewModel(private val repository: ExploreRepository) {

    fun getList(type: String): ArrayList<ProductModel> {
        return when (type) {
            "iphone" -> {
                repository.getIphoneList()
            }
            "samsung" -> {
                repository.getSamsungList()
            }
            "google" -> {
                repository.getGoogle()
            }
            "oppo" -> {
                repository.getOppo()
            }
            else -> {
                ArrayList()
            }
        }
    }

}
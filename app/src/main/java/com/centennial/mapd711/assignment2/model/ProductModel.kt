package com.centennial.mapd711.assignment2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class ProductModel(
    var name: String,
    var price: String,
    var image: String,
    var type: String? = "",
    var storage: String? = "",
    var color: String? = "",
    var user: UserModel? = null

) : Parcelable

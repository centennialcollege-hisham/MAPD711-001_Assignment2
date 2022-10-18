package com.centennial.mapd711.assignment2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class CreditCardModel(
    var number: String,
    var type: String,
    var expire: String,
    var cvv: String
) : Parcelable

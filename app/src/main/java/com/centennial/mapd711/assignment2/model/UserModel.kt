package com.centennial.mapd711.assignment2.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserModel(
    var name: String,
    var address: String,
    var city: String,
    var postalCode: String,
    var phoneNumber: String,
    var creditCard: CreditCardModel
) : Parcelable

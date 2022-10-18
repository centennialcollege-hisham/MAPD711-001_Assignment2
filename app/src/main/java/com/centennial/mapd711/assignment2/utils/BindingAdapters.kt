package com.centennial.mapd711.assignment2.utils

import android.widget.ImageView
import androidx.databinding.BindingAdapter
import coil.load

@BindingAdapter("imageUrl")
fun ImageView.imageUrl(url: String?) {
    load(url)
}

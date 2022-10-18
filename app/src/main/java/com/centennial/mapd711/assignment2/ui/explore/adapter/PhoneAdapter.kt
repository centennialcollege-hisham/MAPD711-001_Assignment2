package com.centennial.mapd711.assignment2.ui.explore.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import com.centennial.mapd711.assignment2.model.ProductModel
import com.centennial.mapd711.assignment2.databinding.RowPhoneModelBinding

class PhoneAdapter(private val list: ArrayList<ProductModel>) : BaseAdapter() {
    override fun getCount(): Int {
        return list.size
    }
    override fun getItem(position: Int): ProductModel {
        return list[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        // Get view for row item
        var binding = RowPhoneModelBinding.inflate(LayoutInflater.from(parent.context))
        binding.data = getItem(position)
        return binding.root
    }


}
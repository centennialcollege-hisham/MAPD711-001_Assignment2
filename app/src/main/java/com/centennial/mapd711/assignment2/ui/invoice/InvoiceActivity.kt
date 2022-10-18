package com.centennial.mapd711.assignment2.ui.invoice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.view.View
import com.centennial.mapd711.assignment2.ui.payment.PaymentActivity
import android.widget.ArrayAdapter
import android.widget.AdapterView
import android.widget.RadioButton
import androidx.appcompat.R
import com.centennial.mapd711.assignment2.databinding.ActivityDetailsBinding
import com.centennial.mapd711.assignment2.databinding.ActivityInvoiceBinding
import com.centennial.mapd711.assignment2.model.ProductModel
import java.util.ArrayList

class InvoiceActivity : AppCompatActivity() {
    private lateinit var binding: ActivityInvoiceBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityInvoiceBinding.inflate(layoutInflater)
        setContentView(binding.root)
        getData().toString()
        binding.model = getData()


    }

    private fun getData(): ProductModel {
        return intent.getParcelableExtra("key_product")!!
    }

}
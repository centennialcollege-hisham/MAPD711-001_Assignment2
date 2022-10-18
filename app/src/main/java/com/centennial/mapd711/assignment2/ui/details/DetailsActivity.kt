package com.centennial.mapd711.assignment2.ui.details

import android.content.Intent
import android.os.Bundle
import android.widget.RadioButton
import androidx.appcompat.app.AppCompatActivity
import com.centennial.mapd711.assignment2.databinding.ActivityDetailsBinding
import com.centennial.mapd711.assignment2.model.ProductModel
import com.centennial.mapd711.assignment2.ui.payment.PaymentActivity

class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)
getData()
        initListener(getData())
    }

    private fun getData(): ProductModel? {
        return intent.getParcelableExtra("key_product")
    }

    private fun initListener(product: ProductModel?) {
        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, PaymentActivity::class.java)
            product?.storage = getSelectedStorage()
            product?.color = getSelectedColor()
            intent.putExtra("key_product", product)
            startActivity(intent)
        }
    }

    private fun getSelectedStorage(): String {
        val radioId: Int = binding.radioGroup.checkedRadioButtonId
        return findViewById<RadioButton>(radioId).text.toString()
    }

    private fun getSelectedColor(): String {
        return binding.spinnerColor.selectedItem.toString()
    }

}
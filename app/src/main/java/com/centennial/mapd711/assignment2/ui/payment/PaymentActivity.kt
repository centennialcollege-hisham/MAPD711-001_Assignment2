package com.centennial.mapd711.assignment2.ui.payment

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.centennial.mapd711.assignment2.databinding.ActivityPaymentBinding
import com.centennial.mapd711.assignment2.model.CreditCardModel
import com.centennial.mapd711.assignment2.model.ProductModel
import com.centennial.mapd711.assignment2.model.UserModel
import com.centennial.mapd711.assignment2.ui.invoice.InvoiceActivity

class PaymentActivity : AppCompatActivity() {
    lateinit var binding: ActivityPaymentBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initListener(getData())
    }

    private fun getData(): ProductModel {
        return intent.getParcelableExtra("key_product")!!
    }

    private fun initListener(product: ProductModel) {
        binding.btnSubmit.setOnClickListener {
            val intent = Intent(this, InvoiceActivity::class.java)
            fillProduct(product)
            intent.putExtra("key_product", product)
            startActivity(intent)
        }
    }

    private fun fillProduct(product: ProductModel) {
        val creditCard = CreditCardModel(
            binding.etCreditNumber.text.toString(),
            binding.etCreditType.text.toString(),
            binding.etCreditExpire.text.toString(),
            binding.etCreditCvv.text.toString()
        )

        val user = UserModel(
            binding.etName.text.toString(),
            binding.etAddress.text.toString(),
            binding.etCity.text.toString(),
            binding.etPostalCode.text.toString(),
            binding.etPhoneNumber.text.toString(),
            creditCard
        )

        product.user = user

    }

}
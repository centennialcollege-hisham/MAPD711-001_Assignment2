package com.centennial.mapd711.assignment2.ui.explore

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.centennial.mapd711.assignment2.databinding.ActivityExploreBinding
import com.centennial.mapd711.assignment2.model.ProductModel
import com.centennial.mapd711.assignment2.repo.ExploreRepository
import com.centennial.mapd711.assignment2.ui.details.DetailsActivity
import com.centennial.mapd711.assignment2.ui.invoice.InvoiceActivity
import com.centennial.mapd711.assignment2.ui.explore.adapter.PhoneAdapter

class ExploreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityExploreBinding
    private lateinit var type: String
    private lateinit var list: ArrayList<ProductModel>
    private lateinit var viewModel: ExploreViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityExploreBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initData()
        initAdapter()
        initListener()
    }

    private fun initData() {
        viewModel = ExploreViewModel(ExploreRepository())
        type = intent.extras?.getString("Key_Brand")!!
        list = viewModel.getList(type)
    }

    private fun initAdapter() {
        val adapter = PhoneAdapter(list)
        binding.listView.adapter = adapter
    }

    private fun initListener() {
        binding.listView.setOnItemClickListener { _, _, i, _ ->
            val intent = Intent(baseContext, DetailsActivity::class.java)
            list[i].type = type
            intent.putExtra("key_product", list[i])
            startActivity(intent)
        }
    }


}
package com.centennial.mapd711.assignment2.ui.main

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import com.centennial.mapd711.assignment2.R
import com.centennial.mapd711.assignment2.databinding.ActivityMainBinding
import com.centennial.mapd711.assignment2.ui.explore.ExploreActivity

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setData()
    }

    private fun setData() {
        binding.data =
            "https://static.vecteezy.com/system/resources/previews/005/315/941/original/stock-online-shop-logo-designs-template-illustration-graphic-of-smartphone-free-vector.jpg"
    }


    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {

        val intent = Intent(this, ExploreActivity::class.java)
        when (item.itemId) {
            R.id.item_iphone -> setData(intent, "iphone")
            R.id.item_samsung -> setData(intent, "samsung")
            R.id.item_google_pixel -> setData(intent, "google")
            R.id.item_oppo -> setData(intent, "oppo")
        }
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }

    private fun setData(intent: Intent, value: String) {
        intent.putExtra("Key_Brand", value)
    }


}
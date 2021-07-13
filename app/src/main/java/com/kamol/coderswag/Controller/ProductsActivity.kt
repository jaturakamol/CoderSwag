package com.kamol.coderswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kamol.coderswag.R
import com.kamol.coderswag.Utilities.EXTRA_CATEGORY

class ProductsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_products)

        val categoryType = intent.getStringExtra(EXTRA_CATEGORY)
        println(categoryType)
    }
}
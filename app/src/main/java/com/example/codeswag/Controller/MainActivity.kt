package com.example.codeswag.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.codeswag.Models.Category
import com.example.codeswag.R
import com.example.codeswag.Services.DataService
import com.example.codeswag.adapters.category_adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    lateinit var adapter: category_adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        adapter = category_adapter(this,DataService.category)
        categorylistview.adapter = adapter

    }}

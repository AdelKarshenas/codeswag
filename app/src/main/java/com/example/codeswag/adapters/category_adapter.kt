package com.example.codeswag.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.codeswag.Models.Category
import com.example.codeswag.R

class category_adapter (contex:Context, categories: List<Category>) :BaseAdapter() {
    val context =contex
    val categories = categories
    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
    val categoryview : View
        categoryview=LayoutInflater.from(context).inflate(R.layout.categoory_list_item, null)
        val categoryname:TextView = categoryview.findViewById(R.id.Category_name)
        val categoryimage:ImageView=categoryview.findViewById(R.id.Category_Image)
        val category = categories[position]
        categoryname.text=category.title
        val ResourceId= context.resources.getIdentifier(category.image,"drawable",context.packageName)
        categoryimage.setImageResource(ResourceId)
        return categoryview

    }

    override fun getItem(position: Int): Any {
    return categories[position]
    }

    override fun getItemId(position: Int): Long {
        return 0
    }

    override fun getCount(): Int {
    return categories.count()
    }
}
package com.example.demo9

import android.content.Context
import android.graphics.drawable.BitmapDrawable
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class PhotoFileAdapter(val context: Context) : BaseAdapter() {
    companion object {
        val IMAGES = intArrayOf(R.drawable.g1)
    }
    override fun getCount(): Int {
        return IMAGES.size
    }

    override fun getItem(p0: Int): Any {
        return IMAGES[p0]
    }

    override fun getItemId(p0: Int): Long {
        return IMAGES.size.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val inflater = LayoutInflater.from(context)
        val currentView = inflater.inflate(R.layout.list_item, null, false)
        val bd = context.resources.getDrawable(IMAGES[p0]) as BitmapDrawable
        val height= bd.bitmap.height
        val width = bd.bitmap.width
        val result = "dim=${width}x${height}"
        val subTextView = currentView.findViewById<TextView>(R.id.textView)
        subTextView.text = result
        val subImageView = currentView.findViewById<ImageView>(R.id.imageView)
        subImageView.setImageResource(IMAGES[p0])
        return currentView
    }
}
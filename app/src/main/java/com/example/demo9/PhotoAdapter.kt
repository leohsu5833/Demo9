package com.example.demo9

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.Gallery
import android.widget.ImageView

class PhotoAdapter(val context:Context) : BaseAdapter() {
    companion object {
        val IMAGES = intArrayOf(
            R.drawable.g1, R.drawable.g1, R.drawable.g1, R.drawable.g1,
            R.drawable.g1, R.drawable.g1, R.drawable.g1, R.drawable.g1,
        )
    }
    //var context: Context? = null
    override fun getCount(): Int {
        return IMAGES.size
    }

    override fun getItem(p0: Int): Any {
        return IMAGES.size
    }

    override fun getItemId(p0: Int): Long {
        return IMAGES.size.toLong()
    }

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View {
        val imageView = ImageView(context)
        imageView.setImageResource(IMAGES[p0])
        imageView.layoutParams = Gallery.LayoutParams(600,200)
        imageView.scaleType = ImageView.ScaleType.FIT_XY
        return imageView
    }
}
package com.example.demo9

import android.app.ListActivity
import android.os.Bundle

class Adapter3 : ListActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        listAdapter = PhotoFileAdapter(this)
    }
}
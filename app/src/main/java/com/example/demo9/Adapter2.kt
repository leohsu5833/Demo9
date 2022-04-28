package com.example.demo9

import android.os.Bundle
import android.view.View
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class Adapter2 : AppCompatActivity(), AdapterView.OnItemSelectedListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.gallery)
        val g = findViewById<Gallery>(R.id.gallery1)
        g.adapter = PhotoAdapter(this)
        val adapter = ArrayAdapter.createFromResource(
            this, R.array.codes,
            android.R.layout.simple_spinner_item
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        val spinner = findViewById<Spinner>(R.id.spinner)
        spinner.adapter = adapter
        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
        val textView = findViewById<TextView>(R.id.textView2)
        textView.text = resources.getStringArray(R.array.versions)[p2]
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }
}
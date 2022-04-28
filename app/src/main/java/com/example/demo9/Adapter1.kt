package com.example.demo9

import android.os.Bundle
import android.widget.ListView
import android.widget.SimpleAdapter
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Adapter1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupListView()
    }
    companion object {
        const val KEY1 = "titleField"
        const val KEY2 = "detailField"
    }
    private fun setupListView() {
        val listView1 = findViewById<ListView>(R.id.listView1)
        val versions = resources.getStringArray(R.array.versions)
        val codeNames = resources.getStringArray(R.array.codes)
        val ds = ArrayList<HashMap<String, String>>()
        for (i in 0..2) {
            val aRecord = HashMap<String, String>()
            aRecord.put(KEY1, versions[i])
            aRecord.put(KEY2, codeNames[i])
            ds.add(aRecord)
        }
        val simpleAdapter = SimpleAdapter(
            this, ds, R.layout.listview_item,
            arrayOf(KEY1, KEY2), intArrayOf(R.id.titleField, R.id.detailField)
        )
        listView1.adapter = simpleAdapter
        listView1.setOnItemClickListener { parent, view,  position, id ->
            Toast.makeText(this,"position=${position}, id=${id}", Toast.LENGTH_SHORT).show()
        }
    }
}
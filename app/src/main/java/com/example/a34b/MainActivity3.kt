package com.example.a34b

import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity(),AdapterView.OnItemSelectedListener {
    lateinit var result: TextView
    lateinit var spinner: Spinner
    var langauges = arrayOf("Nepali", "Chinese", "Indian", "Korean", "English")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        result = findViewById(R.id.textView)
        spinner = findViewById(R.id.spinner)

        var adapter = ArrayAdapter(
            this@MainActivity3,
            android.R.layout.simple_spinner_item, langauges
        )
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

        spinner.adapter = adapter

        spinner.onItemSelectedListener = this
    }

    override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
      if(parent != null){
       result.text = parent.getItemAtPosition(position).toString()
      }
    }

    override fun onNothingSelected(p0: AdapterView<*>?) {

    }

}
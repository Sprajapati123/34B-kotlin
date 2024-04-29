package com.example.a34b

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
class ListViewActivity : AppCompatActivity() {
    lateinit var listView : ListView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_list_view)

        listView = findViewById(R.id.listView)
        var data = resources.getStringArray(R.array.Country)

        var adapter = ArrayAdapter(this@ListViewActivity,
            android.R.layout.simple_list_item_1,data)



        listView.adapter = adapter
        listView.setOnItemClickListener { adapterView, view, index, l ->
            Toast.makeText(applicationContext,
                adapterView.getItemAtPosition(index).toString(),
                Toast.LENGTH_LONG)
                .show()
        }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
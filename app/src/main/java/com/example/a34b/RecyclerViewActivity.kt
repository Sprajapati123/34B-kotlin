package com.example.a34b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.RecyclerView
import java.lang.reflect.Array

class RecyclerViewActivity : AppCompatActivity() {

    lateinit var recyclerView: RecyclerView
    var titleList = ArrayList<String>()
    var descriptionList = ArrayList<String>()
    var imageList = ArrayList<Int>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_recycler_view)
        recyclerView = findViewById(R.id.recyclerView)

        titleList.add("Apple")
        titleList.add("Apple")


        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
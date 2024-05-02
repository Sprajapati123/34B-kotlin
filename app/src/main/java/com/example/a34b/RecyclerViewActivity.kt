package com.example.a34b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.a34b.adapter.RecyclerAdapter34B
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
        titleList.add("Banana")
        titleList.add("Cherry")
        titleList.add("Dragon Fruit")
        titleList.add("Grapes")
        descriptionList.add("This is apple")
        descriptionList.add("This is banana")
        descriptionList.add("This is cherry")
        descriptionList.add("This is dragon fruit")
        descriptionList.add("This is grapes")
        imageList.add(R.drawable.apple)
        imageList.add(R.drawable.banana)
        imageList.add(R.drawable.cherry)
        imageList.add(R.drawable.dragon_fruit)
        imageList.add(R.drawable.grapes)

        var adapter = RecyclerAdapter34B(titleList,descriptionList,imageList,this@RecyclerViewActivity)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter =adapter

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
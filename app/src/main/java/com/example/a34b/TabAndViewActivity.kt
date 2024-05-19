package com.example.a34b

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import com.example.a34b.adapter.TabAdapter
import com.example.a34b.databinding.ActivityTabAndViewBinding
import com.google.android.material.tabs.TabLayoutMediator

class TabAndViewActivity : AppCompatActivity() {
    lateinit var tabAndViewBinding: ActivityTabAndViewBinding
    var heading = arrayOf("Message","Status","Call")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        tabAndViewBinding = ActivityTabAndViewBinding.inflate(layoutInflater)
        setContentView(tabAndViewBinding.root)

        var fragmentManager : FragmentManager = supportFragmentManager
        tabAndViewBinding.viewPager2.adapter =
            TabAdapter(fragmentManager,lifecycle)

        TabLayoutMediator(tabAndViewBinding.tabLayout,
            tabAndViewBinding.viewPager2){
            tabs,position -> tabs.text = heading[position]
        }.attach()

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
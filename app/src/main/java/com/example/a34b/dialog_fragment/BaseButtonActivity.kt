package com.example.a34b.dialog_fragment

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34b.R
import com.example.a34b.databinding.ActivityBaseBinding
import com.example.a34b.databinding.ActivityBaseButtonBinding

class BaseButtonActivity : AppCompatActivity() {

    lateinit var baseButtonBinding: ActivityBaseButtonBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        baseButtonBinding = ActivityBaseButtonBinding.inflate(layoutInflater)
        setContentView(baseButtonBinding.root)


        baseButtonBinding.btnOpen.setOnClickListener {

        }


    }

     fun setData(username: String,age :Int) {
        baseButtonBinding.lblname.text = username
        baseButtonBinding.lblAge.text = age.toString()
    }
}
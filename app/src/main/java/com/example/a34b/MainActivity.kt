package com.example.a34b

import android.os.Bundle
import android.widget.ImageView
import android.widget.RadioButton
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    lateinit var radioButtonBike : RadioButton
    lateinit var radioButtonScooter : RadioButton
    lateinit var radioButtonCycle : RadioButton
    lateinit var imageView : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        radioButtonBike = findViewById(R.id.radioButtonBike)
        radioButtonScooter = findViewById(R.id.radioButtonScooter2)
        radioButtonCycle = findViewById(R.id.radioButtonCycle)
        imageView = findViewById(R.id.imageView)

        radioButtonBike.setOnClickListener {
            imageView.setImageResource(R.drawable.bike1)
        }

        radioButtonScooter.setOnClickListener {
            imageView.setImageResource(R.drawable.bike2)
        }

    }
}
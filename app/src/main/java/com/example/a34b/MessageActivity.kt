package com.example.a34b

import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34b.databinding.ActivityMainBinding
import com.example.a34b.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    lateinit var messageBinding: ActivityMessageBinding
    var counter = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        messageBinding = ActivityMessageBinding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)
        Log.d("Message","onCreate Called")
        messageBinding.btnCounter.setOnClickListener {
            counter++
            messageBinding.btnCounter.text = counter.toString()
        }



        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    override fun onStart() {
        Log.d("Message","onStart Called")
        super.onStart()
    }

    override fun onPause() {
        Log.d("Message","onPause Called")
        super.onPause()
    }

    override fun onStop() {
        Log.d("Message","onStop Called")
        super.onStop()
    }
    override fun onResume() {
        Log.d("Message","onResume Called")
        super.onResume()
    }

    override fun onDestroy() {
        Log.d("Message","onDestroy Called")
        super.onDestroy()
    }
    override fun onRestart() {
        Log.d("Message","onRestart Called")
        super.onRestart()
    }
}
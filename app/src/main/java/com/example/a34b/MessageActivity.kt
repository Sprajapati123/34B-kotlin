package com.example.a34b

import android.os.Bundle
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
        super.onStart()
    }

    override fun onPause() {
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
    }
    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
    }
    override fun onRestart() {
        super.onRestart()
    }
}
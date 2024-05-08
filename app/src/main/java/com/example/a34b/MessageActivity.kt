package com.example.a34b

import android.content.SharedPreferences
import android.os.Bundle
import android.util.Log
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.a34b.databinding.ActivityMainBinding
import com.example.a34b.databinding.ActivityMessageBinding

class MessageActivity : AppCompatActivity() {

    lateinit var messageBinding: ActivityMessageBinding
    lateinit var sharedPreferences: SharedPreferences
    var username : String? = null
    var message : String? = null
    var remember : Boolean = false
    var counter = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        messageBinding = ActivityMessageBinding.inflate(layoutInflater)
        var view = messageBinding.root
        setContentView(view)
        Log.d("Message","onCreate Called")

        messageBinding.btnCounter.setOnClickListener {
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
        sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE)

        username = messageBinding.usernameId.text.toString()
        message = messageBinding.messageId.text.toString()
        remember = messageBinding.rememberMeId.isChecked

        var editor = sharedPreferences.edit()
        editor.putString("username",username)
        editor.putString("message",message)
        editor.putBoolean("remember",remember)
        editor.putInt("counter",counter)

        editor.apply()

        Toast.makeText(applicationContext,"Data Saved",Toast.LENGTH_LONG).show()

        super.onPause()
    }
    override fun onResume() {
        Log.d("Message","onResume Called")
        sharedPreferences = getSharedPreferences("userData", MODE_PRIVATE)
        username = sharedPreferences.getString("username","")
        message = sharedPreferences.getString("message","")
        remember = sharedPreferences.getBoolean("remember",false)
        counter=  sharedPreferences.getInt("remember",0)

//        messageBinding.idOfViews

        messageBinding.usernameId.setText(username)
        messageBinding.messageId.setText(message)
        messageBinding.rememberMeId.isChecked = remember
        messageBinding.btnCounter.text = counter.toString()



        super.onResume()
    }

    override fun onStop() {
        Log.d("Message","onStop Called")
        super.onStop()
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
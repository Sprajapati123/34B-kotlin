package com.example.a34b

import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.snackbar.Snackbar

class MainActivity2 : AppCompatActivity() {
    lateinit var checkBoxToast: CheckBox
    lateinit var checkBoxSnack: CheckBox
    lateinit var checkBoxAlert: CheckBox
    lateinit var main: ConstraintLayout
    lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        checkBoxToast = findViewById(R.id.checkboxToast)
        checkBoxSnack = findViewById(R.id.checkBoxSnack)
        checkBoxAlert = findViewById(R.id.checkBoxAlert)
        main = findViewById(R.id.main)
        button = findViewById(R.id.btnClickMe)

        button.setOnClickListener {
            if (checkBoxToast.isChecked) {
                Toast.makeText(
                    this,
                    "This is toast message",
                    Toast.LENGTH_LONG
                ).show()
            } else if (checkBoxSnack.isChecked) {
                Snackbar.make(main, "This is message", Snackbar.LENGTH_LONG)
                    .setAction("No", {})
                    .show()
            } else {

            }
        }

    }
}
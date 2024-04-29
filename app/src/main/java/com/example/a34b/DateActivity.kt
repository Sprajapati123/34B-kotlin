package com.example.a34b

import android.app.DatePickerDialog
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import java.util.Calendar

class DateActivity : AppCompatActivity() {
    lateinit var button: Button
    lateinit var textView: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        button = findViewById(R.id.buttonDate)
        textView = findViewById(R.id.selectedDate)

        button.setOnClickListener {
            loadCalendar()
        }
    }

    private fun loadCalendar() {
        var c = Calendar.getInstance()
        var year = c.get(Calendar.YEAR)
        var month = c.get(Calendar.MONTH)
        var day = c.get(Calendar.DAY_OF_MONTH)

        var dateDialog = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener
            { datePicker, yy, mm, dd ->
                textView.text = "$yy/${mm+1}/$dd"

        },
            year,month,day)

        dateDialog.show()

        }
    }



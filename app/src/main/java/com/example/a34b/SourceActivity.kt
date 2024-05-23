package com.example.a34b

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.a34b.databinding.ActivitySourceBinding
import com.example.a34b.fragments.DestinationFragment

class SourceActivity : AppCompatActivity() {
    lateinit var sourceBinding: ActivitySourceBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        sourceBinding = ActivitySourceBinding.inflate(layoutInflater)
        setContentView(sourceBinding.root)


        sourceBinding.btnNavigate3.setOnClickListener {
            var a = sourceBinding.number1.text.toString().toInt()
            var b = sourceBinding.number2.text.toString().toInt()
            var bundle = Bundle()

            var destinationFragment = DestinationFragment()

            bundle.putInt("first",a)
            bundle.putInt("second",b)

            destinationFragment.arguments = bundle
//            var fragmentManager : FragmentManager = supportFragmentManager
//            var fragmentTransaction: FragmentTransaction = fragmentManager.beginTransaction()
            // fragmentTransaction.replace(R.id.frameLayout,destinationFragment)
            //fragmentTransaction.commit()
            supportFragmentManager
                .beginTransaction()
                .replace(R.id.frameLayoutDataPass,destinationFragment)
                .commit()







        }
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }
}
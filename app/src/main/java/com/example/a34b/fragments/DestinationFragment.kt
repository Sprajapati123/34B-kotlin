package com.example.a34b.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.a34b.R
import com.example.a34b.databinding.FragmentDestinationBinding

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"


class DestinationFragment : Fragment() {
    lateinit var destinationBinding: FragmentDestinationBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        destinationBinding = FragmentDestinationBinding.inflate(
            inflater,
            container,
            false)

        var a = arguments?.getInt("first").toString().toInt()
        var b = arguments?.getInt("second").toString().toInt()

        var result = a+b

        destinationBinding.resultText.text = "The sum of $a and $b is $result"

        return destinationBinding.root
    }

}
package com.example.a34b.dialog_fragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import com.example.a34b.R
import com.example.a34b.databinding.FragmentDataDialogBinding

class DataDialogFragment : DialogFragment() {
    lateinit var dataDialogBinding: FragmentDataDialogBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        // Inflate the layout for this fragment
        dataDialogBinding= FragmentDataDialogBinding.inflate(inflater,
            container,false)

        dataDialogBinding.btnCancel.setOnClickListener {
            dialog!!.dismiss()
        }

        dataDialogBinding.btnOk.setOnClickListener {
            var name : String = dataDialogBinding.editTextText3.text.toString()
            var age : Int = dataDialogBinding.editTextText4.text.toString().toInt()

            var baseButtonActivity : BaseButtonActivity = activity as BaseButtonActivity

            baseButtonActivity.setData(name,age)
            dialog!!.dismiss()
        }

        return dataDialogBinding.root
    }

}
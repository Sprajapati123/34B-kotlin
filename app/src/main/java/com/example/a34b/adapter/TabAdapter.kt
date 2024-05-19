package com.example.a34b.adapter

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.lifecycle.Lifecycle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.a34b.fragments.FirstFragment
import com.example.a34b.fragments.SecondFragment
import com.example.a34b.fragments.ThirdFragment

class TabAdapter(var fragmentManager: FragmentManager,
                 var lifecycle: Lifecycle) :
    FragmentStateAdapter(fragmentManager,lifecycle){
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position){
            0 -> return FirstFragment()
            1 -> return SecondFragment()
            2 -> return ThirdFragment()

            else -> return ThirdFragment()
        }
    }

}
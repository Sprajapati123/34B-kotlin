package com.example.a34b.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.example.a34b.R

class RecyclerAdapter34B(
    var titleList: ArrayList<String>,
    var descriptionList: ArrayList<String>,
    var imageList: ArrayList<Int>,
    var context: Context
) : RecyclerView.Adapter<RecyclerAdapter34B.FruitsViewHolder>(){

    class FruitsViewHolder(view : View) : RecyclerView.ViewHolder(view){
        var image : ImageView = view.findViewById(R.id.imageView4)
        var title : TextView = view.findViewById(R.id.textView4)
        var description : TextView = view.findViewById(R.id.textView5)
        var card : CardView = view.findViewById(R.id.cardView)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitsViewHolder {
        var view : View = LayoutInflater.from(parent.context).inflate(R.layout.sample_recycler_view_design,parent,false)

        return FruitsViewHolder(view)
    }

    override fun getItemCount(): Int {
       return titleList.size
    }

    override fun onBindViewHolder(holder: FruitsViewHolder, position: Int) {
        holder.image.setImageResource(imageList[position])
        holder.title.text = titleList[position]
        holder.description.text = descriptionList[position]
        holder.card.setOnClickListener {
            Toast.makeText(context,titleList[position].toString(),Toast.LENGTH_LONG).show()
        }


    }
}
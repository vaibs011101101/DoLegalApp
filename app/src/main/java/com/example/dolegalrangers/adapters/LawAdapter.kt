package com.example.dolegalrangers.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.activities.LawScreenActivity
import com.example.dolegalrangers.activities.StoryActivity
import com.example.dolegalrangers.models.LawModel

class LawAdapter (val list:ArrayList<LawModel>): RecyclerView.Adapter<LawAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val lawName:TextView = itemView.findViewById(R.id.law_name)
        val lawSection:TextView = itemView.findViewById(R.id.law_section)

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.laws_design,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model = list[position]
        holder.lawName.text = model.lawName
        holder.lawSection.text = model.lawSection

        holder.itemView.setOnClickListener {
            val intent = Intent(it.context, LawScreenActivity::class.java)
            intent.putExtra("index", position.toString())
            holder.itemView.context.startActivity(intent)
        }

    }
}
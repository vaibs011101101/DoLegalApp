package com.example.dolegalrangers.adapters

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.activities.StoryActivity
import com.example.dolegalrangers.models.StoryListModel

class StoryListAdapter(val list : ArrayList<StoryListModel>) : RecyclerView.Adapter<StoryListAdapter.ViewHolder>() {

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val title = itemView.findViewById<TextView>(R.id.story_title)
        val theme = itemView.findViewById<TextView>(R.id.story_theme)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
       val view = LayoutInflater.from(parent.context).inflate(R.layout.story_list_design,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model:StoryListModel = list[position]
        holder.title.text = model.story_name
        holder.theme.text = model.story_theme

        holder.itemView.setOnClickListener{
            val intent = Intent(it.context,StoryActivity::class.java)
            intent.putExtra("index", position.toString())
            holder.itemView.context.startActivity(intent)
        }
    }
}
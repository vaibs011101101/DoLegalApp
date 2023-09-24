package com.example.dolegalrangers.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.models.LeaderboardModel

class LeaderboardAdapter(private val list:ArrayList<LeaderboardModel>) : RecyclerView.Adapter<LeaderboardAdapter.ViewHolder>() {
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val name =itemView.findViewById<TextView>(R.id.leaderboard_name)
        val points =itemView.findViewById<TextView>(R.id.leaderboard_score)
        val place =itemView.findViewById<TextView>(R.id.leaderboard_place)
        val badge =itemView.findViewById<ImageView>(R.id.leaderboard_badge)
        val profile =itemView.findViewById<ImageView>(R.id.leaderboard_profile)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.leaderboard_design,parent,false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model: LeaderboardModel = list[position]
        holder.name.text = model.name
        holder.place.text = model.place
        holder.points.text = model.points+" pts."
        holder.badge.setImageResource(model.badge)
        holder.profile.setImageResource(model.profile)
    }
}
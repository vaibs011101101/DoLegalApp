package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.adapters.LeaderboardAdapter
import com.example.dolegalrangers.models.LeaderboardModel

class LeaderboardActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<LeaderboardModel>
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_leaderboard)


        list = ArrayList()
        recyclerView = findViewById(R.id.recyclerview_leaderboard)
        list.add(
            LeaderboardModel("Vandan Nandwana",
                R.drawable.photo,"220",
                R.drawable.gold_badge,"#1")
        )
        list.add(
            LeaderboardModel("Nikhil Kumar",
                R.drawable.sample3,"200",
                R.drawable.gold_badge,"#2")
        )
        list.add(
            LeaderboardModel("Vivek Tiwari",
                R.drawable.sample2,"150",
                R.drawable.silver_badge,"#3")
        )
        list.add(LeaderboardModel("Andry",
            R.drawable.sample1,
            "100",
            R.drawable.silver_badge,"#4")
        )
        list.add(
            LeaderboardModel("Pratham Kave",
                R.drawable.photo,"100",
                R.drawable.silver_badge,"#5")
        )
        list.add(LeaderboardModel("Soham", R.drawable.sample4,"85", R.drawable.brown_badge,"#6"))
        list.add(LeaderboardModel("Raj", R.drawable.sample1,"50", R.drawable.brown_badge,"#7"))
        list.add(LeaderboardModel("Akhil", R.drawable.sample2,"30", R.drawable.brown_badge,"#8"))
        list.add(LeaderboardModel("Kailash", R.drawable.sample3,"10", R.drawable.brown_badge,"#9"))
        list.add(LeaderboardModel("Rajesh", R.drawable.sample4,"9", R.drawable.brown_badge,"#10"))
        val layoutManager: RecyclerView.LayoutManager = LinearLayoutManager(this)
        val adapter = LeaderboardAdapter(list)
        recyclerView.layoutManager = layoutManager
        recyclerView.adapter = adapter


    }
}
package com.example.dolegalrangers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.dolegalrangers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.storyPart.setOnClickListener {
            intent = Intent(this,StoryListActivity::class.java)
            startActivity(intent)
        }

        binding.lawsPart.setOnClickListener {
            intent = Intent(this,LawsActivity::class.java)
            startActivity(intent)
        }

        binding.addStoryPart.setOnClickListener {

        }

        binding.leaderboardPart.setOnClickListener {

        }

        binding.reward.setOnClickListener {
            intent = Intent(this,ProfileActivity::class.java)
            startActivity(intent)
        }

    }
}
package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.example.dolegalrangers.R

class ProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        val txt = findViewById<TextView>(R.id.points)
        val scores = intent.getStringExtra("score")
        txt.text = scores
    }
}
package com.example.dolegalrangers.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.dolegalrangers.R

class ProfileActivity : AppCompatActivity() {
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profile)

        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)

        val scores = intent.getStringExtra("score")
        val logout = findViewById<Button>(R.id.logout)


        logout.setOnClickListener {

            val editor = sharedPreferences.edit()
            editor.putBoolean("IsLoggedIn",false)
            editor.apply()

            intent = Intent(this,LoginActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
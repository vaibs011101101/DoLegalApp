package com.example.dolegalrangers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.example.dolegalrangers.R

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)
        val add = findViewById<Button>(R.id.button2)

        add.setOnClickListener {
            Toast.makeText(this,"Your Story is submitted you will soon get the update!! ",Toast.LENGTH_LONG).show()
        }

    }
}
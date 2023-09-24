package com.example.dolegalrangers.activities

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import com.example.dolegalrangers.R
import com.google.firebase.auth.FirebaseAuth

class LoginActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    private lateinit var sharedPreferences: SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        auth = FirebaseAuth.getInstance()
        sharedPreferences = getSharedPreferences("MyPrefs", Context.MODE_PRIVATE)



        if(sharedPreferences.getBoolean("IsLoggedIn",false)){
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }

        val sigup_text = findViewById<TextView>(R.id.signup_text)

        val loginButton = findViewById<Button>(R.id.login_button)

        val progressBar = findViewById<ProgressBar>(R.id.progressBar)
        progressBar.visibility = View.GONE

        loginButton.setOnClickListener {
            val email = findViewById<TextView>(R.id.login_user_email).text
            val password = findViewById<TextView>(R.id.login_user_password).text
            progressBar.visibility = View.VISIBLE
            auth.signInWithEmailAndPassword(email.toString(), password.toString())
                .addOnCompleteListener {
                    if (it.isSuccessful) {
                        Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()

                        val editor = sharedPreferences.edit()
                        editor.putBoolean("IsLoggedIn",true)
                        editor.apply()

                        intent = Intent(this, MainActivity::class.java)
                        startActivity(intent)
                        finish()


                    } else {
                        Toast.makeText(this, "Login Not Successful", Toast.LENGTH_LONG).show()
                        progressBar.visibility = View.GONE
                    }
                }
        }

        sigup_text.setOnClickListener {
            intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
            finish()
        }

    }
}
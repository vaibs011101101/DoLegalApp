package com.example.dolegalrangers.activities

import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import com.example.dolegalrangers.R
import com.google.firebase.auth.FirebaseAuth

class RegisterActivity : AppCompatActivity() {
    private lateinit var auth: FirebaseAuth
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)


        val login_textview = findViewById<TextView>(R.id.login_text)
        auth = FirebaseAuth.getInstance()
        val signupButton = findViewById<Button>(R.id.signup_button)

        signupButton.setOnClickListener {
            val email = findViewById<TextView>(R.id.signup_user_email).text
            val password = findViewById<TextView>(R.id.signup_user_password).text

            auth.createUserWithEmailAndPassword(email.toString(),password.toString())
                .addOnCompleteListener(this) {task->
                    if(task.isSuccessful){
                        Toast.makeText(this,"Account Created Succesfull", Toast.LENGTH_SHORT).show()
                    }
                    else{
                        Toast.makeText(this,"Account Created Not Succesfull", Toast.LENGTH_SHORT).show()
                    }
                }
        }

        login_textview.setOnClickListener {
            intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
            finish()
        }


    }
}
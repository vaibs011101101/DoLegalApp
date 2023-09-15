package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.adapters.LawAdapter
import com.example.dolegalrangers.models.LawModel

class LawsActivity : AppCompatActivity() {
    private lateinit var list :ArrayList<LawModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_laws)

        list = ArrayList()

        list.add(LawModel("Child Labor","112345"))
        list.add(LawModel("Child Mariage","11345"))
        list.add(LawModel("Child Harrasment","113432345"))
        list.add(LawModel("Child Labor","112345"))
        list.add(LawModel("Child Labor","112345"))
        list.add(LawModel("Child Labor","112345"))

        val layoutManager = LinearLayoutManager(this)
        val adapter = LawAdapter(list)
        val law_rv:RecyclerView = findViewById(R.id.laws_rv)

        law_rv.layoutManager = layoutManager
        law_rv.adapter = adapter


    }
}
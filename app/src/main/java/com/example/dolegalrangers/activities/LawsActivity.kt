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

        list.add(LawModel("The Right to Education","Act (RTE), 2009"))
        list.add(LawModel("The Protection of Children from Sexual Offences","(POCSO) Act, 2012"))
        list.add(LawModel("The Child Labour (Prohibition and Regulation)","Act, 1986"))

        val layoutManager = LinearLayoutManager(this)
        val adapter = LawAdapter(list)
        val law_rv:RecyclerView = findViewById(R.id.laws_rv)

        law_rv.layoutManager = layoutManager
        law_rv.adapter = adapter


    }
}
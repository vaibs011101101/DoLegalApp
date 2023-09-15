package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.models.LawViewModel

class LawScreenActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<LawViewModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_law_screen)

        list = ArrayList()

        val image = findViewById<ImageView>(R.id.law_image)
        val name = findViewById<TextView>(R.id.law_name_view)
        val section = findViewById<TextView>(R.id.law_section_view)
        val description = findViewById<TextView>(R.id.law_desc)

        val lawIndex = intent.getStringExtra("index")?.toInt()

        list.add(LawViewModel(R.drawable.photo,"Child Labour","213123","This is very crusial act "))
        list.add(LawViewModel(R.drawable.photo,"Child Mariage","232413123","This is very crusial act "))
        list.add(LawViewModel(R.drawable.photo,"Child HArrasment","213123","This is very crusial act "))

        image.setImageResource(list[lawIndex!!].image)
        name.text = list[lawIndex].name
        section.text = list[lawIndex].Section
        description.text = list[lawIndex].description

    }
}
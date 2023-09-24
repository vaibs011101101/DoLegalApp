package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.dolegalrangers.R
import com.example.dolegalrangers.adapters.StoryListAdapter
import com.example.dolegalrangers.databinding.ActivityStoryListBinding
import com.example.dolegalrangers.models.StoryListModel

class StoryCategoryActivity : AppCompatActivity() {
    private lateinit var list:ArrayList<StoryListModel>
    private lateinit var list2:ArrayList<StoryListModel>
    private lateinit var list3:ArrayList<StoryListModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_story_category)
        list2 = ArrayList()
        list3 = ArrayList()
        list = ArrayList()
        list.add(StoryListModel("Glass Factory","Child Labour"))
        list.add(StoryListModel("Childhood Marriage","Child Marriage"))
        list2.add(StoryListModel("How to Become a good person","Identity Development"))
        list2.add(StoryListModel("How to talk with someone","Speaking skills"))
        list3.add(StoryListModel("How to set a gole","Goal Setting"))
        list3.add(StoryListModel("How to manage your time","Time Management"))
        val storyRv = findViewById<RecyclerView>(R.id.rv1)
        val storyRv2 = findViewById<RecyclerView>(R.id.rv2)
        val storyRv3 = findViewById<RecyclerView>(R.id.rv3)
        val layoutManager1 = LinearLayoutManager(this)
        storyRv.layoutManager = layoutManager1
        storyRv.adapter = StoryListAdapter(list)

        val layoutManager2 = LinearLayoutManager(this)
        storyRv2.layoutManager = layoutManager2
        storyRv2.adapter = StoryListAdapter(list2)

        val layoutManager3 = LinearLayoutManager(this)
        storyRv3.layoutManager = layoutManager3
        storyRv3.adapter = StoryListAdapter(list3)





    }
}
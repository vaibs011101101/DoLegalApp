package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dolegalrangers.adapters.StoryListAdapter
import com.example.dolegalrangers.databinding.ActivityStoryListBinding
import com.example.dolegalrangers.models.StoryListModel

class StoryListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoryListBinding
    private lateinit var list:ArrayList<StoryListModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityStoryListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()
        list.add(StoryListModel("Glass Factory","Child Labour"))
        list.add(StoryListModel("Begger","Right to Education"))
        list.add(StoryListModel("Rich Boy Poor Boy","Behaviour"))
        val storyRv = binding.storyListRv
        val layoutManager = LinearLayoutManager(this)
        storyRv.layoutManager = layoutManager
        storyRv.adapter = StoryListAdapter(list)



    }
}
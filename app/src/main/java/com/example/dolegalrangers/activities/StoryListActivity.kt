package com.example.dolegalrangers.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.dolegalrangers.adapters.StoryListAdapter
import com.example.dolegalrangers.databinding.ActivityStoryListBinding
import com.example.dolegalrangers.models.StoryListModel

class StoryListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityStoryListBinding
    private lateinit var list1:ArrayList<StoryListModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState
        )
        binding = ActivityStoryListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list1 = ArrayList()
        list1.add(StoryListModel("Glass Factory","Child Labour"))
        list1.add(StoryListModel("Childhood Marriage","Child Marriage"))
        val storyRv = binding.storyListRv
        val layoutManager = LinearLayoutManager(this)
        storyRv.layoutManager = layoutManager
        storyRv.adapter = StoryListAdapter(list1)



    }
}
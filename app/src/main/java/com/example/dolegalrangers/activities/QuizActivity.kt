package com.example.dolegalrangers.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.example.dolegalrangers.R
import com.example.dolegalrangers.databinding.ActivityQuizBinding
import com.example.dolegalrangers.models.QuizModel

class QuizActivity : AppCompatActivity() {
    private lateinit var binding: ActivityQuizBinding
    private var count = 0
    private var score = 0
    private lateinit var list: ArrayList<QuizModel>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityQuizBinding.inflate(layoutInflater)
        setContentView(binding.root)
        list = ArrayList()

        val quizIndex = intent.getStringExtra("indexs")

        list.add(QuizModel(R.drawable.rte,"Kya Abhi ke pita ne police ko bata kar sahi kiya ?","Bilkul Sahi kiya","Bilkul Galat kiya","Unhe police ko nahi batana chahiye tha","Unhe Raju ki help nahi karni chahiye thi","Bilkul Sahi kiya"))
        list.add(QuizModel(R.drawable.childabuse,"Raju ki maa ne use kaam par kyu bheja tha","Taki vhe ghar par aaram kar sake","Ve apne bete ko pasand nahi karti thi","Voh chahti thi ki uska beta bhi kamana sikhe","Mazboori ke karan","Mazboori ke karan"))
        list.add(QuizModel(R.drawable.childlabour,"Kis section ke tahat baccho se kaam karwana apradh hain ?","Koi Section nahi","Section 1920","Section 1986","Section 2020","Section 1986"))
        binding.question.text = list[0].question
        binding.option1.text = list[0].option1
        binding.option2.text = list[0].option2
        binding.option3.text = list[0].option3
        binding.option4.text = list[0].option4
        binding.quizImage.setImageResource(list[0].image)
//
        binding.option1.setOnClickListener{
            nextData(binding.option1.text.toString())
        }
        binding.option2.setOnClickListener{
            nextData(binding.option2.text.toString())
        }
        binding.option3.setOnClickListener{
            nextData(binding.option3.text.toString())
        }
        binding.option4.setOnClickListener{
            nextData(binding.option4.text.toString())
        }


    }

    private fun nextData(i: String) {
        if (count < list.size) {
            if (list[count].answer == i) {
                score++
            }
        }
        count++
        if (count >= list.size) {
            binding.button.visibility = View.VISIBLE
            Toast.makeText(
                this,
                "Your score $score is added to your profile",
                Toast.LENGTH_LONG
            ).show()
            binding.button.setOnClickListener {
                val intent = Intent(this@QuizActivity, ProfileActivity::class.java)
                intent.putExtra("score", score.toString())
                startActivity(intent)
            }
        } else {
            binding.question.text = list[count].question
            binding.quizImage.setImageResource(list[count].image)
            binding.option1.text = list[count].option1
            binding.option2.text = list[count].option2
            binding.option3.text = list[count].option3
            binding.option4.text = list[count].option4
        }
    }

}
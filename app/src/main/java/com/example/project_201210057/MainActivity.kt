package com.example.project_201210057

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.project_201210057.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    var scoreA = 0
    var scoreB = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        //Score A plus Minus
        binding.ButPlusA.setOnClickListener {scoreA = scoreA + 1
            binding.TmScoreA.text=scoreA.toString()}

        binding.ButMinusA.setOnClickListener {if (scoreA > 0){
            scoreA= scoreA - 1
            binding.TmScoreA.text=scoreA.toString()}

        //Score B plus minus
        binding.ButPlusB.setOnClickListener {
            scoreB= scoreB + 1
            binding.TmScoreB.text=scoreB.toString()}
        binding.ButMinusB.setOnClickListener {if (scoreB > 0){
            scoreB= scoreB - 1
            binding.TmScoreB.text=scoreB.toString()}
        }

        //Reset score
        binding.ButReset.setOnClickListener {
            scoreA = 0
            scoreB = 0
            binding.TmScoreB.text= scoreB.toString()
            binding.TmScoreA.text= scoreA.toString()}
    }
}}
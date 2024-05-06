package com.example.mytamagotchiapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.TextView
import java.util.Timer
import java.util.TimerTask

class MainActivity2 : AppCompatActivity() {


    private lateinit var cleanButton: Button
    private lateinit var playButton: Button
    private lateinit var FoodButton: Button
    private lateinit var textView2: TextView
    private lateinit var imageView: ImageView
    private lateinit var progressBar: ProgressBar
    private lateinit var progressBar2: ProgressBar
    private lateinit var progressBar3: ProgressBar
    private var currentProgress=0
    private lateinit var textView3: TextView
    private lateinit var textView4: TextView
    private lateinit var textView5: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        cleanButton= findViewById(R.id.cleanbutton)
        playButton= findViewById(R.id.playbutton)
        FoodButton= findViewById(R.id.Foodbutton)
        textView2= findViewById(R.id.textView2)
        imageView= findViewById(R.id.imageView)
        progressBar=findViewById(R.id.progressBar)
        progressBar2=findViewById(R.id.progressBar2)
        progressBar3=findViewById(R.id.progressBar3)
        textView3=findViewById(R.id.textView3)
        textView4=findViewById(R.id.textView4)
        textView5=findViewById(R.id.textView5)



        cleanButton.setOnClickListener {
            imageView.setImageResource(R.drawable.image2)
            currentProgress= currentProgress+ 50;
            progressBar.setProgress(currentProgress)
        }
        playButton.setOnClickListener {
            imageView.setImageResource(R.drawable.image1)
            currentProgress=currentProgress+50
            progressBar2.setProgress(currentProgress)
        }
        FoodButton.setOnClickListener {
            imageView.setImageResource(R.drawable.image3)
            currentProgress=currentProgress+50
            progressBar3.setProgress(currentProgress)
        }


        Timer().schedule(object : TimerTask() {
            override fun run() {
                runOnUiThread {
                    progressBar2
                    progressBar3
                    progressBar
                }
            }
        }, 60000) // 60000 milliseconds = 1 minute
    }
}
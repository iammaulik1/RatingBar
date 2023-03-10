package com.example.ratingbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.RatingBar
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val ratingBar = findViewById<RatingBar>(R.id.ratingBar)
        if (ratingBar!=null){
            val button = findViewById<Button>(R.id.button)
            button?.setOnClickListener {
                val message = ratingBar.rating.toString()
                Toast.makeText(this@MainActivity , "You Have Given Rating Of " + message +" Stars",Toast.LENGTH_LONG).show()
            }
        }

    }
}
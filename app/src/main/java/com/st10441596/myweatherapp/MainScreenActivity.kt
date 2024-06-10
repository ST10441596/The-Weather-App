package com.st10441596.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main_screen)

        var btnDetailView = findViewById<Button>(R,id.btnDetailedView)
        btnDetailedView.setOnClickListener {
            val intent1 = Intent( this, DetailedScreenActivity::class.java)
            startActivity(intent1)
        }


    }
}
package com.st10441596.myweatherapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class SplashScreensActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btnMainScreen = findViewById<Button>(R.id.btnMainScreen)
        btnMainScreen.setOnClickListener {
            val intent1 = Intenet ( this, MainScreen ::class.java)

    }

}



}

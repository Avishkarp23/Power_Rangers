package com.example.power_rangers.ui.auth

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.example.power_rangers.R

class firstpage : AppCompatActivity() {

    // Delay time for the splash screen in milliseconds
    private val SPLASH_DELAY: Long = 2000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.firstpage)

        // Using a Handler to delay the transition to the authentication screen
        Handler().postDelayed({
            // Start the authentication screen
            startActivity(Intent(this@firstpage, auth_activity::class.java))
            finish()
        }, SPLASH_DELAY)
    }
}
package com.example.power_rangers.ui.auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.example.power_rangers.R


class auth_activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun opensignup(view: View) {
        val intent = Intent(this, signup::class.java)
        startActivity(intent)
    }
    fun openlogin(view: View) {
        val intent = Intent(this, login::class.java)
        startActivity(intent)
    }

}
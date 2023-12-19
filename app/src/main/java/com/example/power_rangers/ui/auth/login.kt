package com.example.power_rangers.ui.auth

import android.content.Intent
import android.content.Context
import android.widget.Toast
import android.os.Bundle
import android.content.SharedPreferences
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.power_rangers.R
import com.example.power_rangers.ui.common.home

class login : AppCompatActivity() {
    private lateinit var userRepository: UserRepository
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)

        userRepository = UserRepository()

        val loginn = findViewById<Button>(R.id.loginn)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)

        loginn.setOnClickListener {
            val username = name.text.toString()
            val password = password.text.toString()
            val user = userRepository.getUser(username, password)
            if (user != null) {
                startActivity(Intent(this, home::class.java))
            } else {
                Toast.makeText(this, "Invalid username or password", Toast.LENGTH_SHORT).show()
            }
            }
        }}

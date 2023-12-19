package com.example.power_rangers.ui.auth

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import com.example.power_rangers.R
import com.example.power_rangers.ui.auth.user

class signup : AppCompatActivity() {
    private lateinit var userRepository: UserRepository

    override fun onCreate(savedInstanceState: Bundle?) {

                val items = listOf("Officer","Contractor")

                val autoComplete : AutoCompleteTextView = findViewById(R.id.auto_complete)

                val adapter = ArrayAdapter(this,R.layout.list_view,items)

                autoComplete.setAdapter(adapter)



        super.onCreate(savedInstanceState)
        setContentView(R.layout.signup)

        userRepository = UserRepository()

        val signupp = findViewById<Button>(R.id.signupp)
        val name = findViewById<EditText>(R.id.name)
        val password = findViewById<EditText>(R.id.password)

        signupp.setOnClickListener(){
            val username = name.text.toString()
            val password = password.text.toString()
            userRepository.addUser(user(username, password))
            startActivity(Intent(this, login::class.java))
        }
    }
}
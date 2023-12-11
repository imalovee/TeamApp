package com.example.studygroupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val signupButton : Button = findViewById(R.id.button1)
        signupButton.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)

            startActivity(intent)
        }


        val registerButton : Button = findViewById(R.id.second)
        registerButton.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}
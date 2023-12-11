package com.example.studygroupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class SigninActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        val text2 : TextView = findViewById(R.id.sub_text2)
        text2.setOnClickListener {
            val intent = Intent(this, RegisterActivity::class.java)
            startActivity(intent)
        }

        val textInput : TextInputLayout = findViewById(R.id.textInputLayout)
        val textInput2 : TextInputLayout = findViewById(R.id.textInputLayout2)
        val signinButton : Button = findViewById(R.id.signInButton)

        signinButton.setOnClickListener {
            val emailEntered : String = textInput.editText?.text.toString()
            val passwordEntered : String = textInput2.editText?.text.toString()
            var message = ""

            if (emailEntered.isEmpty() || passwordEntered.isEmpty()){
                message = "please input all your details"
            }else{
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }
           Snackbar.make(this, findViewById(R.id.Layout1), message, Snackbar.LENGTH_LONG).show()
        }
    }
}
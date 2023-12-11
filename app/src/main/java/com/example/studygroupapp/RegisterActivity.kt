package com.example.studygroupapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.textfield.TextInputLayout

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val loginText: TextView = findViewById(R.id.s_text2)
        loginText.setOnClickListener {
            val intent = Intent(this, SigninActivity::class.java)
            startActivity(intent)
        }
       val registerButton : Button = findViewById(R.id.signUpButton)
        val textInput  : TextInputLayout= findViewById(R.id.name)
       val textInput2 :TextInputLayout = findViewById(R.id.business_name)
       val textInput3 :TextInputLayout =  findViewById(R.id.phone)
       val textInput4 :TextInputLayout = findViewById(R.id.email)
       val textInput5 :TextInputLayout = findViewById(R.id.password)

        registerButton.setOnClickListener {
            val nameEntered : String = textInput.editText?.text.toString()
            val bussinessNameEntered : String = textInput2.editText?.text.toString()
            val phoneEntered : String = textInput3.editText?.text.toString()
            val emailEntered : String = textInput4.editText?.text.toString()
            val passwordEntered : String = textInput5.editText?.text.toString()
            var message = ""

            if (nameEntered.isNotEmpty() || bussinessNameEntered.isNotEmpty()
                || phoneEntered.isNotEmpty() || emailEntered.isNotEmpty() || passwordEntered.isNotEmpty()
            ){
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            }else{
                message = "input all your details"

            }

            Snackbar.make(this, findViewById(R.id.register_layout), message, Snackbar.LENGTH_LONG).show()
        }

    }


}



package com.music.moodio

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.registerscreen)

        val emailEditText = findViewById<EditText>(R.id.emailID)
        val passwordEditText = findViewById<EditText>(R.id.passwordID)
        val buttonLogin = findViewById<Button>(R.id.button_signUp)
        val buttonSignUp = findViewById<Button>(R.id.button_signUp)

        buttonLogin.setOnClickListener {
            val email = emailEditText.text.toString()
            val password = passwordEditText.text.toString()

            if (email.isNullOrEmpty() || password.isNullOrEmpty()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
            } else {
                Log.e("Button", "Login button clicked")
                Toast.makeText(this, "Login Successful", Toast.LENGTH_LONG).show()

                val intent = Intent(this, LogoutActivity::class.java)
                startActivity(intent)
            }
        }
        buttonSignUp.setOnClickListener {
            Log.e("Button", "Sign Up button clicked")
            Toast.makeText(this, "Sign Up Successful", Toast.LENGTH_LONG).show()
            val intent = Intent(this, LogoutActivity::class.java)
            startActivity(intent)
        }

    }
}
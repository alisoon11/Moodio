package com.music.moodio

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class SettingsActivity : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.settings_page)

        val HomeButton2 = findViewById<ImageButton>(R.id.HomeButton2)
        HomeButton2.setOnClickListener{
            Toast.makeText(this, "Navigating to Home Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        val ProfileButton2 = findViewById<ImageButton>(R.id.ProfileButton2)
        ProfileButton2.setOnClickListener{
            Toast.makeText(this, "Navigating to Profile Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

        val ProfileText = findViewById<TextView>(R.id.ProfileText)
        ProfileText.setOnClickListener{
            Toast.makeText(this, "Navigating to Profile Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

        val ProfileButton3 = findViewById<ImageButton>(R.id.ProfileButton3)
        ProfileButton3.setOnClickListener{
            Toast.makeText(this, "Navigating to Profile Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, ProfilePageActivity::class.java)
            startActivity(intent)
        }

    }
}
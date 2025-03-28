package com.music.moodio

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageButton
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class HomePageActivity : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_page)

        val SettingsButton = findViewById<ImageButton>(R.id.SettingsButton)
        SettingsButton.setOnClickListener{
            Toast.makeText(this, "Navigating to Settings Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

        val ProfileButton = findViewById<ImageButton>(R.id.ProfileButton)
        ProfileButton.setOnClickListener{
            Toast.makeText(this, "Navigating to Profile Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }

    }
}
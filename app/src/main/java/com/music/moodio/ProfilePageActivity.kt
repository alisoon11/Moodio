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

class ProfilePageActivity : Activity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.profile_page)

        val HomeButton = findViewById<ImageButton>(R.id.HomeButton)
        HomeButton.setOnClickListener{
            Toast.makeText(this, "Navigating to Home Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, HomePageActivity::class.java)
            startActivity(intent)
        }

        val SettingsButton2 = findViewById<ImageButton>(R.id.SettingsButton2)
        SettingsButton2.setOnClickListener{
            Toast.makeText(this, "Navigating to Settings Page...", Toast.LENGTH_LONG).show()
            val intent = Intent(this, SettingsActivity::class.java)
            startActivity(intent)
        }
    }
}
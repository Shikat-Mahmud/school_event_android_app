package com.saikat.exstudentscca;

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import com.saikat.exstudentscca.AdminActivity
import com.saikat.exstudentscca.MainActivity
import com.saikat.exstudentscca.R

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        val userButton: Button = findViewById(R.id.user_button)
        val adminButton: Button = findViewById(R.id.admin_button)

        userButton.setOnClickListener {
            val userIntent = Intent(this, MainActivity::class.java)
            startActivity(userIntent)
            finish()
        }

        adminButton.setOnClickListener {
            val adminIntent = Intent(this, AdminActivity::class.java)
            startActivity(adminIntent)
            finish()
        }
    }
}

package com.example.a10120215latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Register : AppCompatActivity() {
    private lateinit var txtVerify: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        txtVerify = findViewById(R.id.verify)
        txtVerify.setOnClickListener {
            val intent = Intent(this, Almostthere::class.java)
            startActivity(intent)
        }
    }
}
package com.example.a10120215latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Almostthere : AppCompatActivity() {
    private lateinit var txtSend: View
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_almostthere)

        txtSend = findViewById(R.id.send)
        txtSend.setOnClickListener {
            val intent = Intent(this, Verifyaccnt::class.java)
            startActivity(intent)
        }
    }
}
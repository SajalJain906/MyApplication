package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_hello_world.*

class Hello_world : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hello_world)
        Log.i("Intents", "Action = ${intent.action}")
        val name = intent.getStringExtra("name")
        Log.i("Intents", "Text = ${name}")

        headline.setText("Hello, "+ name)

    }
}
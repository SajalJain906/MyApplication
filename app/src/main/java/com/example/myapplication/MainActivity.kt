package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val submission = findViewById<Button>(R.id.submit_button)
        //val editName = findViewById<EditText>(R.id.editTextTextPersonName)

        //submission.setOnClickListener{open_next_activity(name_id = editName) }
        submit_button.setOnClickListener{open_next_activity(name_id = editTextTextPersonName) }
    }

    private fun open_next_activity(name_id: EditText) {
        val intent = Intent(this, Hello_world::class.java)
        intent.action = Intent.ACTION_VIEW
        val text = name_id.text.toString()
        intent.putExtra("name",text)
        startActivity(intent)
    }
}

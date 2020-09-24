package com.example.myapplication

import android.Manifest.permission
import android.Manifest.permission.CAMERA
import android.Manifest.permission.READ_EXTERNAL_STORAGE
import android.content.Intent
import android.content.pm.PackageManager
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat
import androidx.core.content.PermissionChecker.PERMISSION_GRANTED
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import java.util.jar.Manifest

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ActivityCompat.requestPermissions(this, arrayOf(CAMERA), 100)

        setContentView(R.layout.activity_main)

        if (ContextCompat.checkSelfPermission(this,permission.CAMERA) == PERMISSION_GRANTED){
            Toast.makeText(this,"Application has permission for reading external storage",Toast.LENGTH_SHORT).show()
        }
        else{
            //val foo = ActivityCompat.shouldShowRequestPermissionRationale(this,permission.CAMERA)
            Toast.makeText(this,"External storage permission is essential for this application",Toast.LENGTH_LONG).show()
        }

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

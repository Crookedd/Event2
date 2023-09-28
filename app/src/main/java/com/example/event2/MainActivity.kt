package com.example.event2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    companion object {
        private const val Log_Tag = "From Edit Text"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Timber.plant(Timber.DebugTree())


        var input = findViewById<EditText>(R.id.editTextText)
        var logId = findViewById<Button>(R.id.button_log)
        var timberid = findViewById<Button>(R.id.button_timber)

        logId.setOnClickListener() {
           if (input.text.toString().isEmpty()) {
               Toast.makeText(applicationContext, "Введите текст", Toast.LENGTH_SHORT).show()
            } else {
                Log.d(Log_Tag, input.text.toString())
           }
        }
        timberid.setOnClickListener() {
            if (input.text.toString().isEmpty()) {
                Toast.makeText(applicationContext, "Введите текст", Toast.LENGTH_SHORT).show()
            } else {
                Timber.d(input.text.toString())
            }
        }
    }
}
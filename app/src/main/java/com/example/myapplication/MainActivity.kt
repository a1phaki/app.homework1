package com.example.myapplication

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

@Suppress("DEPRECATION")
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText3 = findViewById<EditText>(R.id.editTextTextPersonName5)
        editText3.isEnabled = false
        val editText4 = findViewById<EditText>(R.id.editTextTextPersonName6)
        editText4.isEnabled =false
        val button1 = findViewById<Button>(R.id.button3)
        button1.isEnabled =false

        val button = findViewById<Button>(R.id.button)
        button.setOnClickListener {
            val editText = findViewById<EditText>(R.id.editTextTextPersonName)
            val editText2 = findViewById<EditText>(R.id.editTextTextPersonName2)

            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra("key1", editText.text.toString())
            intent.putExtra("key2", editText2.text.toString())
            startActivity(intent)
            finish()
        }
        button1.setOnClickListener{
            finish()
        }


        intent?.extras?.let {
            val value = it.getString("key1")
            val value2 = it.getString("key2")
            val value3 = it.getString("key3")
            val value4 = it.getString("key4")
            val editText1 = findViewById<EditText>(R.id.editTextTextPersonName)
            editText1.setText(value.toString())
            editText1.isEnabled = false
            val editText2 = findViewById<EditText>(R.id.editTextTextPersonName2)
            editText2.setText(value2.toString())
            editText2.isEnabled = false
            val editText3 = findViewById<EditText>(R.id.editTextTextPersonName5)
            editText3.setText(value3.toString())
            editText3.isEnabled = false
            val editText4 = findViewById<EditText>(R.id.editTextTextPersonName6)
            editText4.setText(value4.toString())
            editText4.isEnabled = false
            button1.isEnabled=true

        }


    }
}
package com.example.myapplication

import android.annotation.SuppressLint
import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val button2=findViewById<Button>(R.id.button2)
            button2.setOnClickListener{
                val editText=findViewById<EditText>(R.id.editTextTextPersonName4)
                val editText2=findViewById<EditText>(R.id.editTextTextPersonName3)
                val editText3=findViewById<EditText>(R.id.editTextTextPersonName7)
                val editText4=findViewById<EditText>(R.id.editTextTextPersonName8)

                val intent=Intent(this,MainActivity::class.java)
                intent.putExtra("key1",editText3.text.toString())
                intent.putExtra("key2",editText4.text.toString())
                intent.putExtra("key3",editText.text.toString())
                intent.putExtra("key4",editText2.text.toString())
                startActivity(intent)
                finish()
            }
        intent?.extras?.let{
                val value=it.getString("key1")
                val value2=it.getString("key2")
                val editText3=findViewById<EditText>(R.id.editTextTextPersonName7)
                editText3.setText(value.toString())
                editText3.isEnabled = false
                val editText4=findViewById<EditText>(R.id.editTextTextPersonName8)
                editText4.setText(value2.toString())
                editText4.isEnabled = false
        }
    }
}
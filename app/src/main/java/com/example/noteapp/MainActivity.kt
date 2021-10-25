package com.example.noteapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var bt:Button
    lateinit var et:EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bt =findViewById(R.id.b)
        et =findViewById(R.id.et)

        bt.setOnClickListener { AddToDB() }


    }
    fun AddToDB(){
        var db=dbhelper(this)
        db.addNote(et.text.toString())
        et.text.clear()
        Toast.makeText(this, "Added", Toast.LENGTH_SHORT).show()
    }
}
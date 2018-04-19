package com.example.apo.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import com.example.apo.myapplication.R.id.textView1

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.button1) as Button
        button1.setOnClickListener(this)

    }

    override fun onClick(v: View?) {
        val editText1 = findViewById(R.id.editText1) as EditText
        val editText2 = findViewById(R.id.editText2) as EditText
        val textView1 = findViewById(R.id.textView1) as TextView
        val a : Int = Integer.parseInt(editText1.text.toString())
        val b : Int = Integer.parseInt(editText2.text.toString())
        val c : Int = a + b
        val d : String = (c).toString()
        textView1.text=d

    }
}

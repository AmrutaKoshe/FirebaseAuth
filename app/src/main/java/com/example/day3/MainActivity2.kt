package com.example.day3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {


    var count = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
    }


    fun onTap(view: View) {
        count+=1

        val textview = findViewById(R.id.textView) as TextView
        textview.text = "$count"
    }

    fun click(view: View) {
        count = 0

        val textview = findViewById(R.id.textView) as TextView
        textview.text = "$count"
    }
}
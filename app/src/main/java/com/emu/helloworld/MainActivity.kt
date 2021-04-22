package com.emu.helloworld

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

       val addButton = findViewById<Button>(R.id.button)
        val textValue = findViewById<TextView>(R.id.textView)

        addButton.setOnClickListener{
            val stringValue = textValue.text.toString()
            val originalValue = Integer.parseInt(stringValue);
            val newValue = add1(originalValue)
            textValue.text = newValue.toString()

        }
    }

    fun add1(num: Int):Int{
        return num + 1
    }
}
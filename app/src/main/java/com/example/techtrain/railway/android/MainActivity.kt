package com.example.techtrain.railway.android

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saveBtn = findViewById<Button>(R.id.save_button)
        val textEditor = findViewById<EditText>(R.id.top_text_editor)
        val savedTextView = findViewById<TextView>(R.id.saved_text_view)

        saveBtn.setOnClickListener {
            val newText = textEditor.text
            savedTextView.text = newText
        }
    }
}

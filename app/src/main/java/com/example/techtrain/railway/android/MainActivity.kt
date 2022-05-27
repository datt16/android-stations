package com.example.techtrain.railway.android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.techtrain.railway.android.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val saveBtn = binding.saveButton
        val textEditor = binding.topTextEditor
        val savedTextView = binding.savedTextView

        saveBtn.setOnClickListener {
            val newText = textEditor.text
            savedTextView.text = newText
        }
    }
}

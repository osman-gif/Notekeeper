package com.example.notekeeper

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import com.example.notekeeper.databinding.ActivityNoteBinding

class NoteActivity : AppCompatActivity() {
    private lateinit var  binding : ActivityNoteBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding = ActivityNoteBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.spinner.adapter = ArrayAdapter(this,android.R.layout.simple_spinner_item,DataManager.courses.values.toList())
    }
}
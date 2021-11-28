package com.example.notekeeper

import android.R
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.notekeeper.databinding.ActivityNotelistBinding
import com.example.notekeeper.databinding.ContentNoteListBinding

class NotelistActivity : AppCompatActivity() {
    private lateinit var  binding: ActivityNotelistBinding
    private lateinit var binding2: ContentNoteListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNotelistBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding2 = ContentNoteListBinding.inflate(layoutInflater)


        binding.fab.setOnClickListener {
            val activityIntentf = Intent(this,NoteActivity::class.java)
            startActivity(activityIntentf)
        }
        binding.listItem.layoutManager = LinearLayoutManager(this)
        binding.listItem.adapter = NoteRecyclerView(this,DataManager.notes)

    }
}
package com.example.notekeeper

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.notekeeper.DataManager.notes

class NoteRecyclerView(var contxet:Context,noteList:List<NoteInfo>):RecyclerView.Adapter<NoteRecyclerView.ViewHolder>() {
    private var layoutInflater = LayoutInflater.from(contxet)

    inner class ViewHolder(itemView : View):RecyclerView.ViewHolder(itemView){
         var textCourse = itemView.findViewById<TextView>(R.id.textNoteTitle)
        var textNote = itemView.findViewById<TextView>(R.id.textNoteText)
        var notePosition = 0
        init {
            itemView.setOnClickListener {
                val intent = Intent(contxet,NoteActivity::class.java)
                intent.putExtra(EXTRA_NOTE_POSITION, POSITION_NOT_SET)
                contxet.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        var itemView = layoutInflater.inflate(R.layout.items_note_list,parent,false)
        return ViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
      var note = notes[position]
      holder.textCourse.text =note.course.title
        holder.textNote.text = note.title

    }

    override fun getItemCount()= notes.size
}

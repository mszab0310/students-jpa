package com.example.students.rest;

import com.example.students.model.Note;
import com.example.students.services.NoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class NotesController {
    @Autowired
    private NoteService noteService;

    @GetMapping("/students/notes")
    public List<Note> getNotes(){
        return noteService.getAllNotes();
    }

    @PostMapping("/students/notes")
    public void addnote(@RequestBody Note note){
        noteService.addNote(note);
    }


}

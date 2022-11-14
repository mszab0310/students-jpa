package com.example.students.services;

import com.example.students.model.Note;
import com.example.students.model.Student;
import com.example.students.repos.NoteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteService {
    @Autowired
    private NoteRepository noteRepository;

    public List<Note> getAllNotes(){
        return noteRepository.findAll();
    }

    public void addNote(Note note){
        noteRepository.save(note);
    }
}

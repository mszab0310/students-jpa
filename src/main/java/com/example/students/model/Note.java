package com.example.students.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "notes")
@Getter
@Setter
@NoArgsConstructor
public class Note {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column
    private float note;

    @ManyToOne(cascade = CascadeType.ALL)
    private Student student;

    public Note(Student student, float note){
        this.student = student;
        this.note = note;
    }


}

package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column
    private long studentId;

    @Column
    private String studentName;

    @Column
    private int studentAge;

    @Column
    private String studentPhone;

    @Column
    private String studentAddress;

    // join: Lid Lname
    @ManyToOne
    @JoinColumn(name = "lesson_id")
    private Lesson lesson;

}
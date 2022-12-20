package com.dw.springcrudjpa.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "lesson")
public class Lesson {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "lesson_id")
    private long lessonId;

    @Column
    private String lessonName;

    @Column
    private String lessonRoom;

    @Column
    private String lessonStartDay;

    @Column
    private String lessonEndDay;

    @Column
    private String lessonTeacher;
    

    // join: Lid Lname
}
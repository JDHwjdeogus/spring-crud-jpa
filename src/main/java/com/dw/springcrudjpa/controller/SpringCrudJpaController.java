package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Lesson;
import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;
import com.dw.springcrudjpa.repository.LessonRepo;

@RestController
public class SpringCrudJpaController {
    @Autowired 
    StudentRepo studentRepo;
    LessonRepo lessonRepo;

    // student
    @GetMapping("/student")
    public List<Student> callAllStudetns(){
        return studentRepo.findAll();
    }

    // lesson
    @GetMapping("/lesson")
    public List<Lesson> callAllLessons(){
        return lessonRepo.findAll();
    }
}


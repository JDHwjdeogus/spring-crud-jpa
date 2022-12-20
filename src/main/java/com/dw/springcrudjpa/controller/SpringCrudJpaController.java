package com.dw.springcrudjpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.dw.springcrudjpa.model.Lesson;
import com.dw.springcrudjpa.model.Student;
import com.dw.springcrudjpa.repository.StudentRepo;
import com.dw.springcrudjpa.repository.LessonRepo;

@RestController
public class SpringCrudJpaController {
    @Autowired 
    StudentRepo studentRepo;
    
    @Autowired 
    LessonRepo lessonRepo;

    // === student ===

    // 전체조회
    @GetMapping("/student")
    public List<Student> callAllStudetns(){
        return studentRepo.findAll();
    }
    // 상세조회
    @GetMapping("/student/{studentId}")
	public Student callStudentById(@PathVariable long studentId) {
		return studentRepo.findById(studentId).get();
	}
    // 추가
    @PostMapping("/student")
    public Student callSaveStudent(@RequestBody Student student) {
        student = studentRepo.save(student);
        return student;
    }
    // 삭제
    @DeleteMapping("/student/{studentId}")
    public boolean callDeleteStudent(@PathVariable long studentId) {
        try {
            studentRepo.deleteById(studentId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // 수정
    @PatchMapping("/student")
    public Student updateStudent(@RequestBody Student student) {
        student = studentRepo.save(student);
        return student;
    }



    // === lesson ===

    // 전체조회
    @GetMapping("/lesson")
    public List<Lesson> callAllLessons(){
        return lessonRepo.findAll();
    }
    // 상세조회
    @GetMapping("/lesson/{lessonId}")
	public Lesson callLessonById(@PathVariable long lessonId) {
		return lessonRepo.findById(lessonId).get();
	}
    // 추가
    @PostMapping("/lesson")
    public Lesson callSaveLesson(@RequestBody Lesson lesson) {
        lesson = lessonRepo.save(lesson);
        return lesson;
    }
    // 삭제
    @DeleteMapping("/lesson/{lessonId}")
    public boolean callDeleteLesson(@PathVariable long lessonId) {
        try {
            lessonRepo.deleteById(lessonId);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    // 수정
    @PatchMapping("/lesson")
    public Lesson updateStudent(@RequestBody Lesson lesson) {
        lesson = lessonRepo.save(lesson);
        return lesson;
    }


}


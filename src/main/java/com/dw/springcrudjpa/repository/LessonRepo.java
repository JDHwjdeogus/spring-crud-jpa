package com.dw.springcrudjpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dw.springcrudjpa.model.Lesson;

public interface LessonRepo extends JpaRepository<Lesson, Long> {
    
}
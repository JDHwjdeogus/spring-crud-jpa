package com.dw.springcrudjpa.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SpringCrudJpaPageController {

    @GetMapping("/student-page")
    public String callIndexPage(){
        return "index";
    }

    @GetMapping("/lesson-page")
    public String callLessonPage(){
        return "dept";
    }
}
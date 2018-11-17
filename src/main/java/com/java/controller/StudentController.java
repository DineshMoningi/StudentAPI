package com.java.controller;

import com.java.dto.Student;
import com.java.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("/students")
    public List<Student> getStudents() {
         return studentService.getStudents();
    }
    @RequestMapping("/student/{id}")
    public Student getStudent(@PathVariable("id") int rollNumber) {
        return studentService.getStudent(rollNumber);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/student/{id}")
    public Student updateStudent(@RequestBody Student student, @PathVariable("id") int rollNumber) {
        return studentService.updateStudent(student, rollNumber);
    }

    @RequestMapping(method = RequestMethod.DELETE, value="/student/{id}")
    public void removeStudent(@PathVariable("id") int rollNumber) {
        studentService.deleteStudent(rollNumber);
    }
}

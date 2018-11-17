package com.java.service;

import com.java.dto.Student;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class StudentService {
    private List<Student> students = new ArrayList<>(Arrays.asList(new Student(1, "X", 29),
            new Student(2, "Y", 20),
            new Student(3, "Z", 25),
            new Student(4, "A", 29)));

    public List<Student> getStudents() {
        return students;
    }

    public Student getStudent(int rollNumber) {
        return students.stream().filter((student) -> student.getRollNumber() == rollNumber
        ).findFirst().get();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public Student updateStudent(Student student, int rollNumber) {
        students.stream().filter(st -> st.getRollNumber() == rollNumber).findFirst().get().setRollNumber(student.getRollNumber());
        students.stream().filter(st -> st.getRollNumber() == rollNumber).findFirst().get().setAge(student.getAge());
        students.stream().filter(st -> st.getRollNumber() == rollNumber).findFirst().get().setName(student.getName());
        return students.stream().filter(st -> st.getRollNumber() == rollNumber).findFirst().get();
    }

    public void deleteStudent(int id) {
        students.removeIf(student -> student.getRollNumber() == id);
    }
}

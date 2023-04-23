package com.example.demo.student;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

public class StudentService {
    public StudentService() {
    }

    public List<Student> getStudents() {
        return List.of(
                new Student(
                        1L,
                        "Mariam",
                        LocalDate.of(2000, Month.APRIL, 5),
                        21 ,
                        "test@test.com"
                )
        );
    }

}
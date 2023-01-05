package com.example.one2manyshkolata.controller;

import com.example.one2manyshkolata.model.Student;
import com.example.one2manyshkolata.service.student.StudentService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(StudentController.PATH)
@RequiredArgsConstructor
public class StudentController {
    public static final String PATH = "/student/";
    private final StudentService studentService;

    @GetMapping
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @GetMapping(value = "{studentId}")
    public Student getByStudentId(@PathVariable int studentId) {
        return studentService.getByStudentId(studentId);
    }

    @GetMapping(value = "school")
    public List<Student> getBySchoolId(@RequestParam int value) {
        return studentService.getBySchoolId(value);
    }
}

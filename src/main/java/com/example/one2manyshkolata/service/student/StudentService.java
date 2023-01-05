package com.example.one2manyshkolata.service.student;

import com.example.one2manyshkolata.model.School;
import com.example.one2manyshkolata.model.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAll();
    Student getByStudentId(int Id);

    List<Student> getBySchoolId(int school);

}

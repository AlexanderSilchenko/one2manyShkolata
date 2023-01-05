package com.example.one2manyshkolata.dao.student;

import com.example.one2manyshkolata.model.School;
import com.example.one2manyshkolata.model.Student;

import java.util.List;

public interface StudentDao {
    List<Student> getAll();
    Student getByStudentId(int studentId);

    List<Student> getBySchoolId(int school);
}

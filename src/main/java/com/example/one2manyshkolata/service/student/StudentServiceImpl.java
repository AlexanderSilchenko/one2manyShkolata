package com.example.one2manyshkolata.service.student;

import com.example.one2manyshkolata.dao.student.StudentDao;
import com.example.one2manyshkolata.model.School;
import com.example.one2manyshkolata.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class StudentServiceImpl implements StudentService {
    private final StudentDao studentDao;
    @Override
    public List<Student> getAll() {
        return studentDao.getAll();
    }

    @Override
    public Student getByStudentId(int id) {
        return studentDao.getByStudentId(id);
    }

    @Override
    public List<Student> getBySchoolId(int school) {
        return studentDao.getBySchoolId(school);
    }

}

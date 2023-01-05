package com.example.one2manyshkolata.service.school;

import com.example.one2manyshkolata.dao.school.SchoolDao;
import com.example.one2manyshkolata.model.School;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
@RequiredArgsConstructor
public class SchoolServiceImpl implements SchoolService {

    private final SchoolDao schoolDao;
    @Override
    public List<School> getAll() {
        return schoolDao.getAll();
    }

    @Override
    public School getBySchoolId(int schoolId) {
        return schoolDao.getBySchoolId(schoolId);
    }
}

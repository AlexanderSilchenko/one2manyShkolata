package com.example.one2manyshkolata.service.school;

import com.example.one2manyshkolata.model.School;

import java.util.List;

public interface SchoolService {
    List<School> getAll();

    School getBySchoolId(int schoolId);
}

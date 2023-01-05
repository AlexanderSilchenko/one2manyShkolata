package com.example.one2manyshkolata.dao.school;

import com.example.one2manyshkolata.model.School;

import java.util.List;

public interface SchoolDao {
    List<School> getAll();
    School getBySchoolId(int schoolId);
}

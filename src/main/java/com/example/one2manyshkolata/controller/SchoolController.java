package com.example.one2manyshkolata.controller;

import com.example.one2manyshkolata.model.School;
import com.example.one2manyshkolata.service.school.SchoolService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(SchoolController.PATH)
@RequiredArgsConstructor
public class SchoolController {
    public static final String PATH = "/school/";
    private final SchoolService schoolService;

    @GetMapping
    public List<School> getAll() {
        return schoolService.getAll();
    }

    @GetMapping(value = "{schoolId}")
    public School getBySchoolId(@PathVariable int schoolId) {
        return schoolService.getBySchoolId(schoolId);
    }
}

package com.example.one2manyshkolata.dao.student;

import com.example.one2manyshkolata.model.School;
import com.example.one2manyshkolata.model.Student;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class StudentDaoImpl implements StudentDao {

    private static final String GET_ALL = "SELECT b FROM Student b";
    private static final String GET_BY_SCHOOL_ID = "SELECT b FROM Student b WHERE b.school.schoolId = :school";
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<Student> getAll() {
        Query query = entityManager.createQuery(GET_ALL);
        return query.getResultList();
    }

    @Override
    public Student getByStudentId(int studentId) {
        return entityManager.find(Student.class, studentId);
    }

    @Override
    public List<Student> getBySchoolId(int school) {
        Query query = entityManager.createQuery(GET_BY_SCHOOL_ID);
        query.setParameter("school", school);
        return query.getResultList();
    }


}

package com.example.one2manyshkolata.dao.school;

import com.example.one2manyshkolata.model.School;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;

@Repository
public class SchoolDaoImpl implements SchoolDao {

    private static final String GET_ALL = "SELECT b FROM School b";
    @PersistenceContext
    private EntityManager entityManager;
    @Override
    public List<School> getAll() {
        Query query = entityManager.createQuery(GET_ALL);
        return query.getResultList();
    }

    @Override
    public School getBySchoolId(int schoolId) {
        return entityManager.find(School.class, schoolId);
    }
}

package com.hasitha.onetomany.service.impl;

import com.hasitha.onetomany.dao.impl.StudentDAOImpl;
import com.hasitha.onetomany.entity.Student;
import com.hasitha.onetomany.service.StudentService;
import org.hibernate.HibernateException;

public class StudentServiceImpl implements StudentService {
    @Override
    public int addStudent(Student student) throws HibernateException {
        return new StudentDAOImpl().addStudent(student);
    }


}

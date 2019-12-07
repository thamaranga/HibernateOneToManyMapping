package com.hasitha.onetomany.service;


import com.hasitha.onetomany.entity.Student;
import org.hibernate.HibernateException;

public interface StudentService {

    int addStudent(Student student) throws HibernateException;

}

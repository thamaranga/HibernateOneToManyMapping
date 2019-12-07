package com.hasitha.onetomany.dao;

import com.hasitha.onetomany.entity.Student;
import org.hibernate.HibernateException;

public interface StudentDAO {

    int addStudent(Student student) throws HibernateException;

}

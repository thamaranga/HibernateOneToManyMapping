package com.hasitha.onetomany.dao;

import com.hasitha.onetomany.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopDAO {

    int addLaptop(Laptop laptop) throws HibernateException;

}

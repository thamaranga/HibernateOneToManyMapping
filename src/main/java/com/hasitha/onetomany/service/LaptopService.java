package com.hasitha.onetomany.service;


import com.hasitha.onetomany.entity.Laptop;
import org.hibernate.HibernateException;

public interface LaptopService {

    int addLaptop(Laptop laptop) throws HibernateException;

}

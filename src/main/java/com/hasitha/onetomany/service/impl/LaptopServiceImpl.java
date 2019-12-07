package com.hasitha.onetomany.service.impl;

import com.hasitha.onetomany.dao.impl.LaptopDAOImpl;
import com.hasitha.onetomany.entity.Laptop;
import com.hasitha.onetomany.service.LaptopService;
import org.hibernate.HibernateException;

public class LaptopServiceImpl implements LaptopService {
    @Override
    public int addLaptop(Laptop laptop) throws HibernateException {
        return new LaptopDAOImpl().addLaptop(laptop);
    }


}

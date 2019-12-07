package com.hasitha;

import com.hasitha.entity.Laptop;
import com.hasitha.entity.Student;
import com.hasitha.service.LaptopService;
import com.hasitha.service.StudentService;
import com.hasitha.service.impl.LaptopServiceImpl;
import com.hasitha.service.impl.StudentServiceImpl;


public class App 
{
    public static void main( String[] args )
    {

        int result=-1;


        try {

            LaptopService laptopService= new LaptopServiceImpl();
            StudentService studentService= new StudentServiceImpl();


            Student student= new Student();
            student.setName("Hasitha");
            student.setMarks(90);
            result=studentService.addStudent(student);



            if(result>0){
                System.out.println("student successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving student");
            }


            Laptop laptop1= new Laptop();
            laptop1.setName("Lenovo 120");
            laptop1.setStudent(student);
            result=laptopService.addLaptop(laptop1);

            if(result>0){
                System.out.println("laptop1 successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving laptop1");
            }

            Laptop laptop2= new Laptop();
            laptop2.setName("HP 630");
            laptop2.setStudent(student);
            result=laptopService.addLaptop(laptop2);

            if(result>0){
                System.out.println("laptop2 successfully saved with ID "+result);
            }else{
                System.out.println("Error occured while saving laptop2");
            }




        } catch (Exception e) {

            System.out.println("e "+e.getMessage());
        }


    }
}

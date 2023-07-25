package com.khadri.spring.core.dao;

import org.springframework.stereotype.Component;

@Component
public class StudentDao {
    public void findById(Integer stdId){
        System.out.println("Student findById "+stdId);
    }

    public Integer find(){
        System.out.println("Student find ");
        return 200;
    }

    public void findName(){
        System.out.println("Student find Name ");
        throw new RuntimeException("Name not found");
    }

    public void findByAddress(){
        System.out.println("Student find By Address");
    }
}

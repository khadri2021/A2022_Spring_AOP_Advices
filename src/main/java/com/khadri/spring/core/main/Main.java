package com.khadri.spring.core.main;


import com.khadri.spring.core.config.AppConfig;
import com.khadri.spring.core.dao.StudentDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        StudentDao studentDao = context.getBean(StudentDao.class);
        studentDao.findById(101);
        studentDao.find();
        studentDao.findByAddress();
        studentDao.findName();

    }
}
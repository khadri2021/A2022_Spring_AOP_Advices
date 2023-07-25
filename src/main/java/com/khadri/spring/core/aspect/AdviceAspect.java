package com.khadri.spring.core.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AdviceAspect {

    @Pointcut("execution(void com.khadri.spring.core.dao.StudentDao.findById(Integer))")
    public void pointCutExpr(){}


    @Before("pointCutExpr()")
    public void beforeAdvice(){
        System.out.println("Before Advice");
    }

    @AfterReturning(pointcut = "execution(Integer com.khadri.spring.core.dao.StudentDao.find())",returning = "stdId")
    public void afterReturningAdvice(Integer stdId){
        System.out.println("After return advice "+stdId);
    }

    @AfterThrowing(pointcut = "execution(void com.khadri.spring.core.dao.StudentDao.findName())",throwing = "exception")
    public void afterThrowingAdvice(RuntimeException exception){
        System.out.println("After throwing advice. "+exception.getMessage());
    }

    @After("execution(void com.khadri.spring.core.dao.StudentDao.findName())")
    public void afterAdvice(){
        System.out.println("after advice");
    }

    @Around("execution(void com.khadri.spring.core.dao.StudentDao.findByAddress())")
    public void aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("before around advice");
        proceedingJoinPoint.proceed();
        System.out.println("after around  advice");
    }

}

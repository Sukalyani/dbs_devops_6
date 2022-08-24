package com.dbs.aop;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Around;
import org.springframework.context.annotation.Configuration;
@Aspect
@Configuration
public class DBSAOPConfig {
    
    
    @Before(value = "execution(* com.dbs.aop.*.*(..))")
    public void firstAspect(JoinPoint joinPoint) {
        System.out.println("Before DBS Batch6 got Executed!!!!!!!!!!!!");
    }
    
    @After(value = "execution(* com.dbs.aop.*.*(..))")
    public void secondAspect(JoinPoint joinPoint) {
        System.out.println("After############ DBS Batch6 got Executed#############");
    }
    
    @Around(value = "execution(* com.dbs.aop.*.*(..))")
    public Object aroundDBSAspect(ProceedingJoinPoint joinPoint) {
        long start = System.currentTimeMillis();
        Object obj;
        try {
            System.out.println("From Aroung Notation$$$$$$$$$$$$$$$$Method started!!!!!!!!!!!!");
            obj = joinPoint.proceed();
            long timeTaken=System.currentTimeMillis()-start;
            System.out.println("Time taken------->"+timeTaken);
            return obj;
        } catch (Throwable e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return null;
    }
}

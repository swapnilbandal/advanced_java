package com.app.aop.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class MyLoggingAspectDemo {
//	@Before("execution(public void com.app.dao.aop.AccountDao.addAccount())")
//	public void addAccountBeforeAdvice() {
//		System.out.println("Advice Called...");
//	}
	
	@Before("execution(public void add*(..))")
	public void addAccountBeforeAdvice() {
		System.out.println("Executing @before Advice on Add Account Called...");
	}
	 
	@After("execution(public void add*(..))")
	public void addAccountBeforeAdvice1() {
		System.out.println("Executing @After Advice on Add Account Called...");
	}
}

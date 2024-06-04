package com.app.dao.aop;

import org.springframework.stereotype.Component;

@Component
public class AccountDao {
	public void addAccount() {
		System.out.println("Adding AccountDao..addAccount.");
	}
	public String doWork(int a,int b) {
		return "Executing AccDao. dowork..";
	}
}

package com.app.dao.aop;

import org.springframework.stereotype.Component;
@Component
public class MembershipDao {
	
	public void add123() {
			System.out.println("MemberDao Add acoount...");
	}
	public String doWork(int a,int b) {
		return "Membership Dao:dowork";
	}
}

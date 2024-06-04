package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import com.app.dao.aop.AccountDao;
import com.app.dao.aop.MembershipDao;

@Configuration
@EnableAspectJAutoProxy
@ComponentScan(basePackages="com.app.aop")
public class DemoConfig {
	@Bean(name="bean1")
	public AccountDao accountdao() {
		
		return new AccountDao();
	}
	@Bean(name="bean2")
	public MembershipDao memberDao() {
		return new MembershipDao();
		}
}

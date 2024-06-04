package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.app.entity.Human;

public class App {
	public static void main(String[] args) {
		ApplicationContext context= new ClassPathXmlApplicationContext("beans.xml");
		Human human= context.getBean("human",Human.class);
		human.pumping();
		
	}
}

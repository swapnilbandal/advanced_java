package com.app.utility;

import java.util.ArrayList;
import java.util.List;

import com.app.model.Student;

public class StudentUtility {
	public static List<Student> getStudentList(){
		ArrayList<Student> l= new ArrayList<Student>();
		l.add(new Student("swapnil","Bandal","swapnilbandal211@gmail.com"));
		l.add(new Student("Pranav","Bandal","swapnilbandal211@gmail.com"));
		l.add(new Student("swapnil","Bandal","swapnilbandal211@gmail.com"));
		l.add(new Student("swapnil","Bandal","swapnilbandal211@gmail.com"));
		l.add(new Student("swapnil","Bandal","swapnilbandal211@gmail.com"));
		l.add(new Student("swapnil","Bandal","swapnilbandal211@gmail.com"));
		
		
		return l;
	}
}

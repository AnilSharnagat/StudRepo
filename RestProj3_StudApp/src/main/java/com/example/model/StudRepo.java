package com.example.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudRepo {
	public static List<Student> getAllStud(){
	List<Student> studList = new ArrayList<Student>();
	// initialize Student obj1
	Student s1 = new Student();
	s1.setRollNo(1001);
	s1.setsName("Anil");
	s1.setResult("PASS");
	// initialize Student obj2
	Student s2 = new Student();
	s2.setRollNo(1002);
	s2.setsName("Ram");
	s2.setResult("PASS");
	// initialize Student obj1
	Student s3 = new Student();
	s3.setRollNo(1005);
	s3.setsName("Pari");
	s3.setResult("FAIL");
	// now adding to list
	studList.add(s1);
	studList.add(s2);
	studList.add(s3);
	return studList;
}
	public static Map<Integer,Student> getAllStuds(){
		Map<Integer,Student> studList = new HashMap<Integer,Student>();
		// initialize Student obj1
		Student s1 = new Student();
		s1.setRollNo(1001);
		s1.setsName("Anil");
		s1.setResult("PASS");
		// initialize Student obj2
		Student s2 = new Student();
		s2.setRollNo(1002);
		s2.setsName("Ram");
		s2.setResult("PASS");
		// initialize Student obj1
		Student s3 = new Student();
		s3.setRollNo(1005);
		s3.setsName("Pari");
		s3.setResult("FAIL");
		// now adding to list
		studList.put(s1.getRollNo(),s1);
		studList.put(s2.getRollNo(),s2);
		studList.put(s3.getRollNo(),s3);
		return studList;
	}
}

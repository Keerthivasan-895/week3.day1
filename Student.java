package org.student;

import org.college.College;
import org.department.Department;

public class Student extends Department {
	
	public static void main(String[] args) {
		Student s=new Student();
		s.collegeName();
		s.collegeCode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentId();
	}
	
	public static void studentName() {
		System.out.println("The Student Name: Praveen");
	}
	public void studentDept() {
		System.out.println("The Student Department: Information Technology");
	}
public void studentId() {
	System.out.println("The Student ID: IT1234");
}
}

package com.javastaticvariable;

public class TestStaticVariable1 {

	public static void main(String[] args) {
		Student s1=new Student(111, "Peter");
		Student s2=new Student(222, "Aryan");
		Student.college="UR";
		s1.display();
		s2.display();

	}

}

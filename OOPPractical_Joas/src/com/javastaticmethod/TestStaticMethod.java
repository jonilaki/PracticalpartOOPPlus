package com.javastaticmethod;

public class TestStaticMethod {

	public static void main(String[] args) {
		Student.change();
		Student s1=new Student(111,"Allen");
	   Student s2=new Student(222,"Aryan");
	   Student s3=new Student(333,"Nancy");
	   s1.display();
	   s2.display();
	   s3.display();

	}

}

package com.javathiskeyword;

public class StudentThis {
	int rollno;
	String name;
	float fee;
	StudentThis(int rollno,String name,float fee)
	{
		this.rollno=rollno;
		this.name=name;
		this.fee=fee;
	}
	void display() {
		System.out.println(rollno+" "+name+" "+fee);
	}

}

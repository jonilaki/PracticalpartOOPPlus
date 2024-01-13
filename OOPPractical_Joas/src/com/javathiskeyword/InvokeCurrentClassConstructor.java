package com.javathiskeyword;

public class InvokeCurrentClassConstructor {
	
	InvokeCurrentClassConstructor(){
		System.out.println("Hello a");
		}
	InvokeCurrentClassConstructor(int x){
		this();
		System.out.println(x);
	}
}

package com.javathiskeyword;

public class InvokeCurrentClassMethod {
void m() {
	System.out.println("Hello m");
}
void n() {
	System.out.println("Hello n");
	this.m();
}
}

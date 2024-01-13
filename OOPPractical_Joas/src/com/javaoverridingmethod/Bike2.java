package com.javaoverridingmethod;

public class Bike2 extends Vehicle {
	void run()
	{
		System.out.println("Bike is running safely");
		}
	public static void main(String args[]){
		Bike2 obj = new Bike2();//creating object
		Vehicle veh=new Vehicle();
		veh.run();
		obj.run();//calling method
		
		
		}

}

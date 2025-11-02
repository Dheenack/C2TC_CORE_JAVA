package com.tnsif.ifet.day8.interfaces.instanceofDemo;

public class Executor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Phone p1 = PhoneFactory.createPhone("Samsung"); 
		p1.call();
		p1.sms();
		if(p1 instanceof Samsung && p1 instanceof Phone) {
			System.out.println("It's Samsung Instance");
		}
		p1 = PhoneFactory.createPhone("Jio"); 
		p1.call();
		p1.sms();
		if(p1 instanceof Jio && p1 instanceof Phone) {
			System.out.println("It's Jio Instance");
		}
	}

}

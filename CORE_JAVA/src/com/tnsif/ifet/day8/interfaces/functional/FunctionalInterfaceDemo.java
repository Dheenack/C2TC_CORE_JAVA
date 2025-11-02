package com.tnsif.ifet.day8.interfaces.functional;

public class FunctionalInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GreetClass g = new GreetClass();
		System.out.println(g.greet());

		//	Functional Interface with Lambda Expression
		GreetInterface g1 = () -> {
			return "Good Afternoon";
		};

		System.out.println(g1.greet());

	}

}

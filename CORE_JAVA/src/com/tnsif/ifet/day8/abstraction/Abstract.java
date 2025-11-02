package com.tnsif.ifet.day8.abstraction;

public class Abstract {

	public static void main(String[] args) {
		
		Square sq=new Square();
		Rectangle r1=new Rectangle();
		sq.calArea();
		sq.show();
		r1.calArea();
		r1.show();
		
		System.out.println("_________");
		//	Runtime Polymorphism / Dynamic Binding / Late Binding
		//	Ex: Method Overriding
			
		Shape shape;
		shape = new Square(12.5f);
		
		shape.calArea();
		shape.show();
		
		shape = new Rectangle(10,20);
		
		shape.calArea();
		shape.show();
	}

}

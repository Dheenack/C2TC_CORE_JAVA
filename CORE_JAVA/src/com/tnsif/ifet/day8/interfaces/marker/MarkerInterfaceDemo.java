package com.tnsif.ifet.day8.interfaces.marker;

public class MarkerInterfaceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(153,"Vignesh",53000,"C++");
		
		if (s instanceof Registrable )
			System.out.println("Student is registered for the course");
		else
			System.out.println("Student is not registered for the course");
	}

}

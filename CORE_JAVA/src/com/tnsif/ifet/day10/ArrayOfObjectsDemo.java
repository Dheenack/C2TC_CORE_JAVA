package com.tnsif.ifet.day10;
public class ArrayOfObjectsDemo {
	public static void main(String[] args) {
		Student[] arr;
		arr = new Student[5];
		arr[0] = new Student(1, "Shagul");
		arr[1] = new Student(2, "Vignesh");
		arr[2] = new Student(3, "Nithish");
		arr[3] = new Student(4, "Logesh");
		arr[4] = new Student(5, "Sugunthan");
		for (int i = 0; i < arr.length; i++)
			System.out.println("Element at " + i + " : " + arr[i].getRollNo()+ " " + arr[i].getName());
	}
}

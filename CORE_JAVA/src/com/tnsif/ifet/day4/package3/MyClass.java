package com.tnsif.ifet.day4.package3;

public class MyClass {
	
	private static MyClass obj=new MyClass();
	private int id;
	
	//Some changes
	public int getId()
	{
		// returning something
		return id;
	}
	
	public void setId(int id)
	{
		this.id=id;
	}
	
	private MyClass() {
		System.out.println("MyClass object created");		
	}
	
	public static MyClass getObject() //factory method
	{
		return obj;
	}

	@Override
	public String toString() {
		return "MyClass [id=" + id + "]";
	}
	
}

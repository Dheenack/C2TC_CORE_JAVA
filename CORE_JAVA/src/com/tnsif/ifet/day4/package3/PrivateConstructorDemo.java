package com.tnsif.ifet.day4.package3;

public class PrivateConstructorDemo {
	public static void main(String s[]) {
		
		MyClass m=MyClass.getObject();
		m.setId(10);
		
		MyClass m1=MyClass.getObject();
		
		System.out.println(m);
		System.out.println(m1);
}

}
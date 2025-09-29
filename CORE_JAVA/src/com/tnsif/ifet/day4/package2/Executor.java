package com.tnsif.ifet.day4.package2;

import com.tnsif.ifet.day4.package1.Base;

public class Executor {
	public static void main(String[] args) {
		Base b1 = new Base();
		b1.methodPublic();
		b1.varPublic = 41;
		b1.methodPublic();
	}
}

//Program to demonstrate Callable Statement Interface
package com.tnsif.ifet.day22.callablestatementinterface;

public class Executor {

	public static void main(String[] args) {
		int res = 0;

		/*
		 * res = UsingCallableStmt.createProcedure1(); if (res == 1)
		 * System.out.println("Procedure Created.....");
		 */

		res = UsingCallableStmt.callProcedure1(1, "Vignesh", 60000);
		if (res != 0)
			System.out.println("Procedure Executed.....");
		res = UsingCallableStmt.callProcedure1(2, "Priya", 78000);
		if (res != 0)
			System.out.println("Procedure Executed.....");
		res = UsingCallableStmt.callProcedure1(3, "Nithish", 71000);
		if (res != 0)
			System.out.println("Procedure Executed.....");
	}

}

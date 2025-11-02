//Program to demonstrate PreparedStatement Interface
package com.tnsif.ifet.day23.client;

import com.tnsif.ifet.day22.preparedstatementinterface.PreparedStatementDemo;

public class Executor {

	public static void main(String[] args) {
		PreparedStatementDemo.showEmp();
		PreparedStatementDemo.updateEmpName(3, "Vignesh");
		PreparedStatementDemo.updateEmpSalary(3, 65000);
		PreparedStatementDemo.showEmp();
		if(!PreparedStatementDemo.deleteEmp(8));
			System.err.println("No such employee...");
	
		PreparedStatementDemo.showEmp();

	}

}

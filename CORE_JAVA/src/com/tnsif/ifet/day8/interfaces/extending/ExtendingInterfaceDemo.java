package com.tnsif.ifet.day8.interfaces.extending;

public  class ExtendingInterfaceDemo implements ChildInterface{
	// Override ChildInterface method
		public void print() {
			System.out.println("print method");
		}

		// Override InterfaceOne method
		public void show() {
			System.out.println("show Method");
		}
}

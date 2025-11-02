package com.tnsif.ifet.day8.interfaces.nested;

public interface MyInterface {
	void calculateArea();
	 
    interface MyInnerInterface {
       int  id = 20;
       void print();     
    }
}

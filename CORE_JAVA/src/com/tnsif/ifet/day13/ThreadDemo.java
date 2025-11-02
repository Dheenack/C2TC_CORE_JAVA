package com.tnsif.ifet.day13;

public class ThreadDemo {
	public static void main(String[] args) {
		ChildThread threadOne = new ChildThread(15, "First");
		ChildThread threadTwo = new ChildThread(10, "Second");

//		threadOne.start();
//		 threadOne.start(); // -> this throws IllegalStateException, achieving actual Multithreading 
//		 threadOne.run();   // -> single threaded application, which is a Main thread, no Multithreading
//		threadTwo.start();
		
		threadOne.start();
		threadTwo.start();
		
//		threadOne.join();
//		threadTwo.join();

		System.out.println("End of main method.");
	}
}

package com.tnsif.ifet.day19;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

class Display {
	static void show(String s) {
		System.out.println("_____" + s + "_____");
	}
	void show1(String s) {
		System.out.println("_____" + s + "_____");
	}
	String getName()
	{
		return "TNSIF | C2TC";
	}
}

public class UsingFunctionalInterfaces {

	public static void main(String[] args) {
		
		Consumer<String> consumer = (str) -> System.out.println("Welcome " + str);
		consumer.accept("Neha");		

		consumer = System.out::println; 
		consumer.accept("Pooja");
		
		consumer = Display::show; 
		consumer.accept("Java Programming");
		
		consumer = new Display()::show1; 
		consumer.accept("Hello");
		
		
		Supplier<String> supplier = () -> "Hello from Supplier!";
		System.out.println(supplier.get());

		
		Supplier<Display> displaySupplier =  Display::new; 
		System.out.println(displaySupplier.get().getName());

		
		Predicate<Integer> predicate = num -> num > 0;
		System.out.println(predicate.test(24));
		System.out.println(predicate.test(-20));

		
		BiFunction<Integer, Integer, Integer> maxFunction = (x, y) -> x > y ? x : y;
		System.out.println(maxFunction.apply(25, 14));

		BiFunction<String, Integer, String> printFunction = (name, num) -> name + num;
		System.out.println(printFunction.apply("Good Evening", 2));

	}

}

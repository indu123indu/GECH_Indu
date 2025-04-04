package com.predefinedFunctionalInterface;

import java.util.function.Consumer;

public class ConsumerInJava {
	public static void main(String[] args) {
		Consumer<String> c = (s)-> System.out.println(s);
		c.accept("I am Successfull");
		
	}

}


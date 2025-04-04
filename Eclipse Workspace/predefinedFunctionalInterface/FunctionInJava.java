package com.predefinedFunctionalInterface;

import java.util.function.Function;

public class FunctionInJava {
	public static void main(String[] args) {
		Function<String , Integer> f = (s)-> s.length();
		int result = f.apply("Odappaiah");
		System.out.println(result);
		
		Function<Integer , Integer> f1 = (s)-> s*s;
		int result2 = f1.apply(5);
		System.out.println(result2);
		
		Function<Integer , Integer> f3 = (s)-> s+s;
		int result3 = f3.apply(40);
		System.out.println(result3);
		
		
		
		
		
	}

}



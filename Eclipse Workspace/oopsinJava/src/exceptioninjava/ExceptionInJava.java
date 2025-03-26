package exceptioninjava;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class ExceptionInJava {
	public static void display() {
		display();
	}
	
	public static void main(String[]args) throws FileNotFoundException {
		
		/*
		 * Exception in java:
		 * ================
		 * there is a unwanted or un-expected event occur in the program 
		 * when ever there is exception the normal flow wills stops
		 * 
		 * 2 types of exception 
		 * 1.checked exception(compile time) - FileNotFoundException
		 * 2. unchecked exception(run time) - arrayIndexOutBoundException
		 * 
		 * Error:
		 * ================
		 * it is a problem where the programmer cannt handle it ex:stackoverflow error
		 * 
		 * 
		 * 
		 */
		//Error
		//ExceptionInJava.display();
		
		//Checked Exception
		//1. try catch
		//2. throws
		
		PrintWriter printWriter;
		try {
			printWriter = new PrintWriter("abc.txt");
			printWriter.println("Hello World");
			System.out.println("Hello World");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// 2 Throws
		printWriter = new PrintWriter("abc.txt");
		printWriter.println("Hello World");
		System.out.println("Hello World");
		printWriter.close();
		
		
	}
}
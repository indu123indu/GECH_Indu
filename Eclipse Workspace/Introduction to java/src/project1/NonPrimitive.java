package project1;

import java.util.Scanner;

public class NonPrimitive {

	public static void main(String[] args) {
		/*
		 * Array
		 * 
		 * String
		 * 
		 * 1.array:
		 * ========
		 * <datatype>[] arrayname ={};
		 */
		//int[] array1 = {1,2,3,4,5};
	//	System.out.println(array1[1]);
		
		//System.out.println("Enter the name");
		//Scanner scanner= new Scanner(Sytem.in);
		//String name=scanner.nextLine();
		//String name = "Indu hello";
		//System.out.println("Enter the name: " );
		
		//Scanner sc = new Scanner(System.in);
		//String name=sc.nextLine();;
		//sc.nextLine();
	//	System.out.println("name: " +name);
		
		/* student name - string
		 *  studen age - bytes, int
		 *  student marks-doubles
		 *  studen gender - char
		 *  student branch -string
		 *  student address - string
		 *  
		 **/
		
		
		System.out.println("Enter the name: " );

		Scanner sc = new Scanner(System.in);
		String name=sc.nextLine();
		System.out.println("Student the name: "+name );
		
		System.out.println("Enter the age: " );

		Scanner sc1 = new Scanner(System.in);
		int age=sc1.nextInt();
		System.out.println("Student the age: "+age );
		
		System.out.println("Enter the marks: " );

		Scanner sc2 = new Scanner(System.in);
		double marks=sc2.nextDouble();
		System.out.println("Student the marks: "+marks );
		
		
		
		
		
		
		
	}

}

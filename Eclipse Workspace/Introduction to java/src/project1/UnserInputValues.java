package project1;

import java.util.Scanner;

public class UnserInputValues {

	public static void main(String args[]) {
		int stdage = 0;
		System.out.println("Enter the student age: ");
		Scanner sc= new Scanner(System.in);
		stdage=sc.nextInt();
		System.out.println("the age of the student is: " +stdage);
		
		
		short Stdage = 0;
		System.out.println("Enter the student age: ");
		Scanner cc= new Scanner(System.in);
		Stdage=cc.nextShort();
		System.out.println("the age of the student is: " +stdage);
		
		sc.nextLine();
		
		//ccharacter
		System.out.println("Enter your gender: ");
		char gender = sc.nextLine().charAt(0);
		System.out.println("gender is: " +gender);
		
		
	}

}

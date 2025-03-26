package ArraysinJava;

import java.util.Scanner;

public class UserInpuArray {
	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        
	        System.out.print("Enter the size of an array: ");
	        int size = scanner.nextInt();

	       
	        int[] arr = new int[size];

	        
	        System.out.println("Enter the value of the array");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = scanner.nextInt();
	            System.out.println("Enter "+i+" th element: ");
	        }

	        
	        System.out.print("Array elements are: ");
	        for (int j=0;j<arr.length ; j++) {
	            System.out.print(arr[j]+ " ");
	        }

	      
	        scanner.close();
	    }
	}




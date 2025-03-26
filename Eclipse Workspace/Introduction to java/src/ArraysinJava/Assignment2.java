package ArraysinJava;

import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Taking input for the number of rows and columns
        System.out.print("Enter the number of rows and columns: ");
        int row = sc.nextInt();
        int col = sc.nextInt();

        // Declaring a 2D array
        int[][] arr = new int[row][col];

        // Taking input for array elements
        System.out.println("Enter " + (row * col) + " elements:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                arr[i][j] = sc.nextInt(); // Storing values in the array
            }
        }

        // Printing the array elements
        System.out.println("Array elements are:");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(arr[i][j] + " "); // Print in matrix format
            }
            System.out.println(); // Move to the next line after each row
        }

        // Close the scanner
        sc.close();
    }
}

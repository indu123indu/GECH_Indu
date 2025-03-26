package ArraysinJava;

import java.util.Scanner;

public class CharArrayInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ask user for array size
        System.out.print("Enter the number of characters: ");
        int size = scanner.nextInt(); // Take array size input

        // Declare a character array
        char[] charArray = new char[size];

        // Taking character inputs
        System.out.println("Enter " + size + " characters:");
        for (int i = 0; i < size; i++) {
            charArray[i] = scanner.next().charAt(0); // Store first character of input
        }

        // Printing the characters
        System.out.print("You entered: ");
        for (char ch : charArray) {
            System.out.print(ch + " ");
        }

        // Close scanner
        scanner.close();
    }
}





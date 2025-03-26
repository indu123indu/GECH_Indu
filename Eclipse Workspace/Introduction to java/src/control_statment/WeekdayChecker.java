package control_statment;

import java.util.Scanner;

public class WeekdayChecker {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number (1-7): ");
        int day = scanner.nextInt();
        
        // Using switch-case to check weekdays and weekends
        switch (day) {
            case 1: case 2: case 3: case 4: case 5:
                System.out.println("It's a Weekday.");
                break;
            case 6: case 7:
                System.out.println("It's a Weekend.");
                break;
            default:
                System.out.println("Invalid day");
        }
        
        scanner.close();
    }

		

	}



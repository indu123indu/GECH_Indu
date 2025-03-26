package control_statment;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day = 3;
		switch (day) {
		case 1 -> System.out.println("monday");
		case 2 -> System.out.println("tueseday");
		case 3 -> System.out.println("wednsady");
		case 4 -> System.out.println("thursday");
		case 5 -> System.out.println("friday");
		case 6 -> System.out.println("staurday");
		case 7 -> System.out.println("sunday");
		default -> System.out.println("Invalid day");
		}
		/*
		 * take user input intger
		 * check for weekdays and weekend using switch 
		 * 1-5 weekdays and 6-7 weekend else invalid day
		 * */

	}

}

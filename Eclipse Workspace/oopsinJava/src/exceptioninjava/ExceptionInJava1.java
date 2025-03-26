package exceptioninjava;

public class ExceptionInJava1 {
	public static void main(String[] args) {
		int a= 10;
		int b =100;
		try {
			System.out.println("Result is:"+(a+b));
			} catch (ArithmeticException e) {
				System.out.println(e);
				System.out.println(e.getMessage());
				e.printStackTrace();
				
				
				
		}
		System.out.println("Hello Students Nice to meet you");
	
			
		
		}
		
	}
package exceptioninjava;

public class ExceptionInJava3 {
	
	public void validate(int age) {
		if(age<18) {
			throw new ArithmeticException("Invalid age");
		}
		else {
			System.out.println("Your Age :" +age);
			
		}
	}
	public static void main(String[] args) {
		
		try {
			System.out.println(10/0);
		}catch(Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This is finally block");
			
		} 
		try {
			System.out.println(10/0);
			
		} catch (Exception e) {
			System.out.println(e);
		}finally {
			System.out.println("This is finally block2");
			
		}
		
		/* throw:
		 * it is used to throw the exception
		 * 
		 */
		 ExceptionInJava3 obj = new ExceptionInJava3();
	        try {
	            obj.validate(15);  // This will throw an exception since age is less than 18
	        } catch (Exception e) {
	          System.out.println(23);
	           
			
		}
		}
	}
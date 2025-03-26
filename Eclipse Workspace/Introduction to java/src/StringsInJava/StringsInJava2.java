package StringsInJava;

public class StringsInJava2 {
	public static void main(String[]args) {
		/*
		 * 1.equals
		 * 
		 * 2.equalssignorecase
		 * 
		 * 3. ==
		 * 4. concat
		 * 5.toupperccase
		 * 6.toLowercase
		 * 7.trim
		 * 8.startwith
		 *9.endwith
		 * 10.strip
		 * 11.equalsignorecase
		 * 12.isBlank
		 * */
		
		String str1 =new String("Hello world");
		String str2 =new String("hello world");
		//1.equals
		System.out.println("equals: "+str1.equals(str2));
		//2.equalssignorecase
		System.out.println("equalsIgnorecase: "+str1.equalsIgnoreCase(str2));
		//3. ==
		System.out.println(" == :"+str1==str2);
		//4. concat
		System.out.println(str1.concat(" ").concat(str1).concat("hi"));
		//5.toupperccase
		System.out.println(str1.toUpperCase());
	}
}

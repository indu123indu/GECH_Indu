package StringsInJava;

public class StringsInJava {
	public static void main(String[]args) {
		/*
		 * strings:
		 * ======
		 * it is a group of charactrstics
		 * ex:table
		 * need to enclosed within " ".
		 * 
		 * how to decleare the string:
		 * ========================
		 * 1.using a string litere1
		 * string var_name="String-name";
		 * 
		 * 2.using a new key words;
		 * string var_name = new string("string_name");
		 * */
		String str1 = "String1";
		String str2 = new String("String1");
		String str3 = "String1";
		String str4 = "String1";
		System.out.println("str1");
		System.out.println("str2");
		System.out.println(str1.equals(str2));
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));
		
		
		String str5 = new String("String5");
		str5=str5.concat("Hello");
		System.out.println(str5);
		
		System.out.println(str2==str4);
}
}
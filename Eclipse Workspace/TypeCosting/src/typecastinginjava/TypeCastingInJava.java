package typecastinginjava;

public class TypeCastingInJava {
	public static void main(String[]args) {
		/*
		 *Type casting:
		 *============
		 *converstion of one date type to anthor
		 *
		 * 1.implicit type casting:
		 * ========================
		 * byte->short->int->long->float->double
		 * 
		 * 2.explicit type casting:
		 * =======================
		 * doblole->float->long->int->short->byte
		 * 
		 * */
		//1.implicit type casting:
		int a = 10;
		long a2 = a;
		
		System.out.println("Int : "+a);
		System.out.println("Long :"+a2);
		
		//2.explicit type casting:
		int a3 = 10;
		long a4 = (int)a3;
				
		System.out.println("Int : "+a4);
		System.out.println("Long :"+a3);
	}

}

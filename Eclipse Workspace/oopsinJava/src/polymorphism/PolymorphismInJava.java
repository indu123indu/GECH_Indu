package polymorphism;

class Person{
	public  void walking() {
		System.out.println("The person is walking");
	}
}


class Mohan extends Person{
	public  void walking() {
		System.out.println("Mohan is walking");
	}
}

class Addition {
	public void add(int a , int b) {
		System.out.println("Addition is:" +(a+b));
	}
		
		public void add(int a , int b , int c) {
			System.out.println("Addition is:" +(a+b+c));
		}
		
		
	}


public class PolymorphismInJava {
	public static void main(String[] args) {
		
		Mohan mohan = new Mohan();
		mohan.walking();
		
		Addition addition = new Addition();
		addition.add(10,20);
		addition.add(10,30,10);
		
	}

}
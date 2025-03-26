package encapsulation;

class Student{
	private String name;
	private int age;
	private double marks;
	public char[] getName;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
	public double getMarks() {
		return marks;
	}
	public void setMarks(double marks) {
		this.marks = marks;
	}


public class EncapsulationInJava {
	public static void main(String[] args) {
	
	
		
	
	Student std1 = new Student();
	std1.setName("Indu");
	System.out.println(std1.getName());
	
	Student std15 = new Student();
	std15.setAge(22);  //set as an integer
	System.out.println(std1.getAge());
	
	Student std12 = new Student();
	std12.setMarks(45);  //set as an integer
	System.out.println(std1.getMarks());
		
}
}
}
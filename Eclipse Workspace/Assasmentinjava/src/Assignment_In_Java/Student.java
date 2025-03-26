package Assignment_In_Java;

//Student class
class Student {
 private String name;
 private int rollNumber;
 private double marks;
 
 // Constructor
 public Student(String name, int rollNumber, double marks) {
     this.name = name;
     this.rollNumber = rollNumber;
     this.marks = marks;
 }

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public int getRollNumber() {
	return rollNumber;
}

public void setRollNumber(int rollNumber) {
	this.rollNumber = rollNumber;
}

public double getMarks() {
	return marks;
}

public void setMarks(double marks) {
	this.marks = marks;
	
	//Main class to test the implementation
	@SuppressWarnings("unused")
	class StudentTest {
	 public static void main(String[] args) {
	     Student student1 = new Student("Alice", 101, 75);
	     Student student2 = new Student("Bob", 102, 35);
	     
	     student1.displayDetails();
	     System.out.println();
	     student2.displayDetails();
	 }
	}
}

public void displayDetails() {
	// TODO Auto-generated method stub
	
}
}
 
 
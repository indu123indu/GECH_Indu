package Assignment_In_Java;

//Main class to test the implementation
public class StudentTest {
 public static void main(String[] args) {
     Student student1 = new Student("Alice", 101, 75);
     Student student2 = new Student("Bob", 102, 35);
     
     student1.displayDetails();
     System.out.println();
     student2.displayDetails();
 }
}

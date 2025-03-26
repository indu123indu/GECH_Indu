package Inhertence;  // Fixed package name typo

// Student class
class Student {
    // States (properties)
    public int age;
    public String name;
    public double marks;

    // Full argument constructor
    public Student(int age, String name, double marks) {
        System.out.println("Full args Constructor");
        this.age = age;
        this.name = name;
        this.marks = marks;
    }

    // No-args constructor
    public Student() {
        System.out.println("No args Constructor");
    }

    // Actions (methods)
    public void isPlaying() {
        System.out.println(name + " is playing");
    }

    public void isSleeping() {
        System.out.println(name + " is sleeping");
    }

    public void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Marks: " + this.marks);
    }
}

// Main class
public class OopsInJava {
    public static void main(String[] args) {
        // Creating an object using no-args constructor
        Student std1 = new Student();
        std1.name = "Hunter";
        std1.age = 23;
        std1.marks = 230.45;

        // Displaying student details
        std1.display();
        std1.isPlaying();
        std1.isSleeping();
        Student std2 = new Student(21, "Alice", 280.50);
        std2.display();
    }
}

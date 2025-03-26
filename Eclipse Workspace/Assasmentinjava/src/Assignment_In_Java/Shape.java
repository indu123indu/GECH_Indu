package Assignment_In_Java;

//Base class Shape
class ShapeTest {
 // Method to calculate area (to be overridden)
 public void calculateArea() {
     System.out.println("Calculating area...");
 }
}

//Subclass Circle extending Shape
class Circle extends ShapeTest {
 private double radius;
 
 // Constructor
 public Circle(double radius) {
     this.radius = radius;
 }
 
 // Override calculateArea method
 @Override
 public void calculateArea() {
     double area = Math.PI * radius * radius;
     System.out.println("Circle Area: " + area);
 }
}

//Subclass Rectangle extending Shape
class Rectangle extends Shape {
 private double length, width;
 
 // Constructor
 public Rectangle(double length, double width) {
     this.length = length;
     this.width = width;
 }
 
 // Override calculateArea method
 @Override
 public void calculateArea() {
     double area = length * width;
     System.out.println("Rectangle Area: " + area);
 }
}

//Main class to test the implementation
public class Shape {
 public static void main(String[] args) {
     Circle myCircle = new Circle(5);
     Shape myRectangle = new Rectangle(4, 6);
     
     myCircle.calculateArea();
     myRectangle.calculateArea();
 }

public void calculateArea() {
	// TODO Auto-generated method stub
	
}
}

package inheritenceinjava;

//Parent class
class parentClass {
 public void parentMethod() {
     System.out.println("This is a parent method");
 }
}

//Child class 1
class Child1 extends ParentClass {
 public void child1Method() {
     System.out.println("This is Child1 method");
 }
}

//Child class 2
class Child3 extends ParentClass {
 public void child2Method() {
     System.out.println("This is Child2 method");
 }

public void child3Method() {
	// TODO Auto-generated method stub
	
}
}

//Main class
public class Inheritence {
 public static void main(String[] args) {
     // Creating an object of Child1
     Child1 obj1 = new Child1();
     obj1.parentMethod();  // Parent method (inherited)
     obj1.child1Method();  // Child1 method

     System.out.println("-----------------");

     // Creating an object of Child2
     Child3 obj2 = new Child3();
     obj2.parentMethod();  // Parent method (inherited)
     obj2.child3Method();
 }
}
package Inhertence;

interface Interface1 {
    public void method();

    // Default method inside an interface
    public default void defaultMethod() {
        System.out.println("This is a default method in interface");
    }

    // Static method inside an interface
    public static void staticMethod() {
        System.out.println("This is a static method in interface");
    }
}

// Class implementing the interface
class Child1 implements Interface1 {
    @Override
    public void method() {
        System.out.println("This is a method ");
    }
}

public class InterfaceInJava3 {
    public static void main(String[] args) {
        // Creating an object of Child1 class
        Child1 Child1  = new Child1();
        Child1.method(); // Calls the overridden method
        Child1.defaultMethod(); // Calls the default method from interface

        // Calling static method of interface
        Interface1.staticMethod();
    }
}

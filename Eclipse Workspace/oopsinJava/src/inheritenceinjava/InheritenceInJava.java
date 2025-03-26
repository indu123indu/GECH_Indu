package inheritenceinjava;

// 1. Single-level Inheritance
class Parent {
    int pData = 100;

    public void parentMethod() {
        System.out.println("This is parent method");
    }
}

class Child2 extends Parent {
    int cData = 200;

    public void childMethod() {
        System.out.println("This is child method");
    }
}

public class InheritenceInJava {
    public static void main(String[] args) {
        /*
         * Inheritance:
         * ===========
         * Extending the properties of the parent class to the child class
         * (properties and actions).
         *
         * Types:
         * =====
         * 1. Single-level
         * 2. Multi-level
         * 3. Hierarchical
         * 4. Hybrid
         * 5. Multiple -> Not possible in Java (but can be achieved using interfaces)
         */

        // Creating an object of Child2
        Child2  Child2  = new Child2();

        // Accessing parent class property and method
        System.out.println("Parent data: " +  Child2.pData);
        Child2.parentMethod();

        // Accessing child class property and method
        System.out.println("Child data: " +  Child2.cData);
        Child2.childMethod();
    }
}

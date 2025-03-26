package interFaceInJava;

// Interface
interface Animal {
    public void makeSound();
}

// Implementing the Interface
class Dog implements Animal {    
    @Override
    public void makeSound() {
        System.out.println("Dog barks");
    }
}

// Main Class
public class InterFaceInJava {
    public static void main(String[] args) {
        /*
         * Interface:
         * =========
         * - It is a blueprint of a class.
         * - Methods in an interface are abstract by default.
         * - From Java 8, we can have default and static methods in an interface.
         * - Used when we don't know the complete implementation.
         *
         * Syntax:
         * interface InterfaceName {
         *    // code
         * }
         *
         * Example:
         * interface Animal {
         *     public void makeSound();
         * }
         */

        // Creating an object of Dog class
        Animal myDog = new Dog();
        myDog.makeSound();  // Calls the overridden method
    }
}

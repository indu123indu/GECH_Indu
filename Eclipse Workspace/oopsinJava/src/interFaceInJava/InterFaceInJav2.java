package interFaceInJava;

// Interface
interface Animal1 {
    public void makeSound();
}

// Implementing the Interface
class Cat implements Animal1 {    
    @Override
    public void makeSound() {
        System.out.println("Cat meows");  // Fixed the incorrect output
    }
}

// Main Class
public class InterFaceInJav2 {
    public static void main(String[] args) {
        // Creating an object of Cat class
        Animal1 myCat = new Cat();
        myCat.makeSound();  // Calls the overridden method
    }
}

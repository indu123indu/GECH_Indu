package Assignment_In_Java;

//Interface AnimalTest
interface Animal {
 void eat();
 void makeSound();
}

//Class Dog implementing AnimalTest interface
class Dog implements Animal {
 @Override
 public void eat() {
     System.out.println("Dog is eating bones.");
 }
 
 @Override
 public void makeSound() {
     System.out.println("Dog barks: Woof! Woof!");
 }
}

//Class Cat implementing AnimalTest interface
class Cat implements Animal {
 @Override
 public void eat() {
     System.out.println("Cat is eating fish.");
 }
 
 @Override
 public void makeSound() {
     System.out.println("Cat meows: Meow! Meow!");
 }
}

//Main class to test the implementation
public class AnimalTest {
 public static void main(String[] args) {
     Animal myDog = new Dog();
     Animal myCat = new Cat();
     
     myDog.eat();
     myDog.makeSound();
     
     System.out.println();
     
     myCat.eat();
     myCat.makeSound();
 }
}




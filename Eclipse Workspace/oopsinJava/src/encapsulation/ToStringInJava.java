package encapsulation;

class Person {
    public String name;
    public int age;

    // Constructor for Person class
    public Person(String name, int age) {
        super();
        this.name = name;
        this.age = age;
    }

    // Correct toString method
    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + "]";
    }
}

public class ToStringInJava {
    public static void main(String[] args) {
        // Creating an instance of Person
        Person person = new Person("Mohan", 23);

        // Accessing and printing the person's name
        System.out.println(person.name);

       
    }
}
package Inhertence;

// Interfaces
interface A {
    public void methodA();
}

interface B {
    public void methodB();
}

interface C {
    public void methodC();
}

interface D {
    public void methodD();
}

// Child class implementing A and B
class Child implements A, B {
    @Override
    public void methodA() {
        System.out.println("This is method A");
    }

    @Override
    public void methodB() {
        System.out.println("This is method B");
    }
}

// Another class implementing C and D
class AnotherChild implements C, D {
    @Override
    public void methodC() {
        System.out.println("This is method C");
    }

    @Override
    public void methodD() {
        System.out.println("This is method D");
    }
}

// Main class
public class InterfaceInJava1 {
    public static void main(String[] args) {
        // Creating an object of Child class
        Child obj1 = new Child();
        obj1.methodA();
        obj1.methodB();

        // Creating an object of AnotherChild class
        AnotherChild obj2 = new AnotherChild();
        obj2.methodC();
        obj2.methodD();
    }
}

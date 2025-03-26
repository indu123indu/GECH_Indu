package inheritenceinjava;

// Grandparent class
class GrandParentClass {
    public void grandParentMethod() {
        System.out.println("This is a grandparent method");
    }
}
class ParentClass extends GrandParentClass {
    public void parentMethod() {
        System.out.println("This is a parent method");
    }
}
class ChildClass extends ParentClass {
    public void childMethod() {
        System.out.println("This is a child method");
    }
}
public class MultiLevel {
    public static void main(String[] args) {
       
        ChildClass child = new ChildClass();
        child.grandParentMethod(); 
        child.parentMethod();     
        child.childMethod();      
    }
}

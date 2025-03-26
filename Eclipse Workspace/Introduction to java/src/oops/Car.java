package oops;

public class Car {
    String brand;
    int price;

    // Method 
    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Price: " + price);
    }
}

// Object
class Main {
    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.brand = "Toyota";
        myCar.price = 1500000;
        myCar.display();
    }
}

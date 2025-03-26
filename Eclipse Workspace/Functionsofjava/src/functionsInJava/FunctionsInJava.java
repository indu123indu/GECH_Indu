package functionsInJava;

public class FunctionsInJava {

    // 1. Function that returns a value and accepts two parameters
    public int add(int a, int b) {
        return a + b;
    }

    // 2. Function that does not return a value but accepts parameters
    public void add2(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    /*
     * Functions/Methods in Java:
     * =========================
     * Syntax:
     * <access_modifier> return_type function_name(parameters) {
     *      // code
     * }
     * 
     * Example:
     * public void add(int a, int b) {
     *     System.out.println(a + b);
     * }
     * 
     * Types of Functions:
     * ===================
     * 1. Built-in: next(), nextLine(), println(), equals()
     * 2. User-defined:
     *    a. Function returns a value and does not accept parameters.
     *    b. Function returns a value and accepts parameters.
     *    c. Function does not return a value but accepts parameters.
     *    d. Function does not return a value and does not accept parameters.
     */

    public static void main(String[] args) {
        // Create an object of the class
        FunctionsInJava obj1 = new FunctionsInJava();
        
        // Call the function that returns a value
        int res = obj1.add(19, 20);
        System.out.println("Output is: " + res);
        
        // Call the function that does not return a value
        obj1.add2(23, 23);
    }
}

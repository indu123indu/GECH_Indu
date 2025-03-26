package project1;

public class PrimitiveDatatype {

    private static int age; // Class-level variable (not used in main)

    public static void main(String[] args) {
        // Primitive Data Types in Java
        
        // Numeric Data Types
        byte byteValue = 23;       // 8-bit integer (-128 to 127)
        System.out.println("Byte: " + byteValue);
        
        short shortValue = 300;    // 16-bit integer (-32,768 to 32,767)
        System.out.println("Short: " + shortValue);
        
        int intValue = 3000;       // 32-bit integer (-2^31 to 2^31-1)
        System.out.println("Int: " + intValue);
        
        long longValue = 100000L;  // 64-bit integer (-2^63 to 2^63-1)
        System.out.println("Long: " + longValue);
        
        float floatValue = 10.00f; // 32-bit floating point (needs 'f' suffix)
        System.out.println("Float: " + floatValue);
        
        double doubleValue = 12.666666666; // 64-bit floating point
        System.out.println("Double: " + doubleValue);

        // Non-Numeric Data Types
        char charValue = 'a';      // Stores a single character
        System.out.println("Char: " + charValue);
        
        boolean booleanValue = true; // Boolean (true/false)
        System.out.println("Boolean: " + booleanValue);
       
    }
}

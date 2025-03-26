package WrapperClassinjava;

public class WrapperClasses {

    public static void main(String[] args) {
        /*
         * Java is a pure OOP or not?
         * ==========================
         * --> No (because of primitive data types)
         *
         * Primitive Data Types:
         * =====================
         * byte, short, int, long, float, double, char, boolean
         * 
         * Collections:
         * ============
         * Collections store a group of individual objects as a single entity.
         * They only work for objects, not primitive data types.
         * To overcome this issue, we use Wrapper Classes.
         * 
         * Example:
         * 10, 20, 30, 40, 50 --> int (primitive data type)
         * 
         * Wrapper Classes:
         * ================
         * byte    --> Byte
         * short   --> Short
         * int     --> Integer
         * long    --> Long
         * float   --> Float
         * double  --> Double
         * char    --> Character
         * boolean --> Boolean
         */

        // 1. Autoboxing (Primitive to Wrapper)
        int a = 100;
        Integer i = a; // Auto-boxing
        System.out.println("Primitive int: " + a);
        System.out.println("Wrapper Integer: " + i);
        System.out.println("Integer Type: " + i.getClass().getName());
        
        byte b = 10;
        Byte byteObj = Byte.valueOf(b);
        System.out.println("Byte: " + b);
        System.out.println("Byte Object: " + byteObj);
        System.out.println("Byte Object Type: " + byteObj.getClass().getName());
        
        short s = 20;
        Short shortObj = Short.valueOf(s);
        System.out.println("Short: " + s);
        System.out.println("Short Object: " + shortObj);
        System.out.println("Short Object Type: " + shortObj.getClass().getName());

       
        long l = 1000L;
        Long longObj = Long.valueOf(l);
        System.out.println("Long: " + l);
        System.out.println("Long Object: " + longObj);
        System.out.println("Long Object Type: " + longObj.getClass().getName());

        float f = 10.5f;
        Float floatObj = Float.valueOf(f);
        System.out.println("Float: " + f);
        System.out.println("Float Object: " + floatObj);
        System.out.println("Float Object Type: " + floatObj.getClass().getName());

        double d = 20.99;
        Double doubleObj = Double.valueOf(d);
        System.out.println("Double: " + d);
        System.out.println("Double Object: " + doubleObj);
        System.out.println("Double Object Type: " + doubleObj.getClass().getName());

        char c = 'A';
        Character charObj = Character.valueOf(c);
        System.out.println("Char: " + c);
        System.out.println("Character Object: " + charObj);
        System.out.println("Character Object Type: " + charObj.getClass().getName());

        boolean bool = true;
        Boolean boolObj = Boolean.valueOf(bool);
        System.out.println("Boolean: " + bool);
        System.out.println("Boolean Object: " + boolObj);
        System.out.println("Boolean Object Type: " + boolObj.getClass().getName());

        System.out.println("\n=== Unboxing (Wrapper to Primitive) ===");
        // 2. Unboxing (Wrapper to Primitive)
        Integer i1 = 10;
        int a1 = i1; // Unboxing
        System.out.println("Primitive int: " + a1);
        System.out.println("Wrapper Integer: " + i1);
        System.out.println("Integer Type: " + i1.getClass().getName());
        
        Byte byteObj2 = 10;
        byte b1 = byteObj2.byteValue();
        System.out.println("Byte Object: " + byteObj2);
        System.out.println("Unboxed Byte: " + b1);

        Short shortObj2 = 20;
        short s1 = shortObj2.shortValue();
        System.out.println("Short Object: " + shortObj2);
        System.out.println("Unboxed Short: " + s1);

       
        Long longObj2 = 1000L;
        long l1 = longObj2.longValue();
        System.out.println("Long Object: " + longObj2);
        System.out.println("Unboxed Long: " + l1);

        Float floatObj2 = 10.5f;
        float f1 = floatObj2.floatValue();
        System.out.println("Float Object: " + floatObj2);
        System.out.println("Unboxed Float: " + f1);

        Double doubleObj2 = 20.99;
        double d1 = doubleObj2.doubleValue();
        System.out.println("Double Object: " + doubleObj2);
        System.out.println("Unboxed Double: " + d1);

        Character charObj2 = 'A';
        char c1 = charObj2.charValue();
        System.out.println("Character Object: " + charObj2);
        System.out.println("Unboxed Char: " + c1);

        Boolean boolObj2 = true;
        boolean bool1 = boolObj2.booleanValue();
        System.out.println("Boolean Object: " + boolObj2);
        System.out.println("Unboxed Boolean: " + bool1);
    }


    }


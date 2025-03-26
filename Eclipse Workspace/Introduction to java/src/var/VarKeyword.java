package var;

public class VarKeyword {
    public static void main(String[] args) {
        int a = 10;   // Explicit type declaration
        var a1 = "Hello";  // `var` infers `String` type
        for(var i = 0; i < 7; i++) {  // `var` infers `int` type
            System.out.println("Iteration: " + i);
        }
    }
}

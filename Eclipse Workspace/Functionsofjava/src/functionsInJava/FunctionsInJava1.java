package functionsInJava;

public class FunctionsInJava1 {
    // 1. Public function (Accessible from anywhere)
    public void publicFunction() {
        System.out.println("This is a public function");
    }

    // 2. Private function (Accessible only within this class)
    private void privateFunction() {
        System.out.println("This is a private function");
    }

    // 3. Default function (Accessible within the same package)
    void defaultFunction() {
        System.out.println("This is a default function");
    }

    // 4. Protected function (Accessible within the same package & subclasses in other packages)
    protected void protectedFunction() {
        System.out.println("This is a protected function");
    }

    // 5. Static Function (Can be called without an object)
    public static void staticFunction() {
        System.out.println("This is a static function");
    }

    // Main method to test the functions
    public static void main(String[] args) {
        FunctionsInJava1 obj1 = new FunctionsInJava1();

        // Calling instance methods
        obj1.privateFunction();  // ✅ Allowed (inside the same class)
        obj1.publicFunction();
        obj1.defaultFunction();
        obj1.protectedFunction();

        // Calling static function
        FunctionsInJava1.staticFunction(); // ✅ Corrected static method call
    }
}

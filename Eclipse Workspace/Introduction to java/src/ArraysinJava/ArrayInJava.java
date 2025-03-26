package ArraysinJava;

public class ArrayInJava {
    public static void main(String[] args) {
        
        /*
         * Array in Java
         * 
         * How to declare the array:
         * ========================
         * <datatype>[] array_name = new <datatype>[size];
         * 
         * Example:
         * int[] array1 = new int[4];
         * 
         * How to declare and initialize the array:
         * ========================================
         * int[] arr = {1,2,3,4,5};
         * 
         * Types of Arrays:
         * ================
         * 1. 1D (Single Dimensional) - A single row.
         *    Example: int[] array1 = new int[4];
         * 
         * 2. 2D (Two Dimensional) - Represented in table format.
         *    Example: int[][] array2 = new int[4][3]; // 4 rows, 3 columns (4*3=12 elements)
         */

        int[] arr = new int[5];
        arr[0] = 30;
        arr[1] = 10;
        arr[2] = 34;
        arr[3] = 40;
        arr[4] = 90;
        
        // arr[5] = 100;  // Removed to prevent ArrayIndexOutOfBoundsException

        // Using enhanced for-loop to print array elements
        for(int i=0;i<=4;i++) {
        	arr[i] =10;
        }
        
        for (var i : arr) {
            System.out.print(i + " ");
        }
        
        /*
         * write a program to take the user input valuses
         * and store the inside array and just print int
         * */
    }
}

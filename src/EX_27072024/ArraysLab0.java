package EX_27072024;

public class ArraysLab0 {
    public static void main(String[] args) {
        // Syntax of Arrays -> "dataType[] arrayName;"
        // Data Types
        // Primitive
        //  byte, short, int, long, double, float, char, boolean
        // Non-Primitive
        // String, Class, enum

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        float[] gst_pad = {18.45f, 91.87f, 95.78f, 99.00f, 100.00f, 78.98f};
//        int[] marks_10_board = [90, 91, 95, 99, 100, 78]; - Not possible JVM doesn't recognize it as Array
        String shoppingList[] = {"bread", "butter", "milk", "curd"}; // [] can also use after name

        // int[] marks_12_board = {95,96,94,91,"Pramod"};
        // here two different data types can't use in one array

        char [] grades = {'A','B','C','D','E','F'};
        char [] grades_small = {'a','c','C','D','e','F', '#','@','%'};

        // need to use camelCase = pramoddutta -> pramodDutta
        // (first letter small and second word first letter capital)
        // greetme -> greetMe

    }

}


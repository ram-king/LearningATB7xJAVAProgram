package July_24.EX_27072024;

import java.util.Arrays;

public class Lab17 {
    public static void main(String[] args) {
        // String - Bunch of Chars.
        //
        String s1 = new String("Immutable"); // This syntax stores Heap Area
        String s2 = "Automation"; // this syntax stores in String constant pool

        // String - Immutable in nature.
        System.out.println(s1.length());
        System.out.println(s1.indexOf("t"));
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.endsWith("f")); // result is false as word ends with 'e'

        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        System.out.println(marks_10_board.length);
        System.out.println(Arrays.stream(marks_10_board).max());
        System.out.println(Arrays.stream(marks_10_board).min());
        System.out.println(Arrays.stream(marks_10_board).sum());
        System.out.println(Arrays.stream(marks_10_board).average());
        System.out.println(Arrays.stream(marks_10_board).count());







    }
}

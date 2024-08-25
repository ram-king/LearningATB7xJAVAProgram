package July_24.EX_27072024;

import java.util.Scanner;

public class ArrayLab2 {
    public static void main(String[] args) {

        int[] marks = new int[3];
        // index - 0,1,2
        // length - 3
        System.out.println(marks[0]); // at index 0 -> due to not assigned any value default "0" will be printed
        System.out.println(marks[1]); // at index 1 -> due to not assigned any value default "0" will be printed
        System.out.println(marks[2]); // at index 2 -> due to not assigned any value default "0" will be printed
        Scanner sc = new Scanner(System.in);
        marks[0] = sc.nextInt();
        marks[1] = 92;
        marks[2] = 93;
        System.out.println(marks[0]); // at index 0,1,2 -> user assigned value will be printed
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        //System.out.println(marks[10]); // ArrayIndexOutOfBoundException as array length is 3 elements only
    }
}

package July_24.EX_27072024;

public class ArrayLab1 {
    public static void main(String[] args) {
        int[] marks_10_board = {90, 91, 95, 99, 100, 78};
        // elements are fixed.
        // length of array -> 6
        // who's index 3 -> 99 ( array starts from 0,1,2,3....)
        System.out.println(marks_10_board.length); // length -6
        System.out.println(marks_10_board[0]); // 90
        System.out.println(marks_10_board[1]); // 91
        System.out.println(marks_10_board[2]); // 95
        System.out.println(marks_10_board[3]); // 99
        System.out.println(marks_10_board[4]); // 100
        System.out.println(marks_10_board[-1]); // ArrayIndexOutOfBoundsException
//        System.out.println(marks_10_board[10]);


    }
}

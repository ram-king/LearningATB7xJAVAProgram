package EX_27072024;

public class ArrayLab7 {
    public static void main(String[] args) {
        int[] a = new int[4];
        a[2] = 24;
        System.out.println(a[1]); // will be default value zero
        System.out.println(a[2]); // will be defined value 24
        System.out.println(a[0]); // will be default value zero
        System.out.println(a[4]); // will be IndexOutOfBoundException

    }
}

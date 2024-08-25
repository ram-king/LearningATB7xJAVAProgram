package July_24.EX_27072024;

public class ArrayLab13 {
    public static void main(String[] args) {
        int[] numbers = {10, 2, 32, 48, 25, 34, 13, 29, 61};
        int max = 2;
        int min = numbers[0];
        //Maximum number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        //Minimum number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}

package EX_27072024;

public class ArrayLab13 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 4, 3, 2, 1};
        int max = 2;
        int min = 2;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println(max);
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}

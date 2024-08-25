package July_24.EX_27072024;

public class ArrayLabSecondMax {
    public static void main(String[] args) {
        int[] numbers = {10, 23, 33, 46, 28, 43};
        int max = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("Maximum Value of Array ->"+max);

        // Find Second Max of array
        // 1. second max is always less than max

        int secondMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (secondMax<numbers[i] && numbers[i] < max) {
                secondMax = numbers[i];
            }
        }
        System.out.println("Second Maximum Value of Array ->"+secondMax);

        int thirdMax = numbers[0];
        for (int i = 0; i < numbers.length; i++) {
            if (thirdMax < numbers[i] && numbers[i] < secondMax) {
                thirdMax = numbers[i];
            }
        }
        System.out.println("Third Maximum Value of Array ->"+thirdMax);
    }
}


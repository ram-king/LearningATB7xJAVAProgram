package EX_27072024;

public class ArrayLabMin {
    public static void main(String[] args) {
        int[] numbers = {56, 22, 32, 48, 25, 34, 13, 29, 61};
        int min = numbers[0];
        //Minimum number in the array
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        System.out.println("Minimum Value of Array ->" + min);

    }}


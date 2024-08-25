package July_24.EX_27072024;

public class ArrayLab6 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) {  //here if we use <= then IndexOutOfBoundException wil get
            System.out.println(i+"->"+(numbers[i] + 10));

            // length -> 5
            // index -> 0,1,2,3,4
            //  // i = 0,1,2,3,4
            // i = 0   10*2 ->   20
            // i = 1   20*2 ->   40
            // i = 2   30*2 ->   60
            // i = 3   40*2 ->   80
            // i = 4   50*2 ->   100
            // O/P -> 20,40,60,80,100
        }
        System.out.println("O/P is ->"+numbers[3] * 2);
    }
}

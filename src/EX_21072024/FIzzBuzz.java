package EX_21072024;

public class FIzzBuzz {
    public static void main(String[] args) {
        // FizzBuzz Problem:
        // Write a program that prints numbers from 1 to 50.
        // For multiples of 3, print "Fizz" instead of the number,
        // and for the multiples of 5, print "Buzz".
        // For numbers which are multiples of both 3 and 5,
        // print "FizzBuzz".
        for (int i = 1; i < 50; i++) {
            if (i%3==0 && i%5==0){     // if we are having more than one condition should write first
                System.out.println("FizzBuzz");
            } else if (i%3==0) {
                System.out.println("Fizz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            }else {
                System.out.println(i);
        }
    }
}}

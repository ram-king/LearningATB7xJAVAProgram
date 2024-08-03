package EX_20072024;

import java.util.Scanner;

public class DivisibleCond {
    public static void main(String[] args) {
        // Finding Divisible or Not using User input and condition
        Scanner sc = new Scanner(System.in); // scanner class is pre-defined in Java
        System.out.println("Enter your input");
        int a = sc.nextInt();
        if (a%3 == 0){
            System.out.println("It's Divisible by 3");
        }else {
            System.out.println("It's Not Divisible by 3");
        }
}}

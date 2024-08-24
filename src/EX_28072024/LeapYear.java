package EX_28072024;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,
        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        // 1. Get clarity on the inputs - year -. int  2024
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the year!, I will you tell if it is leap or not leap year");
        int year = sc.nextInt();

        if(year%4 ==0 || year%100!=0 && year%400==0){
            System.out.println("Yes it is a Leap Year");
        }else {
            System.out.println("Not a Leap Year");
        }




    }
}

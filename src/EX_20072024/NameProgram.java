package EX_20072024;

import java.util.Scanner;

public class NameProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = sc.next();

        System.out.println("Enter your gender-M or F");
        char gender = sc.next().charAt(0);

        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter your Salary");
        double salary = sc.nextDouble();

        System.out.println("Your details are " + name);
        System.out.println("Your gender is " + gender);
        System.out.println("Your age is " + age);
        System.out.println("Your Salary is " + salary);


        sc.close();

    }
    }


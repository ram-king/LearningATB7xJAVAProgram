package July_24.EX_21072024;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        // Coding Program
        // Factorial Program
        //  n = 5 ->  Fact = 5*4*3*2*1 = 120
        // n = 1 ->  Fact = 1*1 -> 1
        // n = 3 -> Fact = 3*2*1 -> 6

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a num,will print Factorial");
        int n = sc.nextInt();

        int fact = 1;
        for (int i = 1; i <=n ; i++) {
            fact = fact*i;
        }
        System.out.println(fact);

        sc.close();




    }
    }


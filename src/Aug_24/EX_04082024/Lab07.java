package Aug_24.EX_04082024;

import java.util.Scanner;

public class Lab07 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name of the Bank!");
        String bName = sc.next();
        System.out.println("Enter your Account Balance!");
        int bal = sc.nextInt();
        System.out.println("Enter your Name of the Bank Code!");
        String bCode = sc.next();

        BankAccount b2 = new BankAccount(bName, bal, bCode);


        b2.printDetails();

        sc.close();


    }
}

package Aug_24.EX_04082024;

import java.util.Scanner;

public class BankAccount {
    String bankName;
    int balance;
    String bankCode; // Instance

    // Default Constructor
    BankAccount(){
        bankName = "SBI";
        balance = 1000;
        bankCode = "SBI001";
    }

    // Parameterized Constructor - 3 Argument
    BankAccount(String bName,int bal, String bCode){
        this.bankName = bName;
        this.balance = bal;
        this.bankCode = bCode;
    }

    BankAccount(String bName,int bal){
        this.bankName = bName;
        this.balance = bal;

    }

    BankAccount(String bName){
        this.bankName = bName;
    }


    void printDetails(){
        System.out.println("Bank Name -> " + bankName);
        System.out.println("Bank Code -> " + bankCode);
        System.out.println("Bal ->" + balance);
    }
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
}}

package July_24.EX_28072024;

import java.util.Scanner;

public class OopsLab2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.name = "SBI";
        bank1.branch_name = "Srinagar";
        bank1.account_type = "Savings";
        bank1.account_no = 123456;
        bank1.customer_name = "Ram Kumar";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Customer Age to Open Account");
        bank1.customer_age = sc.nextInt();
        bank1.balance = 20000;


        System.out.println("Bank Name ->"+bank1.name +"\nBranch Name ->"+bank1.branch_name+"\nAccount Type ->"+bank1.account_type+"\nAccount No: "+bank1.account_no);
        System.out.println("Customer Name ->"+bank1.customer_name+"\nBalance ->"+bank1.balance);

        bank1.deposit();
        bank1.withdrawl();
        bank1.fixedDeposit();

        Bank bank2 = new Bank();
        bank2.name = "ICICI";
        bank2.branch_name = "Srinagar";
        bank2.account_type = "Savings";
        bank2.account_no = 987654;
        bank2.customer_name = "Ram Kumar";
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter Customer Age to Open Account");
        bank2.customer_age = sc1.nextInt();
        bank2.balance = 20000;

        System.out.println("Bank Name ->"+bank2.name +"\nBranch Name ->"+bank2.branch_name+"\nAccount Type ->"+bank2.account_type+"\nAccount No: "+bank2.account_no);
        System.out.println("Customer Name ->"+bank2.customer_name+"\nBalance ->"+bank2.balance);

        bank2.deposit();
        bank2.withdrawl();
        bank2.fixedDeposit();
    }
}

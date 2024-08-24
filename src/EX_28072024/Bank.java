package EX_28072024;

public class Bank {
    //Attributes of Bank
    String name;
    String branch_name;
    String account_type;
    int account_no;
    String customer_name;
    int customer_age;
    int balance;

    // Behaviour of Bank i.e. functions
    void deposit(){
        if (customer_age>=18){
        System.out.println("You can deposit money");
    }else {
            System.out.println("Not Eligible to open account");
        }
    }
    void withdrawl(){
        if (customer_age>=18){
        System.out.println("You can withdrawl money");
    }else {
            System.out.println("Not Eligible to open account");
        }
    }
    void fixedDeposit(){
        System.out.println("You can do fixed Deposit");
    }
}

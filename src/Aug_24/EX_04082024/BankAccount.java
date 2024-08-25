package Aug_24.EX_04082024;

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
}

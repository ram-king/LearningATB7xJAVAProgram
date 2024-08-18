package EX_28072024;

public class OopsLab2 {
    public static void main(String[] args) {
        Bank bank1 = new Bank();
        bank1.name = "SBI";
        System.out.println(bank1.name);
        bank1.branch_name = "Srinagar";
        bank1.account_type = "Savings";
        bank1.account_no = 123456;
        bank1.customer_name = "Ram Kumar";
        bank1.balance = 20000;

        bank1.deposit();
        bank1.withdrawl();
    }
}

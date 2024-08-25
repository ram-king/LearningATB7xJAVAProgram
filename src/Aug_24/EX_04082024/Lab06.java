package Aug_24.EX_04082024;


public class Lab06 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println(b1.bankName);
        System.out.println(b1.bankCode);
        System.out.println(b1.balance);
        b1.printDetails();

        BankAccount b2 = new BankAccount("ICICI", 5000, "ICIC1234");
        System.out.println(b2.bankName);
        System.out.println(b2.bankCode);
        System.out.println(b2.balance);
        b2.printDetails();


    }
}

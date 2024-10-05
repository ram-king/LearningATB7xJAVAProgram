package Aug_24.EX_04082024;

import July_24.EX_28072024.Bank;

public class Lab01 {

    Lab01(){
        System.out.println("If constructor created, I'll be called");
    }
    public static void main(String[] args) {
        // Constructors
        // 1. default - 70%
        // 2. Parameters - 25%
        // 3. Copy Constructors  - ~ 1-4%
        // this vs super - why? they are used?
        // Static keyword and static methods

        Lab01 lab01=new Lab01(); // here constructor created so function will be called
        System.out.println(lab01); // Reference value will be printed

        Bank a1=new Bank(); // from any package constructor can be called if it was public
        System.out.println(a1); // Reference value will be printed
        a1.deposit();
        // a1.fixedDeposit(); here this function didn't make public so cannot be called


    }
}

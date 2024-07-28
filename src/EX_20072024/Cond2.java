package EX_20072024;


import java.util.Scanner;

public class Cond2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your input");
        int a = sc.nextInt();
        a = a%3; //Modulus means remainder of division
        if (a == 2){
            System.out.println("O/p not available");
        }else {
            System.out.println("o/p ->"+a);
        }
        System.out.println(a);
    }
}

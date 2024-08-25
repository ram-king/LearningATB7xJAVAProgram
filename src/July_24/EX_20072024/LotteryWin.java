package July_24.EX_20072024;

import java.util.Scanner;

public class LotteryWin {
    public static void main(String[] args) {
        //Lottery Entry
        Scanner fee = new Scanner(System.in);
        System.out.println("Want to Play Lottery! Just Rs.50/-");
        int Cost = fee.nextInt();
        //If Paid Entry Allowed
        if  (Cost >= 50){
        Scanner sc = new Scanner(System.in);
        System.out.println("Draw one card from 1 to 5 ");
        int Card = sc.nextInt();

        switch (Card){
            case 1:
                System.out.println("Better Luck Next Time");
                break;
            case 2:
                System.out.println("Hooray! Select 1 to 10");
                Scanner sc1 = new Scanner(System.in);
                int card1 = sc1.nextInt();
                if (card1>=7 || card1<=3)
                {
                    System.out.println("Rs. 1000 won congrats");
                }
                break;
            case 3:
                System.out.println("Hooray! Select 1 to 10");
                Scanner sc2 = new Scanner(System.in);
                int card2 = sc2.nextInt();
                if (card2<=7 && card2 >=3)
                {
                    System.out.println("Rs. 3000 won congrats");
                }
                break;
            case 4:
                System.out.println("You can have a cool drink");
                break;
            case 5:
                System.out.println("Hooray! Select 1 to 10");
                Scanner sc3 = new Scanner(System.in);
                int card3 = sc3.nextInt();
                if (card3 == 4)
                {
                    System.out.println("Rs. 5000 won congrats");
                }
                break;
            default:
                System.out.println("Hurry Up Select Correct Card");
                break;
        }

    } else {
        System.out.println("Come Back with money");
}}}

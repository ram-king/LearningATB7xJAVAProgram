package July_24.EX_20072024;

import java.util.Scanner;

public class TriangleClassifier {
    public static void main(String[] args) {
        //Inputs Of Triangle
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter side1 length of Triangle");
        int side1 = sc.nextInt();
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Enter side2 length of Triangle");
        int side2 = sc1.nextInt();
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Enter side3 length of Triangle");
        int side3 = sc2.nextInt();
        //Triangle Classification
        //All sides equal - Equilateral (side1=side2=side3)
        //Two sides equal - Isosceles (side1=side2 or side2=side3 or side3=side1)
        //No sides equal - Scalene
        if (side1 == side2 && side2 == side3){
            System.out.println("Equilateral");
        } else if (side1==side2 || side2==side3 || side1==side3) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }

    }
}

package July_24.EX_20072024;

import java.util.Scanner;

public class Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an Alphabet, I will tell you, If it is a vowel or not!");
        char alphabet = sc.next().charAt(0);

        switch (alphabet){
            case 'a','i','o','u','e':
                System.out.println("Vowel");
                break;
            default:
                System.out.println(alphabet+"->Not a Vowel, It it Consonant");
    }
}}

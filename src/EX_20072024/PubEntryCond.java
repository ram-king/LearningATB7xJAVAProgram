package EX_20072024;

import java.util.Scanner;

public class PubEntryCond {
    public static void main(String[] args) {
        // Pub Entry Program
        // Timings - 8PM to 11PM
        // Age Limit - 18 yrs
        // Breweries Limits - 18-25 2 beers and 25-35 5 beers only allowed


        Scanner sc = new Scanner(System.in); // scanner class is pre-defined in Java
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter Entry Time");
        float time = sc.nextFloat();

        if ((age > 18 && age < 25) && (time > 8f && time < 11f)){
            System.out.println("Only 2 Beers Allowed; Drink and Enjoy");
        }
        else if((age > 25 && age < 50) && (time >= 8f && time < 11f)){
            System.out.println("Only 5 Beers Allowed; Drink and Enjoy");
        }
        else if(age <= 18){
            System.out.println("Under 18 - Not Allowed"); // Under 18 age not allowed
        }
        else if(time <= 8f){
            System.out.println("Pub Opens soon"); // Pub open at 8pm soon
        }
        else if(time >= 11f ){
            System.out.println("Closing Time - Not allowed"); // at 11pm closing time
        }
        else {
            System.out.println("Pub Closed"); // after 11pm pub closed
        }
    }
}

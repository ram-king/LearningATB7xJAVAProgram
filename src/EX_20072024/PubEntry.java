package EX_20072024;

import java.util.Scanner;

public class PubEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // scanner class is pre-defined in Java
        System.out.println("Enter your age");
        int age = sc.nextInt();

        System.out.println("Enter Entry Time");
        float time = sc.nextFloat();

        if ((age > 18 && age < 25) && (time >= 8f && time < 11f)){  // Pub Timings - 8pm to 11pm
            System.out.println("Only 2 Beers Allowed; Drink and Enjoy");
        }
        else if((age > 25 && age < 35) && (time >= 8f && time < 11f)){
            System.out.println("Only 5 Beers Allowed; Drink and Enjoy");
        }
        else if(age < 18){
            System.out.println("Under 18 - Not Allowed"); // Under 18 age not allowed
        }
        else if(time < 8f){
            System.out.println("Pub Soon Opens"); // Pub open at 8pm soon
        }
        else if(time >= 11f ){
            System.out.println("Closing Time - Not allowed"); // at 11pm closing time
        }
        else {
            System.out.println("Pub Closed"); // after 11pm pub closed
        }
    }
}

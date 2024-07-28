package EX_20072024;

public class Conditions {
    public static void main(String[] args) {
        int a = 10;
        if (a!=2){
            System.out.println("True");
        }else {
            System.out.println("false");
        }
        if (a>=2){
            System.out.println("ture");
        }
        else {
            System.out.println("false");
        }
        // Two Different Conditions
        if(a==10 && a>=2){
            System.out.println("True");
        }

        if (2+3 == 6){
            System.out.println("fool"); // here there is no relation with 'a' as we're not calling it
        }else {
            System.out.println("clever");
        }
        boolean a1 = true;
        a1 = !a1;
        if (a1==a1){
            System.out.println("Good");
        }else {
            System.out.println("check again");
        }
        System.out.println(a1);


    }
}

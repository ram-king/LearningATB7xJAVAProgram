package EX_21072024;

public class Lab6 {
    public static void main(String[] args) {
        for (int i = 0; i >= 10; i++) {  //Loop not execute as condition not true always false
            System.out.println(i);
        }
        System.out.println("End of first loop"); // this will get print always
        for (int i = 10; i >= 0 ; i--) {
            System.out.println(i);

        }
        System.out.println("End of second loop");
    }

}

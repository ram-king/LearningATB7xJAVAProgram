package July_24.EX_20072024;

public class Cond4 {
    public static void main(String[] args) {
        boolean a = true;
        if (false) {
            System.out.println("1");
            if (a == a) {
                System.out.println("2");
                if (true) {
                    System.out.println("3");
                }
            }
        }
        System.out.println("No Condition Executed");

    }
}

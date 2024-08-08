package EX_21072024;

public class LoopWithCondition {
    public static void main(String[] args) {
        int a = 1;
        for (; a <= 10; a++) {
            if (a == 9) {
                break;   // Due to break loop execution stopped at 8, second loop execution starts
            }
            System.out.println("First Loop->" + a);
        }
        for (; a < 20; a++) {
            System.out.println("Second Loop->" + a);
            if (a == 16) {
                break; // Due to break loop execution stopped at 16, third loop execution starts
            }
        }
        for (; a <= a+a; a--) {
            if (a % 2 == 0) {
                System.out.println("Third Loop Even->" + a);
            } else {
                System.out.println("Third Loop Odd->" + a);
            }

        }
        System.out.println("End of Loops");
    }
}

package July_24.EX_21072024;

public class DoWhile {
    public static void main(String[] args) {
        // while, for -?
        // do while - while - 1 change - minor change

        // While -> initialisation -> condition -> body -> increment / decrement

        int i = 1;
        while (i < 10) {
            System.out.println(i);
            i++;
        }  // while not execute for the given condition is always false

            // Do While
            // initialisation -> body -> condition -> increment / decrement

            int a = 1;
            do {
                System.out.println(a); //do always run one time only
                a++;
            } while (a < 10);  // here while condition is true then do loop repeat

        }
    }

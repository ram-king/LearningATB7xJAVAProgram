package EX_21072024;

public class Lab8 {
    public static void main(String[] args) {
        int i = 1;
        for ( ; i < 10; i++) {
            System.out.println(i);
            if( i == 5){    //at i=5 by usage of continue keyword next execution will be for loop
                continue;
            }
            System.out.println("After!!");
        }

        }
    }


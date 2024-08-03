package EX_20072024;

import java.util.Scanner;

public class Switch3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char code = sc.next().charAt(0);
        int val = switch (code){
            case 'A':
                yield 65;
            case 'B':
                yield 66;//// return
            case 'E':
                yield 0;
            default:
                throw new IllegalStateException("Unexpected value: " + code);
        };
        System.out.println(val);
    }
    }


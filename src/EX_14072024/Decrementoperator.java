package EX_14072024;

public class Decrementoperator {
    public static void main(String[] args) {
        int a = 10;
        System.out.println(--a);
        System.out.println(--a - a-- - a--);
        // X - --a = 9
        // A - --a  Exp = 8 | a = 8
        // B - a--  Exp = 8 | a = 7
        // C - a--  Exp = 7 | a = 6
        System.out.println(--a - a-- + a--);
        // A - --a  Exp = 5 | a = 5
        // B - a--  Exp = 5 | a = 4
        // C - a--  Exp = 4 | a = 3
        System.out.println(a);
    }
}

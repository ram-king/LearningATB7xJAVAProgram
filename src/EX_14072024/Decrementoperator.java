package EX_14072024;

public class Decrementoperator {
    public static void main(String[] args) {
        int a = 10;
       // System.out.println(--a);
        System.out.println(--a - a-- - a--);
        System.out.println(--a + a-- + a--);
        System.out.println(a);

        // A - --a  Exp = 9 | a = 9
        // B - a--  Exp = 9 | a = 8
        // C - a--  Exp = 8 | a = 7
    }
}

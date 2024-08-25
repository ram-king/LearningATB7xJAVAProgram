package July_24.EX_13072024;

public class OR_AND_Gates {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        //OR GATE
        System.out.println(a>b || a>b); // (true || True) = True
        System.out.println(a==b || a<b); // (False || False) = False
        System.out.println(a>b || a<b); // (True || False) = True
        //AND GATE
        System.out.println(a>b && a>b); // (true && True) = True
        System.out.println(a==b && a<b); // (False && False) = False
        System.out.println(a>b && a<b); // (True && False) = False


    }
}

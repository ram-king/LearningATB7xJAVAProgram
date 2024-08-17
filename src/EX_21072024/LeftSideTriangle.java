package EX_21072024;

public class LeftSideTriangle {
    public static void main(String[] args) {

//        String symbol = "*****";
//
//        for (int i = 1; i <= 5; i++) {
//
//            System.out.println(symbol);
//
//            symbol = symbol+"\b";
//
//        }
//        }
//        }
        for (int i = 5; i >=1 ; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("\t");
        }}}
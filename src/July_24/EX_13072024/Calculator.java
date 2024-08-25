package July_24.EX_13072024;

public class Calculator {
    public static void main(String[] args) {
        // Calc-double
        double a = 32;  // operand a, b , operator =, +
        double b = 34;
        double sum  = a+b;
        double sub  = a-b;
        double mul  = a*b;
        double div  = a/b;
        double rem = a%b; //Modular-Remainder will print

        System.out.printf("Sum is %f\n",sum);

        System.out.printf("Sub is %f\n",sub);

        System.out.printf("Mul is %f\n",mul);

        System.out.printf("Div is %f\n", div);

        System.out.printf("Remainder is %f\n", rem);

        // Calc-long
        long a1 = 36;
        long b1 = 34;
        long sum1 = a1 + b1;
        long sub1 = a1 - b1;
        long mul1 = a1 * b1;
        long div1 = a1 / b1;
        long rem1 = a1 % b1;

        System.out.printf("Sum is %d\n", sum1); //%d for int, byte, short, long

        System.out.printf("Sub is %d\n", sub1);

        System.out.printf("Mul is %d\n", mul1);

        System.out.printf("Div is %d\n", div1);

        System.out.printf("Remainder is %d\n", rem1);
    }
}

package EX_21072024;

public class Loops {
    public static void main(String[] args) {
        int a = 0;
        for (; a < 10; a++) {
            System.out.println(a);

        }
        for (; a < 20 ; a++) {
            System.out.println(a);
            if (a==19){
                break;
            }
        }

    }
}

package July_24.EX_20072024;

public class Switch4 {
    public static void main(String[] args) {
        int a = 11;
        switch (-1){ //case already defined here so line 10 will execute always
            default:
                System.out.println("Default");
                break;
            case -1:
                System.out.println("10");
                break;
            case 9:
                System.out.println("10");
                break;
        }

    }
}

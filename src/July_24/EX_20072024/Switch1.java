package July_24.EX_20072024;

public class Switch1 {
    public static void main(String[] args) {
        int itemcode = 006; //already input defined

        switch (itemcode){
            case 001,002,003:
                System.out.println("It is Electronic Gadget!");
                break;
            case 004,005,007:
                System.out.println("It is Mechinal Gadget!");
                break;
            default: //always this only execute as case 006 not determined
                System.out.println("None");
    }
}}

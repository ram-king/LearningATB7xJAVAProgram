package EX_20072024;

public class Switch2 {
    public static void main(String[] args) {
        int itemCode = 001;

        switch (itemCode) {
            case 001 -> System.out.println("It's a laptop!"); //always this will execute as input defined
            case 002 -> System.out.println("It's a desktop!");
            case 003, 004 -> System.out.println("It's a mobile phone!");
            default -> System.out.println("Heloo!");
        }

    }
    }


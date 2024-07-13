package EX_13072024;

public class Escapecharcs {
    public static void main(String[] args) {
        // Escape Chars
        char c = '\n'; // New line / Next Line
        char c1 = '\t'; // Add Tab
        char c2 = '\b'; // Backlash, delete 1 char in before word
        char c3 = '\r'; // Backlash, delete full word before
        System.out.println("Ram" + c + "Kumar");
        System.out.println("Ram" + c1 + "Kumar");
        System.out.println("Ram " + c2 + "Kumar");
        System.out.println("Ram" + c3 + "Kumar");
    }
}

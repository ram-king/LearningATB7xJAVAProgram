package EX_27072024;

public class ArrayLab5 {
    public static void main(String[] args) {
        String[] weekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday","Friday","Saturday"};
        // whenever work with Array index starts with '0' only
        for (int i=0; i< weekDays.length; i++) {
            System.out.println(i);
            System.out.println(weekDays[i]);
        }
        System.out.println("\nFor the given index, value is ->"+weekDays[6]);
    }
}

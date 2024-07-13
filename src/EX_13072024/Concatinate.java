package EX_13072024;

public class Concatinate {
    public static void main(String[] args) {
        int age = 34;
      //  System.out.println("My age is %d\n",age);
      //  java: no suitable method found for println(java.lang.String,int)
        System.out.printf("My age is %d\n",age);
        int date= 1;
        int year = 1991;
        String month = "Jan";
        System.out.printf("Date of Birth is %s\n", date+month+year);
        String name = "Ram Kumar";
        System.out.println(name);

    }
}

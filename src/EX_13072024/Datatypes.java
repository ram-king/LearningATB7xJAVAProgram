package EX_13072024;

public class Datatypes {
    public static void main(String[] args) {

        // data_type variable_name = variable_value(literal)

        // Data Type
        // Primitive Data Type

        boolean earth_is_round = true;
        boolean sun_is_cool = false;
        System.out.println(earth_is_round);
        System.out.println(sun_is_cool);

        // Numerical
        // integral - byte, short, int, long

        byte age  = 127; //byte can be used from -127 to 127
        short s = 1345;
        int moon_to_earth = 384400;
        long phone_number = 9876543210L;

        System.out.println(age+s+moon_to_earth+phone_number);

        //  char - char  - A,B
        char grade  = 'A'; // O,A,B,C,D,E, F = Fail
        System.out.println(grade);

        // floating
        // float
        float pi = 3.14f; // 3.14F;
        // double
        double d = 118.654;
        System.out.println(pi+d);


        // Non primitive Data Types
        // String  name -> "Ram" -, number or char or bunch of char
        String name = "Ram";
        String name2 = "R";
        System.out.println(name+name2);


    }
}

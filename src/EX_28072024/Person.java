package EX_28072024;

public class Person {
    // This is a Blueprint so main fn not required

    // Attribute
    String name;
    int roll_no;
    String hands;
    String gender;


    // Behavior / > Methods (function within the class)
    void walk() {
        System.out.println(name+ "-> Can Walk");
    }

    void talk() {
        System.out.println("Can Talk");
    }

    void sleep() {
        System.out.println("Can Sleep");
    }

    void read() {
        System.out.println("Can Read");
    }
}

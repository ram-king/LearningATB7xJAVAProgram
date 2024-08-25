package July_24.EX_28072024;

public class OopsLab1 {
    public static void main(String[] args) {

    // OOPs - Concept
    // Real life problem -> OOPs concepts
    // Creating - New planet
    //  AHuman
    //  Attributes / properties -> 2 hand, eye color, node, mouth, height, weight, body color, hair color
    // Behaviour / methods -> walk(), eat(), talk(), read(), sleep(), hear().

    // Amit - AHuman
    // A ->  Amit
    // B ->


    //  Blueprint - Class - Person

    Person person1 = new Person();
    // Real thing class -> Object
    person1.name = "Ram\t";
    person1.roll_no = 1;
    person1.read();
    person1.sleep();
    person1.talk();
    person1.walk();
    person1.gender = "Male";
    person1.hands = "Two Hands";
        System.out.println(person1.name + person1.gender + "\nCan Write with "+person1.hands + "\nRoll No. "+person1.roll_no);


    Person person2 = new Person();
    // Real thing class -> Object
    person2.name = "Pramod";
    person2.roll_no = 2;
    person2.hands= "Two Hands";
    person2.walk();
    person2.talk();
    person2.sleep();
    person2.read();
        System.out.println(person2.name + "\nCan Write with "+person2.hands + "\nRoll No. "+person2.roll_no);


    }
}

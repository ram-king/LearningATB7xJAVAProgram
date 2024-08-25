package Aug_24.EX_04082024;

public class ATBPerson {
    String name;
    long phone;

    // Default Constructor i.e. no parameters
    ATBPerson() {
        System.out.println("Object is created!");
    }
    //Parameterized Constructor
    ATBPerson(String nameGiven){
        this.name = nameGiven;
        // This current class.
    }
    //Parameterized Constructor
    ATBPerson(String nameGiven,long phoneNumber){
        this.name = nameGiven;
        this.phone = phoneNumber;
    }

}

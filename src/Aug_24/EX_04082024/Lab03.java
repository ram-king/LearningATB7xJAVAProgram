package Aug_24.EX_04082024;

public class Lab03 {

   String boy = "Ram"; // Instance Variable, it is not a Global Variable (no concept of G.V. in JAVA)

    void radha(){
        String boy = "Krishna"; // Local Variable
        System.out.println(boy); //here Radha will call (local variable) her hubby - Krishna for help
    }

    void girl(){
        System.out.println(boy); // here girl will call (instance variable) boy - Ram for help
    }

  // until introduce of main function, Lab03 class won't occupy any memory
    // in a blueprint main function shouldn't introduce
    public static void main(String[] args) {
        Lab03 l = new Lab03();
        l.radha();
        l.girl();
    }
}

package Aug_24.EX_04082024;

public class Lab03 {

    int e = 45; // Instance Variable, it is not a Global Variable

    void f1(){
        int e = 10; // Local Variable
        System.out.println(e); //here f1 will use local variable e=10
    }

    void f2(){

        System.out.println(e); // here f2 will use instance variable e=45
    }

  // until introduce of main function, Lab03 class won't occupy any memory
    // in a blueprint main function shouldn't introduce
    public static void main(String[] args) {
        Lab03 l = new Lab03();
        l.f1();
        l.f2();
    }
}

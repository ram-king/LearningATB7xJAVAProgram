package EX_21072024;

public class LoopWithDataTypes {
    public static void main(String[] args) {
        final boolean b1 = true;
        // b1 = false; final this is fixed now
//        for (int i=0;b1;i++){
//            System.out.println("Hello");
//        }

//        for (int i=0;;){ // infinite loop will execute
//            System.out.println("Hello");
//        }

//        for (;;){  // infinite loop
//            System.out.println("Hello");
//        }

//all primitive data types can be used in 'for' loop

        for(float f=0.0f;f<10.67;f++){   //Float will execute 0.0 to 10.0
            System.out.println("Hi,Float -> "+ f);
        }

        for(byte f=0;f<10.67;f++){   //Byte will execute as integer 0 to 10
            System.out.println("Hi,byte -> "+ f);
        }
        for (double f = 0; f < 285; f++) {    //double will execute 0.0 to 284.0
            System.out.println("Hi,double -> "+ f);
        }
        for (long f = 0; f < 1085L; f++) { //Long will execute 0 to 1084
            System.out.println("Hi,long -> "+ f);
        }
        for (char c = 'a'; c <= 'z';c++){  //Char will execute a to z
            System.out.println("Hi, Char ->"+c);
        }
        for (int c = 'A'; c <= 'Z';c++){  //Int will execute ASCII values of characters A=65 ... Z=90
            System.out.println(c);
        }
    }
}

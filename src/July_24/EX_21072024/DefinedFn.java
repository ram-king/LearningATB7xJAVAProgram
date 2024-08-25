package July_24.EX_21072024;

public class DefinedFn {
    public static void main(String[] args) {
        // Functions
        // Block of code which we can reuse.
        // 1. Pre-built - Math.max()/Math.min()
        // 2. User created / defined

        // Two component of the functions
        // 1. Defining the function
        // 2. Calling the function


        // Call the function
        for (int i = 0; i < 2; i++) {
            greet();
        }

        greet2();

        // Calling of user defined fn
        sayonara();

        // Function within function can't write
        // Here we cannot write greet fn inside main fn
//        static void greet(){
//            System.out.println("Hi, How are you?");
//        }
    }

    // Outside main fn, within the class another fn can write but not inside main fn
    // 1. Define
    static void greet(){
        System.out.println("Hi, How are you?");
    }

    static void greet2(){
        System.out.println("How about You?");
    }

    // User defined functions
    static void sayonara(){
        System.out.println("Sayonara");
    }
}

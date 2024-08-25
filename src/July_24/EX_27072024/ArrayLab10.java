package July_24.EX_27072024;

public class ArrayLab10 {
    public static void main(String[] args) {
        //here we need to give arguments for main fn then only will get o/p
        // if we want can provide arguments through main fn configuration
        // if arguments not provided then exception will occur
        // System.out.println(args[3]);
        if (args.length > 0) {
            for (int i = 0; i < args.length; i++) {
                System.out.println(args[i]);
            }

        } else {
            System.out.println("No Arguments given");
        }

    }
}


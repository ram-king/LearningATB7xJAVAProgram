package EX_28072024;

public class OopsLab4 {
    String name = "LOL";
    String color;


    void walk(){}
    void talk(){}

    public static void main(String[] args) {
        OopsLab4 ref  = null; // no object created here only null
        OopsLab4 Ref2 = new OopsLab4(); // object created in heap area
        OopsLab4 Ref3 = new OopsLab4(); // object created in heap area
        OopsLab4 Ref4  = Ref2; // no separate object created as Ref4 is pointing Ref2 object only
                                // EX_28072024.OopsLab4@58372a00 memory value
        System.out.println(ref);
        System.out.println(Ref4);
        System.out.println(Ref3.name);
    }
}

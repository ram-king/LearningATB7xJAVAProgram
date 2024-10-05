package Aug_24.EX_04082024.MultiLevelInheritance;

public class GrandChild extends Father{

    void car(){
        System.out.println("Use Car meet Grandpa");
    }

    public static void main(String[] args) {
        GrandChild gc = new GrandChild();
        gc.home();  // If method or function name same then local will consider that is Father then GrandFather
        gc.house();
        gc.loan();
        gc.savings();
        gc.car();
    }
}

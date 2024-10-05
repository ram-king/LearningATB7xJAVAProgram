package Aug_24.EX_04082024.MultiLevelInheritance.Testing;

public class TestCase1 extends BaseTest{

    void testCase(){
        startBrowser();
        getDataFromSQL();
        System.out.println("Test your cases");
        closeBrowser();
    }

    public static void main(String[] args) {
        TestCase1 t1 = new TestCase1(); // one type of calling
        t1.testCase();

        System.out.println("---------------------");

        new TestCase1().testCase();  // other type of calling
    }
}

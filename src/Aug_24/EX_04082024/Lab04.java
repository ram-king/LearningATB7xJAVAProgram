package Aug_24.EX_04082024;

public class Lab04 {
    public static void main(String[] args) {
        ATBPerson p1 = new ATBPerson();
        new ATBPerson();
        new ATBPerson();
        // how many times you create an object that many times it'll be called

        p1.name = "ATB";
        System.out.println(p1.name);
        p1.phone = 987654321;
        System.out.println(p1.phone);

        ATBPerson p2 = null;
        System.out.println(p2);





    }
}

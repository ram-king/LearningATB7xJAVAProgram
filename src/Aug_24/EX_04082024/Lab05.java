package Aug_24.EX_04082024;

public class Lab05 {
    public static void main(String[] args) {
        ATBPerson p0 = new ATBPerson(); // default object will be executed - ATBPerson()
        ATBPerson p1 = new ATBPerson("Ram");
        ATBPerson p2 = new ATBPerson("OM");
        ATBPerson p3 = new ATBPerson("Pardhu",976543210);
        System.out.println(p0.name);  // here parameters not assigned so null will print
        System.out.println(p1.name);
        System.out.println("Phone Number->"+p2.phone); // here we have not assigned any phone number, so default zero will print
        System.out.println(p3.name);
        System.out.println(p3.phone);
        p0.name = "After Object Created you given name";
        System.out.println(p0.name); // this is default constructor calling
    }
}

package Aug_24.EX_04082024.SingleInheritance.Example;

public class Lab09 {
    public static void main(String[] args) {
        Son ram = new Son();
        ram.bhk3();
        ram.bhk2();
        ram.car();

        Father siva = new Father();
        siva.bhk2();
        siva.car();

        Father f1 = new Son(); // this way also we can write
        f1.bhk2();
        f1.car();

        // here son can extend father properties but not vice-versa

    }
}

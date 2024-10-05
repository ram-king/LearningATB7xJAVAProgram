package Aug_24.EX_04082024.HieraricalInheritance;

public class WillNote {
    // Father's Property every child can have, but he made a Will Note
    // Son1 will get business
    // Son2 will get BMW
    // Daughter1 will get Land property
    // Daughter2 will get ornaments
    // All children will get home

    public static void main(String[] args) {

        Son1 son1=new Son1();
        son1.business();
        son1.car1();
        son1.home();
        System.out.println("---------------------");

        Son2 son2=new Son2();
        son2.bike();
        son2.car();
        son2.home();
        System.out.println("---------------------");

        Daughter1 daughter1=new Daughter1();
        daughter1.bike();
        daughter1.Property();
        daughter1.home();
        System.out.println("---------------------");

        Daughter2 daughter2=new Daughter2();
        daughter2.villa();
        daughter2.ornaments();
        daughter2.home();
        System.out.println("---------------------");
    }
}

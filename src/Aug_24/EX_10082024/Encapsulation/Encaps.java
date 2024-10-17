package Aug_24.EX_10082024.Encapsulation;

// Encapsulation Concept - bundling of data, methods that operates on that data within a single unit

//Advantages of Encapsulation
// 1. Data Hiding
// 2. Increased Flexibility i.e. read-only /write-only you can decide
// 3. Security/privacy

public class Encaps {
    public static void main(String[] args) {
        VWOLogin vwologin = new VWOLogin("admin", "password123");
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);
        vwologin.username="Remz";
        vwologin.password="123";
        System.out.println(vwologin.username);
        System.out.println(vwologin.password);
        // here anyone can access and change username as well as password
        // as both are public in nature but that shouldn't be allowed
    }
}

// We can have n-no. of classes but only one public class will be allowed

class VWOLogin{
    public String username;
    public String password;

    // Parameterized constructor
    public VWOLogin(String username, String password){
        this.username=username;
        this.password=password;
    }
}

class VWOLogin2{

}
class VWOLogin3{

}

//public class VWOLogin1{  two public classes not accepted
//
//}
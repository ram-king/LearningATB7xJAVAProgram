package Aug_24.EX_10082024.Encapsulation;

public class Encaps1 {
    public static void main(String[] args) {
        VWOLogin1 vwoLogin1 = new VWOLogin1("admin", "password123");
        System.out.println("Original username-> "+vwoLogin1.getUsername());
        System.out.println("Original password-> "+vwoLogin1.getPassword());
        vwoLogin1.setUsername("Remz");
        System.out.println("New Username-> "+vwoLogin1.getUsername());
        vwoLogin1.setPassword("0213", true); // provided the authentication true can be allowed to set password
        System.out.println("New Password-> "+vwoLogin1.getPassword());
        vwoLogin1.setPassword("123456", false); // provided the authentication false cannot be allowed to set password
        System.out.println(vwoLogin1.getPassword());
    }
}
class VWOLogin1 {
    private String username;
    private String password;
    // here username and password both are data members it should not access by everyone
    // so to access them we need a getter-setter methods which are public in nature but limited
    // By using getter-setter methods I can control who can get data and who can set data
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password, boolean isAuth) {
        if (isAuth) {
            this.password = password;
            System.out.println("....Allowed to Set.....");
        }else {
            System.out.println("....Not Allowed!....");
        }
    }
    // Parameterized constructor
    public VWOLogin1(String username, String password){
        this.username=username;
        this.password=password;
    }
}

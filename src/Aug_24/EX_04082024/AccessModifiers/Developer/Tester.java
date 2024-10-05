package Aug_24.EX_04082024.AccessModifiers.Developer;

public class Tester {
    public static void main(String[] args) {
        DatingApp datingApp=new DatingApp("Download Allowed","Access Allowed");
        System.out.println(datingApp.download);
        System.out.println(datingApp.accessApp);
        datingApp.canIModifyCode(); // Tester can modify, function was "protected", so only within the same package can access
    }
}

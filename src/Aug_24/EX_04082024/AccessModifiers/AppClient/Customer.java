package Aug_24.EX_04082024.AccessModifiers.AppClient;

import Aug_24.EX_04082024.AccessModifiers.Developer.DatingApp;

public class Customer {
    public static void main(String[] args) {
        DatingApp datingApp=new DatingApp("App Downloaded Enjoy","Enjoy Your Access");
        System.out.println(datingApp.download); // customer can download app
        System.out.println(datingApp.accessApp); // customer can access app
//        datingApp.canIModifyCode(); // customer should not modify app
        System.out.println("Modification Not Allowed");

    }

}

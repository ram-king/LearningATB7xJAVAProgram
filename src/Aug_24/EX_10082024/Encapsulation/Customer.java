package Aug_24.EX_10082024.Encapsulation;

public class Customer {

    public static void main(String[] args) {
        // here You've created account in NetBanking so your username and password as below;
        NetBanking Ram = new NetBanking("Remz", "123456789");

        Ram.getUsername();
        System.out.println("Username is -> "+ Ram.getUsername());

        Ram.getPassword(true);
        System.out.println("Password is -> "+ Ram.getPassword(true));

//        Ram.setusername(); not possible as once username set you cannot change

        // here you can set your new password n-no. of times if you're authorized
        Ram.setPassword("987654321", true);
        System.out.println("New Password is ->"+ Ram.getPassword(true));

    }
}

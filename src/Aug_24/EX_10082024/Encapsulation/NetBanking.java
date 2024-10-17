package Aug_24.EX_10082024.Encapsulation;

public class NetBanking {
    private String username;
    private String password;

    public NetBanking(String username, String password) {
        this.username = username;
        this.password = password;
    }

    // You can get username of NetBanking if you have forgotten
    public String getUsername() {
        return username;
    }

    // But once username set you can't change so setter function of username not required
//    public void setUsername(String username) {
//        this.username = username;
//    }

    // You can get your forgotten password
    public String getPassword(boolean isAuth) {
        if (isAuth) {
            return password;
        } else {
            return "Not Authorized";
        }
}

    // You can set your new password for safety regularly with Authentication
    public void setPassword(String password, boolean isAuth) {
        if(isAuth){
            this.password = password;
            System.out.println("Change New Password!");
    }else {
            System.out.println("Not Allowed!");}
    }
}

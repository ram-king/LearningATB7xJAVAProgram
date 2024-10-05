package Aug_24.EX_04082024.AccessModifiers.Developer;

public class DatingApp {
    public String download;
    public String accessApp;
    private String modifyCode;

    public DatingApp(String download, String accessApp) {
        this.download=download;
        this.accessApp=accessApp;
    }

    protected void canIModifyCode(){
        System.out.println("Yes You Can do Modification!!");
    }

}

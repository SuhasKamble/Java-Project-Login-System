package loginApp;

public class Main {

    public static void main(String[] args) {
        // write your code here
        LoginInfo loginInfo = new LoginInfo();
        LoginPage loginPage = new LoginPage(loginInfo.getData());
    }
}

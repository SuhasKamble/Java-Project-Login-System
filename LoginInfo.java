package loginApp;

import java.util.HashMap;

public class LoginInfo {
    HashMap<String, String> loginData;

    LoginInfo() {
        loginData = new HashMap<String, String>();
        loginData.put("suhas", "goku");
        loginData.put("abc", "abc123");

    }

    protected HashMap getData() {
        return loginData;
    }
}

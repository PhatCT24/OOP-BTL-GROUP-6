package src.account;

import java.io.File;
import java.util.Scanner;

public class Account {
    private String username;
    private String password;

    public Account(String username, String password){
        this.username = username;
        this.password = password;
    }
    // Check if correct login username and password
    public static boolean checklogin(String username, String password)
    throws Exception{
        Scanner sc = new Scanner(new File("src/account/Account.txt"));
        while (sc.hasNextLine()){
            if (sc.next().equals(username) && sc.next().equals(password)){
                return true;
            }
        }
        return false;
    }
}

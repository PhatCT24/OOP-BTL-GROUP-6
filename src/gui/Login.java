package src.gui;

import src.code_and_db.Account;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

interface showNewWindow{

}
public class Login extends JFrame {
    private JTextField username;
    private JPasswordField password;
    private JButton loginbutton;
    private JPanel login;
    private JFrame loginFrame;

    public Login(JFrame loginFrame) {
        this.loginFrame = loginFrame;

        loginbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    if (Account.checklogin(username.getText(), password.getText())) {
                        // Open the menu window
                        JFrame menuForm = showNewWindow("Menu", 500, 300);
                        menuForm.setContentPane(new MenuForm().getMenuForm());
                        menuForm.setVisible(true);
                        menuForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                        menuForm.setResizable(false);
                        menuForm.setLocationRelativeTo(null);
                        menuForm.pack();

                        // Close the login window
                        loginFrame.dispose();
                    } else {
                        JOptionPane.showMessageDialog(null, "Incorrect username or password!","Login Failed", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    ex.printStackTrace();
                }
            }
        });


        loginbutton.addKeyListener(new KeyAdapter() {
            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode() == KeyEvent.VK_ENTER){
                    loginbutton.doClick();
                    try {
                        if (Account.checklogin(username.getText(), password.getText())) {
                            // Open the menu window
                            JFrame menuForm = showNewWindow("Menu", 500, 300);
                            menuForm.setContentPane(new MenuForm().getMenuForm());
                            menuForm.setVisible(true);
                            menuForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                            menuForm.setResizable(false);
                            menuForm.setLocationRelativeTo(null);
                            menuForm.pack();

                            // Close the login window
                            loginFrame.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "Incorrect username or password!","Login Failed", JOptionPane.ERROR_MESSAGE);
                        }
                    } catch (Exception ex) {
                        ex.printStackTrace();
                    }
                }
            }
        });
    }

    private JFrame showNewWindow(String title, int x, int y) {
        JFrame frame = new JFrame(title);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(x, y);
        return frame;
    }

    // Start
    public static void main(String[] args) {
        JFrame login = new JFrame("Login");
        login.setSize(504, 336);

        // Pass the login JFrame to the Login class constructor
        Login loginPanel = new Login(login);
        login.setContentPane(loginPanel.login);
        login.setLocationRelativeTo(null);
        login.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        login.setVisible(true);
    }
}

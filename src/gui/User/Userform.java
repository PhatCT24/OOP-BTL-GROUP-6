package src.gui.User;

import src.Login.showNewWindow;
import src.gui.Books.Addbooks;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Userform {
    private JButton findbutton;
    private JButton addbutton;
    private JButton removebutton;
    private JButton updatebutton;
    private JPanel UserForm;

    public Userform() {
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame AddUsers = showNewWindow.showNewWindow("Add an User", 576,200);
                AddUsers.setContentPane(new AddUser().getAddUser());
                AddUsers.setVisible(true);
                AddUsers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                AddUsers.setResizable(false);
                AddUsers.setLocationRelativeTo(null);
                AddUsers.pack();
            }
        });
        removebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame RemoveUsers = showNewWindow.showNewWindow("Remove an user", 576,200);
                RemoveUsers.setContentPane(new RemoveUser().getRemoveUsers());
                RemoveUsers.setVisible(true);
                RemoveUsers.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                RemoveUsers.setResizable(false);
                RemoveUsers.setLocationRelativeTo(null);
                RemoveUsers.pack();
            }
        });
    }

    public JPanel getUserForm() {
        return UserForm;
    }
}

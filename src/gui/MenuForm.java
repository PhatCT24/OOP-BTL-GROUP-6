package src.gui;

import src.gui.Books.Booksform;
import src.gui.User.Userform;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame implements showNewWindow{
    private JButton userbutton;
    private JLabel Books;
    private JLabel user;
    private JButton booksbutton;
    private JButton borrowbutton;
    private JPanel menuForm;
    private JButton button1;
    private JFrame prev;



    public MenuForm() {
        booksbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame BookForm = Login.showNewWindow("Book Form", 500, 300);
                BookForm.setContentPane(new Booksform().getBookForm());
                BookForm.setVisible(true);
                BookForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                BookForm.setResizable(false);
                BookForm.setLocationRelativeTo(null);
                BookForm.pack();
            }
        });
        userbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame UserForm = Login.showNewWindow("User Form", 500, 300);
                UserForm.setContentPane(new Userform().getUserForm());
                UserForm.setVisible(true);
                UserForm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                UserForm.setResizable(false);
                UserForm.setLocationRelativeTo(null);
                UserForm.pack();
            }
        });
        borrowbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }



    public JPanel getMenuForm(){
        return menuForm;
    }
}



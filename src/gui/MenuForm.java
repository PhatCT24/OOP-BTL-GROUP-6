package src.gui;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuForm extends JFrame{
    private JButton userbutton;
    private JLabel Books;
    private JLabel user;
    private JButton booksbutton;
    private JButton borrowbutton;
    private JPanel menuForm;
    private JButton button1;

    public MenuForm() {
        booksbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            }
        });
    }

    public MenuForm(JFrame BookForm){
        booksbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
    }

    public JPanel getMenuForm(){
        return menuForm;
    }
}



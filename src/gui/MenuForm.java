package src.gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuForm {
    private JButton userbutton;
    private JLabel Books;
    private JLabel user;
    private JButton booksbutton;
    private JButton button1;

    public MenuForm() {
        userbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
}



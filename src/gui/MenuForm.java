package src.gui;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class MenuForm {
    private JLabel userbutton;
    private JLabel books;
    private JLabel user;
    private JButton booksbutton;

    public MenuForm() {
        userbutton.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }
        });
    }
}



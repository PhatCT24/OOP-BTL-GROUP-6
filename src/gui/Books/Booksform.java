package src.gui.Books;

import src.Login.showNewWindow;
import src.gui.MenuForm;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Booksform implements showNewWindow {
    private JButton findbutton;
    private JButton addbutton;
    private JButton removebutton;
    private JButton updatebutton;
    private JPanel BookForm;

    public Booksform() {
        findbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        addbutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame AddBooks = showNewWindow.showNewWindow("Add a book", 576,200);
                AddBooks.setContentPane(new Addbooks().getAddBooks());
                AddBooks.setVisible(true);
                AddBooks.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                AddBooks.setResizable(false);
                AddBooks.setLocationRelativeTo(null);
                AddBooks.pack();
            }
        });
        removebutton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame removeBooks = showNewWindow.showNewWindow("Remove a book", 576,200);
                removeBooks.setContentPane(new Removebooks().getRemoveBooks());
                removeBooks.setVisible(true);
                removeBooks.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                removeBooks.setResizable(false);
                removeBooks.setLocationRelativeTo(null);
                removeBooks.pack();
            }
        });
    }

    public JPanel getBookForm() {
        return BookForm;
    }
}

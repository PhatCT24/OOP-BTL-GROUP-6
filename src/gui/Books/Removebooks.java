package src.gui.Books;

import src.Login.showNewWindow;
import src.gui.MenuForm;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Removebooks {
    private JTextField textField2;
    private JButton removeButton;
    private JPanel removeBooks;
    private JTable table1;

    public Removebooks() {
        removeButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JFrame RemoveBookConfirm = showNewWindow.showNewWindow("Confirm", 576,200);
                RemoveBookConfirm.setContentPane(new Remove_BookConfirm().getRemoveConfirmation());
                RemoveBookConfirm.setVisible(true);
                RemoveBookConfirm.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
                RemoveBookConfirm.setResizable(false);
                RemoveBookConfirm.setLocationRelativeTo(null);
                RemoveBookConfirm.pack();
            }
        });
    }

    private void createUIComponents() {
        String[] columnNames = {"ID", "Name", "Age"};
        Object[][] data = {
                {1, "John", 25},
                {2, "Mary", 30},
                {3, "Steve", 28}
        };
        DefaultTableModel model = new DefaultTableModel(data, columnNames);
        table1 = new JTable(model);

        // Thêm JTable vào JScrollPane
        JScrollPane scrollPane = new JScrollPane(table1);
    }

    public JPanel getRemoveBooks(){
        return removeBooks;
    }
}

package src.gui.Books;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class Removebooks {
    private JTextField textField1;
    private JTextField textField2;
    private JButton removeButton;
    private JTable table1;



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
}

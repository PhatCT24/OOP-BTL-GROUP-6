package src.Login;

import javax.swing.*;
import java.awt.*;

public interface showNewWindow{
    public static JFrame showNewWindow(String title, int x, int y){
        JFrame frame = new JFrame(title);
        frame.setSize(500, 300);
        frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.setLocation(x, y);
        return frame;
    }
}

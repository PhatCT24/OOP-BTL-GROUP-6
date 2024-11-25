package src;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;
class EnterBtn extends JFrame implements ActionListener, KeyListener
{
    public static void main(String[] args)
    {
        // create a frame
        JFrame frame = new JFrame("Associate the Enter key with JButton");
        // create an object
        EnterBtn obj = new EnterBtn();
        // create a panel
        JPanel panel = new JPanel();

        JLabel lname = new JLabel("Enter your name here:");
        JTextField tname = new JTextField(21);
        JButton btn = new JButton("Click here");
        // add listener to button
        btn.addActionListener(obj);
        // add the listener to the textField
        tname.addKeyListener(obj);
        // add textFields and button to panel
        panel.add(lname);
        panel.add(tname);
        panel.add(btn);
        frame.add(panel);
        frame.setSize(300, 130);
        frame.show();
        frame.setLocationRelativeTo(null);
    }

    public void actionPerformed(ActionEvent e)
    {
        String s = e.getActionCommand();
        if(s.equals("Click here")){
            JOptionPane.showMessageDialog(null , "Your form has been sent");
        }
    }
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode()==KeyEvent.VK_ENTER){
            JOptionPane.showMessageDialog(null , "Your form has been sent");
        }
    }
    @Override
    public void keyReleased(KeyEvent arg) {}
    @Override
    public void keyTyped(KeyEvent arg) {}
}
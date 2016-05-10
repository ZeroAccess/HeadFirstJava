package chapter12;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by robertsg on 5/9/2016.
 */
public class SimpleGui1C implements ActionListener {
    JFrame frame;

    public static void main(String[] args) {
        SimpleGui1C gui = new SimpleGui1C();
        gui.go();
    }

    public void go() {
        frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();
        JButton button = new JButton("Click Me");
        button.addActionListener(this);

        frame.getContentPane().add(BorderLayout.NORTH, button);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setSize(420,420);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        frame.repaint();
    }
}

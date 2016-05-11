package chapter12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by robertsg on 5/10/2016.
 */
public class SimpleAnimation {
    int x = 10;
    int y = 10;

    public static void main(String[] args) {
        SimpleAnimation gui = new SimpleAnimation();
        gui.go();
    }

    void go() {
        JFrame frame = new JFrame();
        MyDrawPanel panel = new MyDrawPanel();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.CENTER, panel);
        frame.setSize(300,300);
        frame.setVisible(true);

        for(int i = 0; i  < 200; i++) {
            x++;
            y++;
            panel.repaint();
            try {
                Thread.sleep(50);
            } catch (Exception ex){

            }
        }
    }

    class MyDrawPanel extends JPanel {
        public void paintComponent(Graphics g) {
            g.setColor(Color.white);
            g.fillRect(0,0,getWidth(),getHeight());

            g.setColor(Color.green);
            g.fillOval(x,y,40,40);
        }
    }
}

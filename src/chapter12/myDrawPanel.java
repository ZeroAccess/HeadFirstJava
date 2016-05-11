package chapter12;

import javax.swing.*;
import java.awt.*;

/**
 * Created by robertsg on 5/9/2016.
 */
public class MyDrawPanel extends JPanel {
    public void paintComponent(Graphics g) {
        Graphics2D g2d = (Graphics2D) g;

        int red = (int) (Math.random() * 255);
        int green = (int) (Math.random() * 255);
        int blue = (int) (Math.random() * 255);

        Color startColor = new Color(red, green, blue);

        red = (int) (Math.random() * 255);
        green = (int) (Math.random() * 255);
        blue = (int) (Math.random() * 255);

        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(25,25, startColor, 95, 95, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(20,20,100,100);
    }
}

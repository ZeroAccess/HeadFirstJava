package chapter13;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by robertsg on 5/13/2016.
 */
public class Panel1 implements ActionListener, ListSelectionListener {
    JTextArea text;
    JList list;

    public static void main(String[] args) {
        Panel1 gui = new Panel1();
        gui.go();
    }

    public void go() {
        JFrame frame = new JFrame();
        JPanel panel = new JPanel();
        JPanel panelList = new JPanel();
        JButton button1 = new JButton("Click Me");
        String[] listEntries = {"alpha", "beta", "gamma", "delta", "epsilon", "zeta", "eta", "theta"};
        list = new JList(listEntries);

        list.setVisibleRowCount(4);
        list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        list.addListSelectionListener(this);

        text = new JTextArea(10,10);
        text.setLineWrap(true);

        JScrollPane scroller = new JScrollPane(text);
        scroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        scroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        JScrollPane listScroller = new JScrollPane(list);
        listScroller.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        listScroller.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);

        button1.addActionListener(this);

        panel.add(button1);
        panel.setBackground(Color.darkGray);

        panelList.add(listScroller);
        panelList.setBackground(Color.blue);

        frame.getContentPane().add(BorderLayout.EAST, scroller);
        frame.getContentPane().add(BorderLayout.SOUTH, panel);
        frame.getContentPane().add(BorderLayout.WEST, panelList);
        frame.setSize(350,300);
        frame.setVisible(true);
    }

    public void actionPerformed(ActionEvent ev) {
        text.append("Button Clicked\n");
    }

    public void valueChanged(ListSelectionEvent lse) {
        if(!lse.getValueIsAdjusting()) {
            String selection = (String) list.getSelectedValue();
            System.out.println(selection);
        }
    }
}
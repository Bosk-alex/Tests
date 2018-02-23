package main.java.tests.Windows;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class Layout extends JFrame implements ActionListener {

    private final int x = 7;
    private final int y = 8;
    //    String computer = "O";
private final String empty = " ";
    private final JButton[] buttons = new JButton[x * y];

    private Layout() {
        super("TEST WINDOW");
        setLocation(200, 0);
        setSize(x * 50, y * 50 + 80);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel(new GridLayout(y, x));
        for (int i = 0; i < x * y; i++) {
            buttons[i] = new JButton(empty);
            panel.add(buttons[i]);
            buttons[i].addActionListener(this);
        }
        JPanel lowerPanel1 = new JPanel();
        lowerPanel1.setLayout(new BorderLayout());
        JPanel lowerPanel2 = new JPanel();
        lowerPanel2.setLayout(new BorderLayout());
        lowerPanel1.add(new JButton("1"));
        lowerPanel2.add(new JButton("2"));
        Container contentPane = getContentPane();
        contentPane.add("Center", panel);
        lowerPanel1.add(lowerPanel2, BorderLayout.SOUTH);
        contentPane.add("South", lowerPanel1);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        for (int i = 0; i < x * y; i++) {
            if (event.getSource() == buttons[i]) {
                if (buttons[i].getActionCommand().equals(empty)) {
                    String player = "X";
                    buttons[i].setText(player);
                    buttons[i].setEnabled(false);
                }
            }
        }
    }

    public static void main(String[] args) {
        new Layout();
    }
}

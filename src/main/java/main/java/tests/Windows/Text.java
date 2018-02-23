package main.java.tests.Windows;

import javax.swing.*;
import java.awt.*;

class Text extends JFrame {

    private Text() {
        super("TEST WINDOW");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        setVisible(true);

        JTextField text = new JTextField("Input some text");
        text.setFont(new Font("Serif", Font.BOLD, 50));
        panel.add(text);
    }

    public static void main(String[] args) {
        new Text();
    }
}

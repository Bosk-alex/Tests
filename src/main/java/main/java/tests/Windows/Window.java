package main.java.tests.Windows;

import javax.swing.*;

class Window extends JFrame {

    private Window() {
        super("TEST WINDOW");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Window();
    }
}

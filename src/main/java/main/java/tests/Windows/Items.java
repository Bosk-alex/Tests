package main.java.tests.Windows;

import javax.swing.*;

@SuppressWarnings("ALL")
public class Items extends JFrame {

    JPanel panel = new JPanel();

    String[] toppings = {"Pepperoni", "Mushrooms", "Ham", "Tomato"};
    JCheckBox chk1 = new JCheckBox(toppings[0]);
    JCheckBox chk2 = new JCheckBox(toppings[1], true);
    JCheckBox chk3 = new JCheckBox(toppings[2]);
    JCheckBox chk4 = new JCheckBox(toppings[3]);

    String[] styles = {"deep form", "humans", "thin"};
    JComboBox<String> box1 = new JComboBox<>(styles);

    JList<String> list1 = new JList<>(toppings);

    public Items() {
        super("TEST WINDOW");
        setSize(500, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        add(panel);
        setVisible(true);

        panel.add(chk1);
        panel.add(chk2);
        panel.add(chk3);
        panel.add(chk4);
        box1.setSelectedIndex(0);
        panel.add(box1);
        panel.add(list1);
    }

    public static void main(String[] args) {
        new Items();
    }
}

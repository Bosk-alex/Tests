package main.java.tests.Windows;

import javax.swing.*;

class Radios extends JFrame {

    private Radios() {
        super("TEST WINDOW");
        setSize(1000, 200);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        JPanel panel = new JPanel();
        add(panel);
        setVisible(true);

        ButtonGroup wines = new ButtonGroup();
        JRadioButton rad1 = new JRadioButton("Red", true);
        wines.add(rad1);
        JRadioButton rad2 = new JRadioButton("Rose");
        wines.add(rad2);
        JRadioButton rad3 = new JRadioButton("White");
        wines.add(rad3);
        panel.add(rad1);
        panel.add(rad2);
        panel.add(rad3);
        JSlider sld1 = new JSlider();
        sld1.setMajorTickSpacing(50);
        sld1.setMinorTickSpacing(10);
        sld1.setPaintTicks(true);
        sld1.setPaintLabels(true);
        sld1.setPaintTrack(false);
        sld1.setSnapToTicks(true);
        sld1.setSize(500, 50);
        panel.add(sld1);
    }

    public static void main(String[] args) {
        new Radios();
    }
}

package org.devg84;

import javax.swing.*;

public class Main {

    static void main() {
        JFrame frame = new JFrame("Figuras");
        Canvas panel = new Canvas();

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
        frame.setSize(500, 500);
        frame.setVisible(true);
    }

}

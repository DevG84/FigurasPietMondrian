package org.devg84.classes.shapes;

import org.devg84.classes.Figura;

import java.awt.*;

public class Circulo extends Figura {
    private final int radius;
    private final int diameter;

    public Circulo() {
        super();
        radius = diameter = 0;
    }

    public Circulo(int x, int y, int radius, int border, Color color) {
        super(x, y, border, color);
        this.radius = radius;
        this.diameter = radius * 2;
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(this.color);
        g.fillOval(x, y, diameter, diameter);
        if (border != 0) {
            g.setColor(Color.BLACK);
            g.setStroke(new BasicStroke(border));
            g.drawOval(x, y, diameter, diameter);
        }
    }
}

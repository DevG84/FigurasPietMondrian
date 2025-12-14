package org.devg84.classes.shapes;

import org.devg84.classes.Figura;

import java.awt.*;

public class Rectangulo extends Figura {
    private final int width, height;

    public Rectangulo() {
        super();
        width = height = 0;
    }

    public Rectangulo(int x, int y, int width, int height, int border, Color color) {
        super(x, y, border, color);
        this.width = width;
        this.height = height;
    }

    @Override
    public void dibujar(Graphics2D g) {
        g.setColor(color);
        g.fillRect(x, y, width, height);
        if (border != 0) {
            g.setColor(Color.BLACK);
            g.setStroke(new BasicStroke(border));
            g.drawRect(x, y, width, height);
        }
    }
}

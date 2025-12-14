package org.devg84.classes;

import java.awt.*;

public abstract class Figura {
    protected int x, y, border;
    protected Color color;

    public Figura() {
        x = y = border = 0;
        color = null;
    }

    public Figura(int x, int y, int border, Color color) {
        this.x = x;
        this.y = y;
        this.border = border;
        this.color = color;
    }

    public abstract void dibujar(Graphics2D g);
}

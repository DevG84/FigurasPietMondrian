package org.devg84.classes.shapes;

import java.awt.*;

public class Cuadrado extends Rectangulo {
    private final int side;

    public Cuadrado() {
        super();
        side = 0;
    }

    public Cuadrado(int x, int y, int side, int border, Color color) {
        this.side = side;
        super(x, y, side, side, border, color);
    }
}

package org.devg84;

import org.devg84.classes.Figura;
import org.devg84.classes.shapes.Circulo;
import org.devg84.classes.shapes.Cuadrado;
import org.devg84.classes.shapes.Rectangulo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Canvas extends JPanel {
    protected List<Figura> figuras;

    public Canvas() {
        figuras = new ArrayList<Figura>();
        final int BORDE = 2;

        // Columna 1
        figuras.add(new Cuadrado(0, 0, 70, BORDE, Color.RED));
        figuras.add(new Rectangulo(0, 72, 70, 40, BORDE, Color.WHITE));
        figuras.add(new Rectangulo(0, 114, 70, 80, BORDE, Color.BLUE));
        figuras.add(new Rectangulo(0, 196, 70, 100, BORDE, Color.BLACK));

        // Columna 2
        figuras.add(new Rectangulo(72, 0, 100, 40, BORDE, Color.WHITE));
        figuras.add(new Rectangulo(72, 42, 100, 70, BORDE, Color.YELLOW));
        figuras.add(new Rectangulo(72, 114, 100, 50, BORDE, Color.GRAY));
        figuras.add(new Rectangulo(72, 166, 100, 130, BORDE, Color.WHITE));

        // Columna 3
        figuras.add(new Rectangulo(174, 0, 150, 90, BORDE, Color.BLUE));
        figuras.add(new Rectangulo(174, 92, 150, 50, BORDE, Color.RED));
        figuras.add(new Rectangulo(174, 144, 150, 70, BORDE, Color.WHITE));
        figuras.add(new Rectangulo(174, 216, 150, 80, BORDE, Color.YELLOW));

        // Columna 4
        figuras.add(new Rectangulo(326, 0, 80, 50, BORDE, Color.WHITE));
        figuras.add(new Rectangulo(326, 52, 80, 120, BORDE, Color.BLACK));
        figuras.add(new Rectangulo(326, 172, 80, 42, BORDE, Color.GREEN));
        figuras.add(new Cuadrado(326, 216, 80, BORDE, Color.WHITE));

        // Circulo
        figuras.add(new Circulo(125, 120, 50, BORDE+2, Color.pink));
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        Graphics2D p = (Graphics2D) g;

        for (Figura f: figuras)
            f.dibujar(p);
    }
}

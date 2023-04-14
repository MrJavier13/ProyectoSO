package SnakeGame;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Fondo extends JPanel {

    Color backgroundColor = Color.BLACK;
    int maxSizePanel, squaresSize, quantity, overFlow;

    public Fondo(int maxSizePanel, int quantity) {
        this.maxSizePanel = maxSizePanel;
        this.quantity = quantity;
        this.squaresSize = maxSizePanel / quantity;
        this.overFlow = maxSizePanel % quantity;
    }

    @Override
    public void paint(Graphics painter) {
        super.paint(painter);
        painter.setColor(backgroundColor);

        for (int x = 0; x < quantity; x++) {
            for (int y = 0; y < quantity; y++) {
                painter.fillRect(overFlow / 2 + x * squaresSize, overFlow / 2 + y * squaresSize, squaresSize - 1, squaresSize - 1);
            }
        }
    }

}

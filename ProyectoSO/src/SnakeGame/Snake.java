package SnakeGame;

import Principal.MenuPrincipal;
import java.awt.Color;
import java.awt.Graphics;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class Snake extends JPanel {

    Color snakeColor = Color.WHITE;
    Color foodColor = Color.RED;
    int maxSizePanel, squaresSize, quantity, overFlow;
    List<int[]> snake = new ArrayList<>();
    int[] food = new int[2];
    String adress = "right";
    String nextAdress = "right";

    Thread hilo;
    Walker walker;

    public Snake(int maxSizePanel, int quantity) {
        this.maxSizePanel = maxSizePanel;
        this.quantity = quantity;
        this.squaresSize = maxSizePanel / quantity;
        this.overFlow = maxSizePanel % quantity;
        int[] a = {quantity / 2 - 1, quantity / 2 - 1};
        int[] b = {quantity / 2, quantity / 2 - 1};
        snake.add(a);
        snake.add(b);
        generateFood();

        walker = new Walker(this);
        hilo = new Thread(walker);
        hilo.start();
    }

    @Override
    public void paint(Graphics painter) {
        super.paint(painter);
        painter.setColor(snakeColor);

        for (int[] par : snake) {
            painter.fillRect(overFlow / 2 + par[0] * squaresSize, overFlow / 2 + par[1] * squaresSize, squaresSize - 1, squaresSize - 1);
        }

        painter.setColor(foodColor);
        painter.fillRect(overFlow / 2 + food[0] * squaresSize, overFlow / 2 + food[1] * squaresSize, squaresSize - 1, squaresSize - 1);

    }

    public void avanzar() {
        equalAdress();
        int[] last = snake.get(snake.size() - 1);
        int addX = 0;
        int addY = 0;
        switch (adress) {
            case "right":
                addX = 1;
                break;
            case "left":
                addX = -1;
                break;
            case "up":
                addY = -1;
                break;
            case "down":
                addY = 1;
                break;
        }
        int[] newPos = {Math.floorMod(last[0] + addX, quantity), Math.floorMod(last[1] + addY, quantity)};

        boolean exist = false;
        for (int i = 0; i < snake.size(); i++) {
            if (newPos[0] == snake.get(i)[0] && newPos[1] == snake.get(i)[1]) {
                exist = true;
                break;
            }
        }
        if (exist) {
            JOptionPane.showMessageDialog(null, "Has perdido!!!");
            System.exit(0);

        } else {
            if (newPos[0] == food[0] && newPos[1] == food[1]) {
                snake.add(newPos);
                generateFood();
            } else {
                snake.add(newPos);
                snake.remove(0);
            }
        }
    }

    public void generateFood() {
        boolean exist = false;
        int x = (int) (Math.random() * quantity);
        int y = (int) (Math.random() * quantity);

        for (int[] par : snake) {
            if (par[0] == x && par[1] == y) {
                exist = true;
                generateFood();
                break;
            }
        }
        if (!exist) {
            this.food[0] = x;
            this.food[1] = y;
        }
    }

    public void changeAdress(String adress1) {
        if ((this.adress.equals("right") || this.adress.equals("left") && (adress1.equals("up") || adress1.equals("down")))) {
            this.nextAdress = adress1;
        }
        if ((this.adress.equals("up") || this.adress.equals("down") && (adress1.equals("left") || adress1.equals("right")))) {
            this.nextAdress = adress1;
        }

    }

    public void equalAdress() {
        this.adress = this.nextAdress;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package SnakeGame;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author SrCantones
 */
public class Walker implements Runnable {

    Snake snake;
    boolean state = true;

    public Walker(Snake snake) {
        this.snake = snake;
    }

    @Override
    public void run() {

        while (state) {
            snake.avanzar();
            snake.repaint();
            try {
                Thread.sleep(250);
            } catch (InterruptedException ex) {
                Logger.getLogger(Walker.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public void stopWalker() {
        this.state = false;
    }

}

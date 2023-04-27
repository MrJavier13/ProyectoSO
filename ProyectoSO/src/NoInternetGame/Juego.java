package NoInternetGame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.net.URL;
import javax.swing.JPanel;

public class Juego extends JPanel {

    //Sinodos del juego
    URL direccionSonidoSalto, direccionSonidoChoque;
    AudioClip sonidoChoque, sonidoSalto;

    //objetos de las clases de dinosaurio, cactus y fondo
    Dinosaurio dinosuario = new Dinosaurio(this);
    Cactus cactus = new Cactus(this);
    Fondo fondo = new Fondo(this);

    //variables del juego
    static boolean juegoFinalizado = false;
    static boolean pierdeVida = false;
    static int vidas = 3;
    static int puntos = 0;
    static int nivel = 1;
    
    public Juego() {
        direccionSonidoChoque = getClass().getResource("/Sonidos/Zzz.mp3");
        sonidoChoque = Applet.newAudioClip(direccionSonidoChoque);
        
        direccionSonidoSalto = getClass().getResource("/Sonidos/DOIT-Cortado.mp3");
        sonidoSalto = Applet.newAudioClip(direccionSonidoSalto);
        
        addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {
                
            }
            
            @Override
            public void keyPressed(KeyEvent e) {
                //el salto se activa con la tecla spaceBar y activa el sonido del salto
                if (e.getKeyCode() == KeyEvent.VK_SPACE) {
                    sonidoSalto.play();
                    dinosuario.keyPressed(e);
                }
            }
            
            @Override
            public void keyReleased(KeyEvent e) {
                
            }
            
        });
        
        setFocusable(true);
        
    }
    
    @Override
    public void paintComponent(Graphics g) {
       super.paintComponent(g);
        Graphics2D g2 = (Graphics2D) g;
        dibujar(g2);
        dibujarPuntaje(g2); 
    }
    
    public void dibujar(Graphics2D g) {
        fondo.paint(g);
        dinosuario.paint(g);
        cactus.paint(g);
    }
    
    public void dibujarPuntaje(Graphics2D g){
        
    }
}

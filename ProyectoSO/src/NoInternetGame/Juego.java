package NoInternetGame;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Font;
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
    public static boolean juegoFinalizado = false;
    public static boolean pierdeVida = false;
    public static int vidas = 3;
    public static int puntos = 0;
    public static int nivel = 1;
    
    public Juego() {
        direccionSonidoChoque = getClass().getResource("/Sonidos/Zzz.wav");
        sonidoChoque = Applet.newAudioClip(direccionSonidoChoque);
        
        direccionSonidoSalto = getClass().getResource("/Sonidos/DOIT-Cortado.wav");
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
    
    public void mover(){
        cactus.mover();
        dinosuario.mover();
        fondo.mover();
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
        mover();
    }
    
    public void dibujarPuntaje(Graphics2D g){
        Graphics2D g1=g,g2=g;
        Font score= new Font("Arial",Font.BOLD,30);
        g.setFont(score);
        g.setColor(Color.green);
        g1.drawString("Puntaje: "+puntos,1100,30);
        g1.drawString("Vidas: "+vidas,20,30);
        g1.drawString("Nivel: "+nivel,570,30);
        
        if(juegoFinalizado){
            g2.setColor(Color.red);
            g2.drawString("!!!Has perdido",((float)getBounds().getCenterX()/2)+170,70);
        }
    }
    
    public void finJuego(){
        juegoFinalizado=true;
        sonidoChoque.play();
    }
    
    public void pierdeVida(){
        sonidoChoque.play();
        pierdeVida=true;
    }
}

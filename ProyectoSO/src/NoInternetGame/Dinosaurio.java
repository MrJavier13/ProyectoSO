package NoInternetGame;

import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

public class Dinosaurio {

    Juego juego;
    
    //variables de acciones
    
    static boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    
    //variables que limitan el area del dinosaurio(hitbox)
    
    Area cola, ocico, patas, dino;
    
    //variables tamaño del dinosario
    
    int anchoDinosaurio = 78;
    int altoDinosaurio = 112;
    
    //coordenadas dee la posicion inicial del dinosaurio
    
    static int x_inicial = 50;
    static int y_incial = 450;
    
    //coordendas para manipular el personaje 
    
    int x_auxiliar = 0;
    int y_auxiliar = 0;
    
    public Dinosaurio(Juego juego) {
        this.juego = juego;
    }
    
   public void paint(Graphics2D g){
    ImageIcon dinosaurio = new ImageIcon(getClass().getResource("/NoInternetGame/dino.png"));
    if (dinosaurio.getImageLoadStatus() != MediaTracker.COMPLETE) {
        System.out.println("Error al cargar la imagen del dinosaurio");
    }
    g.drawImage(dinosaurio.getImage(), x_inicial, y_incial, anchoDinosaurio, altoDinosaurio, null);
}


    public void keyPressed(KeyEvent e) {
        //el salto se activa con la tecla spaceBar y activa el sonido del salto
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            saltando = true;
        }
    }
}

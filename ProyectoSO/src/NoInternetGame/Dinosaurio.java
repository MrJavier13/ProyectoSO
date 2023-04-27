package NoInternetGame;

import java.awt.Graphics2D;
import java.awt.MediaTracker;
import java.awt.Rectangle;
import java.awt.event.KeyEvent;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Dinosaurio {

    Juego juego;
    
    //variables de acciones
    
    static boolean saltando = false;
    boolean sube = false;
    boolean baja = false;
    
    //variables que limitan el area del dinosaurio(hitbox)
    
    Area patas, dino, cabeza, cuerpo;
    
    //variables tamaño del dinosario
    
    int anchoDinosaurio = 78;
    int altoDinosaurio = 112;
    
    //coordenadas de la posicion inicial del dinosaurio
    
    static int x_inicial = 50;
    static int y_inicial = 400;
    
    //coordendas para manipular el personaje 
    
    int x_auxiliar = 0;
    int y_auxiliar = 0;
    
    public Dinosaurio(Juego juego) {
        this.juego = juego;
    }
    
    public void mover(){
        if(x_inicial+x_auxiliar>0 && x_inicial+x_auxiliar<juego.getWidth()-anchoDinosaurio){
            x_inicial+=x_auxiliar;
        
        }       
        if(saltando){
            if(y_inicial==400){
                sube=true;
                y_auxiliar=-2;
                baja=false;
            }
            if(y_inicial==250){
                baja=true;
                y_auxiliar=2;
                sube=false;
            }
            if(sube){
                y_inicial+=y_auxiliar;
            }
            if(baja){
                y_inicial+=y_auxiliar;
                if(y_inicial==400){
                    saltando=false;
                }
            }
            
        }
    }
    
   public void paint(Graphics2D g){
    ImageIcon dinosaurio = new ImageIcon(getClass().getResource("/NoInternetGame/dino.png"));
    if (dinosaurio.getImageLoadStatus() != MediaTracker.COMPLETE) {
        System.out.println("Error al cargar la imagen del dinosaurio");
    }
    g.drawImage(dinosaurio.getImage(), x_inicial, y_inicial, anchoDinosaurio, altoDinosaurio, null);
}


    public void keyPressed(KeyEvent e) {
        //el salto se activa con la tecla spaceBar y activa el sonido del salto
        if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            saltando = true;
        }
       
    }
    
    public Area getBounds(){
        Rectangle forma1= new Rectangle(x_inicial,y_inicial,55,99);
        cuerpo = new Area(forma1);
        dino=cuerpo;
        
        return dino;
    }
}

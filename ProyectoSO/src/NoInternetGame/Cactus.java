package NoInternetGame;

import java.awt.Graphics2D;
import java.awt.geom.Area;
import javax.swing.ImageIcon;

public class Cactus {
    Juego juego;
    
    //variables que limitan el area del dinosaurio(hitbox)
    
    Area cactusIzquierdo, cactusDerecho, cactusCompleto;
    
    //variables tamaño del dinosario
    
    int anchoCactus = 70;
    int altoCactus = 70;
    
    //coordenadas dee la posicion inicial del dinosaurio
    
    static int x_inicial = 1200;
    static int y_incial = 450;
    
    //coordendas para manipular el personaje 
    
    static int x_auxiliar = -4;
//    int y_auxiliar = 0;
    
    
    public void paint(Graphics2D g){
        ImageIcon cactus = new ImageIcon(getClass().getResource("/NoInternetGame/cactus.png"));
        g.drawImage(cactus.getImage(), x_inicial, y_incial, anchoCactus, altoCactus, null);
    }
    
    public Cactus(Juego juego){
        this.juego = juego;
    }
}

package NoInternetGame;

import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Area;
import java.awt.geom.Ellipse2D;
import javax.swing.ImageIcon;

public class Cactus {
    Juego juego;
    
    //variables que limitan el area del dinosaurio(hitbox)
    
    Area cactus, cuerpo;
    
    //variables tamaño del dinosario
    
    int anchoCactus = 70;
    int altoCactus = 70;
    
    //coordenadas dee la posicion inicial del dinosaurio
    
    static int x_inicial = 1200;
    static int y_inicial = 435;
    
    //coordendas para manipular el personaje 
    
    static int x_auxiliar = -4;
//    int y_auxiliar = 0;
    
    public void mover(){
        if(x_inicial<=-100){
            juego.puntos++;
            x_inicial= 1300;
                if(juego.puntos==3 | juego.puntos==6| juego.puntos==9 | juego.puntos==12 | juego.puntos==15 | juego.puntos==18|juego.puntos==21){
                    x_auxiliar+=-2;
                    juego.nivel++;
                }
        }else{
            if(colision()){
                if(juego.vidas==0){
                    juego.finJuego();
                }else{
                    juego.pierdeVida();
                }
            }else{
                x_inicial+=x_auxiliar;
            } 
        }
        
    }
    
    public void paint(Graphics2D g){
        ImageIcon cactus = new ImageIcon(getClass().getResource("/NoInternetGame/cactus.png"));
        g.drawImage(cactus.getImage(), x_inicial, y_inicial, anchoCactus, altoCactus, null);
    }
    
    public Cactus(Juego juego){
        this.juego = juego;
    }
    
     public Area getBounds(){
        Rectangle forma1= new Rectangle(x_inicial,y_inicial,55,60);
        cuerpo = new Area(forma1);
        
        cactus=cuerpo;
       
        return cactus;
    }
     
     public boolean colision(){
         Area areaA=new Area(juego.dinosuario.getBounds());
         areaA.intersect(getBounds());
         
         return !areaA.isEmpty();
     
     }
}

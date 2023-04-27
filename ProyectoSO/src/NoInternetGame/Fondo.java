package NoInternetGame;

import java.awt.Graphics2D;
import javax.swing.ImageIcon;

public class Fondo {

    Juego juego;

    //variables tamaño del fondo
    int anchoFondo = 1300;
    int altoFondo = 600;

    //coordenadas dee la posicion inicial del fondo
    int x_inicial = 1300;
    int y_incial = 0;

    //coordendas para manipular el fondo 
    int x_auxiliar = 0;
    int y_auxiliar = 0;
    
    public void mover(){
        x_inicial-=2;
        x_auxiliar-=2;
            if(x_inicial==0 && x_auxiliar==-1300){
                x_inicial=1300;
                x_auxiliar=0;
            
            }
    }

    public void paint(Graphics2D g) {
        ImageIcon fondo = new ImageIcon(getClass().getResource("/NoInternetGame/fondoGame.png"));
        g.drawImage(fondo.getImage(), x_inicial, y_incial, anchoFondo, altoFondo, null);
        g.drawImage(fondo.getImage(), x_auxiliar, y_auxiliar, anchoFondo, altoFondo, null);
    }

    public Fondo(Juego juego) {
        this.juego = juego;
    }

}

package NoInternetGame;

import java.lang.System.Logger;
import java.util.logging.Level;
import javax.swing.JFrame;

public class Principal {
    public static void main(String[]args){
        JFrame ventana = new JFrame("JuegoDelDinosaurio");
        Juego juego = new Juego();
        ventana.add(juego);
        ventana.setSize(1300, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        while(true)
        {
            try {
                juego.repaint();
                
                
                Thread.sleep(10);
            } catch (InterruptedException ex) {
                java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}

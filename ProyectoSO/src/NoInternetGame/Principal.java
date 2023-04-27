package NoInternetGame;

import Principal.MenuPrincipal;
import java.lang.System.Logger;
import java.util.logging.Level;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Principal {

    public static int reiniciarJuego = -1;

    public static void main(String[] args) {

        JOptionPane.showMessageDialog(null, "Esta listo?");
        JFrame ventana = new JFrame("JuegoDelDinosaurio");
        Juego juego = new Juego();
        ventana.add(juego);
        ventana.setSize(1300, 600);
        ventana.setLocationRelativeTo(null);
        ventana.setVisible(true);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        int opc=0;
        do{

            if (juego.juegoFinalizado) {
                reiniciarJuego = JOptionPane.showConfirmDialog(null, "Has perdido< Desea reinicar?", "Has perdido", JOptionPane.YES_NO_OPTION);
                if (reiniciarJuego == 0) {
                    reiniciarValores();
                } else if (reiniciarJuego == 1) {
                    opc=1;
                    MenuPrincipal menuP = new MenuPrincipal();
                    menuP.setVisible(true);
                    ventana.dispose();

                }
            } else {
                try {
                    juego.repaint();

                    Thread.sleep(10);
                } catch (InterruptedException ex) {
                    java.util.logging.Logger.getLogger(Principal.class.getName()).log(Level.SEVERE, null, ex);
                }

                if (juego.pierdeVida == true) {
                    JOptionPane.showMessageDialog(null, "Cuidado");
                    Juego.pierdeVida = false;
                    Juego.vidas--;
                    Dinosaurio.y_inicial = 400;
                    Dinosaurio.saltando = false;
                    Cactus.x_inicial = 1300;
                }
            }

        }while(opc!=1);
    }

    public static void reiniciarValores() {

        Juego.juegoFinalizado = false;
        Cactus.x_auxiliar = -4;
        Juego.puntos = 0;
        Juego.nivel = 0;
        Juego.vidas = 3;
        reiniciarJuego = -1;
        Cactus.x_inicial = 1300;

    }

}

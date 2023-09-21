
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alberto
 */
public class Main {

    public static void main(String[] args) throws InterruptedException {
        VariableCompartida vc = new VariableCompartida(0);
        

        new Thread() {
            @Override
            public void run() {
                for (int i = 0; i < 100; i++) {
                    try {
                        vc.pedirEscribir();
                        vc.setV(vc.getV() + 1);
                        vc.dejarLeer();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();

        new Thread() {
            @Override
            public void run() {
                vc.dejarEscribir();
                for (int i = 0; i < 100; i++) {
                    try {
                        vc.pedirLeer();
                        System.out.println(vc.getV());
                        vc.dejarEscribir();
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
            }
        }.start();
    }
}


import java.util.concurrent.Semaphore;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Alberto
 */
public class VariableCompartida {

    private int v;
    private Semaphore semaforo1 = new Semaphore(0);
    private Semaphore semaforo2 = new Semaphore(0);
            

    public VariableCompartida(int v) {
        this.v = v;
    }

    public int getV() {
        return v;
    }

    public void setV(int v) {
        this.v = v;
    }

    public void inc() {
        this.v++;
    }
    
    public void pedirLeer() throws InterruptedException{
        semaforo1.acquire();
    }
    
    public void dejarLeer(){
        semaforo1.release();
    }
    
    public void pedirEscribir() throws InterruptedException{
        semaforo2.acquire();
    }
    
    public void dejarEscribir(){
        semaforo2.release();
    }
}

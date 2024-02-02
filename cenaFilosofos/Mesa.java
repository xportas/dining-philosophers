package cenaFilosofos;

import java.util.concurrent.Semaphore;

public class Mesa {

private Semaphore[] tenedores; //array de semáforos a modo de tenedores
    
    public Mesa() {
        tenedores = new Semaphore[5];
        for (int i = 0; i < 5; i++) {
            tenedores[i] = new Semaphore(1); // instanciamos los semáforos
        }
    }
    
    /*
     * Método que permite comer o poner en espera a un filosofo
     */
    public void cogerTenedores(int filosofo){
        try {
        	tenedores[filosofo].acquire(); // Intentar coger tenedor izquierdo
            tenedores[(filosofo + 1) % tenedores.length].acquire(); // Intentar coger tenedor derecho
		} catch (Exception e) {}
    }
    
    /*
     * Método que libera los tenedores
     */
    public void dejarTenedores(int filosofo) {
        tenedores[filosofo].release(); // Liberar el tenedor izquierdo
        tenedores[(filosofo + 1) % tenedores.length].release(); // Liberar el tenedor derecho
    }
}
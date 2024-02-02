package cenaFilosofos;

public class Filosofo extends Thread {
    
	private Mesa mesa;
    private int filosofo;
    
    public Filosofo(Mesa m, int filosofo) {
        this.mesa = m;
        this.filosofo = filosofo;
    }
    
    public void run() {
        while (true) {
            this.pensando();
            try {
                mesa.cogerTenedores(filosofo);
                this.comiendo();
                int filosofoControlado = filosofo+1;
                if (filosofo == 5) { filosofoControlado = 0;}
                System.out.println("Filosofo " + filosofo + " deja de comer, libera tenedores " + filosofo + " y " + filosofoControlado);
                mesa.dejarTenedores(filosofo);
            } catch (Exception e) {}
        }
    }
    
    /*
     * Método que hace al filósofo pensar un tiempo aleatorio
     */
    public void pensando() {
        System.out.println("Filosofo " + filosofo + " está pensando.");
        try {
            sleep((long) (Math.random() * 3000 + 1000));
        } catch (InterruptedException e) {}
    }
    
    /*
     * Método que hace comer al filósofo y tarda un tiempo aleatorio
     */
    public void comiendo() {
        System.out.println("Filosofo " + filosofo + " está comiendo.");
        try {
            sleep((long) (Math.random() * 3000 + 1000));
        } catch (InterruptedException e) {}
    }
}
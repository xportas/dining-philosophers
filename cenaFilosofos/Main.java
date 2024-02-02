package cenaFilosofos;

public class Main {
    
    public static void main(String[] args) {
        Mesa mesa = new Mesa();
        for (int i = 1; i <= 5; i++) {
            Filosofo f = new Filosofo(mesa, i);
            f.start();
        }
    }
}
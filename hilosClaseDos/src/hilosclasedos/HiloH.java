/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hilosclasedos;

/**
 *
 * @author Cassandra
 */
public class HiloH extends Thread {

    @Override
    public void run() {

        try {
            for (int i = 0; i < 5; i++) {
                System.out.print("H");
                Thread.sleep(1000);
            }

        } catch (InterruptedException ex) {
            System.out.println("Error en H: " + ex.getMessage());
        }
    }
}

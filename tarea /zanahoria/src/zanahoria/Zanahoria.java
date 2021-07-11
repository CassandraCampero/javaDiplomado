/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zanahoria;

/**
 *
 * @author indra
 */
public class Zanahoria extends Thread {

    javax.swing.JLabel principalLabel;
    String mensaje[] = new String[5];
    int x = 0, n = 0;

    public Zanahoria(javax.swing.JLabel principalLabel) {
        this.principalLabel = principalLabel;
    }

    @Override
    public void run() {
        mensaje[0] = "¡Hola ";
        mensaje[1] = "chicos ";
        mensaje[2] = "¿Como ";
        mensaje[3] = "estan?, ";
        mensaje[4] = "Bienvenidos!.";

        while (x == 0) {
            if (n < 5) {
                principalLabel.setText(mensaje[n]);
                try {
                    sleep(1000);
                } catch (Exception e) {
                    System.out.println("Error " + e);
                }
                
                n++;
            }else{
                n = 0;
            }
        }
    }
}


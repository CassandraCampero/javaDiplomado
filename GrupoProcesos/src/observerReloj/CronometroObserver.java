/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerReloj;

import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author indra
 */
public class CronometroObserver extends Observable implements Runnable {

    private int hh, mm, ss;

    public CronometroObserver(int h, int m, int s) {
        this.hh = h;
        this.mm = m;
        this.ss = s;
    }

    @Override
    public void run() {

        String time;
        while (true) {
            time = "";
            //horas
            if (hh < 10) {
                time += "0" + hh;
            } else {
                time += hh;
            }

            time += ":";

            //minutos
            if (mm < 10) {
                time += "0" + mm;
            } else {
                time += mm;
            }

            time += ":";

            //segundos
            if (ss < 10) {
                time += "0" + ss;
            } else {
                time += ss;
            }

            ss++;

            if (ss == 60) {
                mm++;
                ss = 0;
                if (mm == 60) {
                    hh++;
                    mm = 0;
                    ss = 0;
                    if (hh == 24) {
                        hh = 0;
                        mm = 0;
                        ss = 0;
                    }
                }

            }
            
            try{
                Thread.sleep(2000);
            }catch(InterruptedException ex){System.out.println("Error en observer: " + ex); }

            this.setChanged();
            this.notifyObservers(time);
            this.clearChanged();
        }

    }

}

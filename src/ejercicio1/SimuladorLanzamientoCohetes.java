package ejercicio1;

import java.util.Timer;
import java.util.TimerTask;

public class SimuladorLanzamientoCohetes {
    public static void main(String[] args) {
        cuentaAtrasLanzamineto();
    }

    static void cuentaAtrasLanzamineto() {
        Timer timer = new Timer();
        final int[] segundos = {10};

        TimerTask tarea = new TimerTask() {
            @Override
            public void run() {
                if (segundos[0] > 0) {
                    System.out.println("Cuenta atrás: " + segundos[0]);
                    segundos[0]--;
                } else {
                    timer.cancel(); //Detiene el timer al llegar a cero
                    System.out.println("¡Despegue!");
                }
            }
        };

        //Programar la tarea para que se ejecute cada segundo
        timer.scheduleAtFixedRate(tarea, 0, 1000);
    }
}
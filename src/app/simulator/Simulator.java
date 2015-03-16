package app.simulator;

import app.services.SimulatorService;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Thomas on 04/03/15.
 */
public class Simulator implements SimulatorService {
    private Timer simuTimer;
    private int i = 0;

    public void init() {
        simuTimer = new Timer();

    }

    public void start() {

        simuTimer.schedule(
            new TimerTask() {
                @Override
                public void run() {
                    // do this
//                    System.out.println("Blabla " + i);
                    i++;
                }
            },
        0,1000);
    }

    public void stop() {
        simuTimer.cancel();
    }
}

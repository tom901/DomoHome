package app.algorithm;

import app.data.Dimension;
import app.services.BrainCharacterService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;

import java.util.Random;

/**
 * Created by Nicolas on 17/03/2015.
 */
public class BrainCharacterDirige implements BrainCharacterService, RequireSimulatorService {

    private SimulatorService simulator;
    private Random randomMove;
    private int compteur,i;
    private boolean steps[];

    public BrainCharacterDirige() {
        //simulator = new Simulator();
        randomMove = new Random();
        i = 0;
    }

    @Override
    public void activation() {
        compteur = 0;
        i = 0;
    }

    @Override
    public void step() {
        if (simulator.hasArrived()) {
            i++;
            simulator.setHasArrived(false);
        }
        if (i == 0) {
            simulator.setGoTo(new Dimension(15, 210));
        } else if (i == 1) {
            simulator.setGoTo(new Dimension(340,210));
        } else if (i == 2) {
            simulator.setGoTo(new Dimension(340,12));
        } else if (i == 3) {
            simulator.setGoTo(new Dimension(310,250));
        } else if (i == 4) {
            simulator.setGoTo(new Dimension(310,140));
        } else if (i == 5) {
            simulator.setGoTo(new Dimension(50,65));
        } else if (i == 6) {
            simulator.setGoTo(new Dimension(340,65));
        } else if (i == 7) {
            simulator.setGoTo(new Dimension(340,12));
        } else if (i == 8) {
            simulator.setGoTo(new Dimension(400,210));
        } else if (i == 9) {
            simulator.setGoTo(new Dimension(340,12));
        } else if (i == 10) {
            simulator.setGoTo(new Dimension(340,55));
        } else if (i == 11) {
            simulator.setGoTo(new Dimension(370,55));
        } else if (i == 12) {
            simulator.setGoTo(new Dimension(370,12));
        } else if (i == 13) {
            simulator.setGoTo(new Dimension(340,210));
        } else if (i == 14) {
            simulator.setGoTo(new Dimension(10,210));
        }
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}

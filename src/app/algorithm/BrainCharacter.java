package app.algorithm;

import app.data.Dimension;
import app.services.BrainService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;
import app.simulator.Simulator;

import java.util.Random;

/**
 * Created by Nicolas on 17/03/2015.
 */
public class BrainCharacter implements BrainService, RequireSimulatorService {

    private SimulatorService simulator;
    private Random randomMove;

    @Override
    public void init() {
        simulator = new Simulator();

        randomMove = new Random();
    }

    @Override
    public void activation() {

    }

    @Override
    public void step() {
        switch (randomMove.nextInt(4)) {
            case 0: // Move left
                simulator.setCharacterMove(0);
                break;
            case 1: // Move right
                simulator.setCharacterMove(1);
                break;
            case 2: // Move up
                simulator.setCharacterMove(2);
                break;
            case 3: // Move bottom
                simulator.setCharacterMove(3);
                break;
        }
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}

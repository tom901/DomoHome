package app.algorithm;

import app.services.BrainCharacterService;
import app.services.RequireSimulatorService;
import app.services.SimulatorService;

import java.util.Random;

/**
 * Created by Nicolas on 17/03/2015.
 */
public class BrainCharacter implements BrainCharacterService, RequireSimulatorService {

    private SimulatorService simulator;
    private Random randomMove;
    private int compteur;

    public BrainCharacter() {
        //simulator = new Simulator();
        randomMove = new Random();
    }

    @Override
    public void activation() {
        compteur = 0;
    }

    @Override
    public void step() {
        simulator.setRoomCharacterIsIn();
        compteur++;
        if (compteur < 500) {
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
        } else {
            simulator.setInTransition(true);
            simulator.setPositionToGoTo();

        }
    }

    @Override
    public void bindSimulatorService(SimulatorService service) {
        simulator = service;
    }
}

package app.simulator;

import app.data.Data;
import app.data.Dimension;
import app.services.*;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 * Created by Thomas on 04/03/15.
 */
public class Simulator implements SimulatorService, RequireDataService, RequireBrainService {
    private Timer simuTimer;
    private DataService data;
    private BrainService brainService;
    private int i = 0;
    private int direction;

    /**
     * Method to init the attributes of the engine / simulator.
     */
    public void init() {
        simuTimer = new Timer();
        direction = -1;

        data.setCharacterPosition(new Dimension(10, 200));

    }

    @Override
    public void bindBrainService(BrainService service) {
        brainService = service;
    }

    /**
     * Method to start the process of the engine.
     */
    public void start() {

        simuTimer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        // do this
                        i++;
//                      moveCharacter();
                        brainService.step();
                        switch (direction) {
                            case 0: // Move left
                                data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX() + 1, data.getCharacterPosition().getY()));
                                break;
                            case 1: // Move right
                                data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX() + 1, data.getCharacterPosition().getY()));
                                break;
                            case 2: // Move up
                                data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() - 1));
                                break;
                            case 3: // Move bottom
                                data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() + 1));
                                break;
                            default:
                                data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX() + 1, data.getCharacterPosition().getY()));
                                break;
                        }
                        direction = -1;
                        //System.out.println("Character X : " + data.getCharacterPosition().getX() + " - Character Y : " + data.getCharacterPosition().getY());
                    }
                },
                0, 10);
    }

    /**
     * Method to stop the process of the engine / simulator
     */
    public void stop() {
        simuTimer.cancel();
    }

    public void moveCharacterToTheLeft() {
       // character.setPosition(new Dimension(character.getPosition().getX()-1,character.getPosition().getY()));
    }

    /**
     * Method to make a character move towards a direction.
     * @param direc
     */
    public void setCharacterMove(int direc) {
        direction = direc;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

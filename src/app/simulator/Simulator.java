package app.simulator;

import app.data.Dimension;
import app.services.CharacterService;
import app.services.RequireCharacterService;
import app.services.SimulatorService;

import java.util.Timer;
import java.util.TimerTask;
import java.util.Random;

/**
 * Created by Thomas on 04/03/15.
 */
public class Simulator implements SimulatorService, RequireCharacterService {
    private Timer simuTimer;
    private CharacterService character;
    private int i = 0;

    /**
     * Method to init the attributes of the engine / simulator.
     */
    public void init() {
        simuTimer = new Timer();
        character.setPosition(new Dimension(0,0));

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
//                    moveCharacter();
                    System.out.println("Character X : " + character.getPosition().getX() + " - Character Y : " + character.getPosition().getX());
                }
            },
        0,100);
    }

    /**
     * Method to stop the process of the engine / simulator
     */
    public void stop() {
        simuTimer.cancel();
    }

    public void moveCharacterToTheLeft() {
        character.setPosition(new Dimension(character.getPosition().getX()-1,character.getPosition().getY()));

    }

    /**
     * Method to bind the character service to the class.
     * @param service
     */
    @Override
    public void bindCharacterService(CharacterService service) {
        character = service;
    }

    /**
     * Method to make a character move towards a direction.
     * @param direction
     */
    public void setCharacterMove(int direction) {
        switch (direction) {
            case 0: // Move left
                character.setPosition(new Dimension(character.getPosition().getX()-1,character.getPosition().getY()));
                break;
            case 1: // Move right
                character.setPosition(new Dimension(character.getPosition().getX()+1,character.getPosition().getY()));
                break;
            case 2: // Move up
                character.setPosition(new Dimension(character.getPosition().getX(),character.getPosition().getY()-1));
                break;
            case 3: // Move bottom
                character.setPosition(new Dimension(character.getPosition().getX(),character.getPosition().getY()+1));
                break;
        }
    }
}

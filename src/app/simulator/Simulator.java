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
    private Random randomMove;

    public void init() {
        simuTimer = new Timer();
        character.setPosition(new Dimension(0,0));
        randomMove = new Random();
    }

    public void start() {

        simuTimer.schedule(
            new TimerTask() {
                @Override
                public void run() {
                    // do this
//                    System.out.println("Blabla " + i);
                    i++;
                    moveCharacter();
//                    System.out.println("Character X : " + character.getPosition().getX() + " - Character Y : " + character.getPosition().getX());
                }
            },
        0,1000);
    }

    public void stop() {
        simuTimer.cancel();
    }

    public void moveCharacterToTheLeft() {
        character.setPosition(new Dimension(character.getPosition().getX()-1,character.getPosition().getY()));

    }

    @Override
    public void bindCharacterService(CharacterService service) {
        character = service;
    }

    public void moveCharacter() {

        switch (randomMove.nextInt(4)) {
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

package app.simulator;

import app.common.ParamDisplay;
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
                        checkCollision();
                        //System.out.println("Character X : " + data.getCharacterPosition().getX() + " - Character Y : " + data.getCharacterPosition().getY());
                    }
                },
                0, 10);
    }

    /**
     * Method to destroy the process of the engine / simulator
     */
    public void destroy() {
        simuTimer.cancel(); simuTimer.purge();
    }

    public void pause() { simuTimer.cancel(); simuTimer = new Timer(); }

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

    private void checkCollision() {

        switch (direction) {
            case 0: // Move left
//                moveLeft();
                moveRight();
                break;
            case 1: // Move right
                moveRight();
                break;
            case 2: // Move up
                moveUp();
                break;
            case 3: // Move bottom
                moveDown();
                break;
            default:
                moveRight();
                break;
        }
        direction = -1;
    }

    private void moveLeft() {
        if (data.getCharacterPosition().getX() > ParamDisplay.MAIN_FLOOR_DISPLAYED_X)
            data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX() - 1, data.getCharacterPosition().getY()));

    }

    private void moveRight() {
        if (data.getCharacterPosition().getX() + ParamDisplay.CHARACTER_WIDTH < ParamDisplay.MAIN_FLOOR_DISPLAYED_X + ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH)
            data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX() + 1, data.getCharacterPosition().getY()));

    }

    private void moveUp() {
        if (data.getCharacterPosition().getY() < ParamDisplay.MAIN_FLOOR_DISPLAYED_Y)
            data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() - 1));

    }

    private void moveDown() {
        if (data.getCharacterPosition().getY() + ParamDisplay.CHARACTER_HEIGHT < ParamDisplay.MAIN_FLOOR_DISPLAYED_Y + ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
            data.setCharacterPosition(new Dimension(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() + 1));

    }


}

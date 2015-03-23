package app.simulator;

import app.common.ParamDisplay;
import app.common.RoomsEnum;
import app.data.Dimension;
import app.data.home.Room;
import app.data.object.Door;
import app.data.object.ObjectHome;
import app.services.*;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Thomas on 04/03/15.
 */
public class Simulator implements SimulatorService, RequireDataService, RequireBrainCharacterService, RequireBrainHomeService {
    private Timer simuTimer;
    private DataService data;
    private Dimension dimNotToExceed, positionToGoTo;
    private BrainCharacterService brainCharacterService;
    private BrainHomeService brainHomeService;
    private Door doorToCross;
    private int i;
    private int direction;
    private boolean inTransition;

    /**
     * Method to getPanel the attributes of the engine / simulator.
     */
    public void init() {
        inTransition = false;
        simuTimer = new Timer();
        direction = -1;
        i = 0;
        dimNotToExceed = new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT);
        data.setCharacterPosition(10, 200);

        brainHomeService.activation();
        brainCharacterService.activation();

    }

    @Override
    public void bindBrainCharacterService(BrainCharacterService service) {
        brainCharacterService = service;
    }

    @Override
    public void bindBrainHomeService(BrainHomeService service) {
        brainHomeService = service;
    }

    /**
     * Method to start the process of the engine.
     */
    public void start() {
        brainCharacterService.activation();
        simuTimer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        // do this
                        i++;
//                      moveCharacter();
                        brainCharacterService.step();
                        data.setObjectsOff();
                        brainHomeService.step();
                        if (!inTransition) {
                            if (direction != -1) {
                                checkCollision();
                            }
                        } else {
                            goToPosition();
                        }
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
                moveLeft();
//                moveRight();
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
        if (data.getCharacterPosition().getX() > dimNotToExceed.getX()) {
            data.setCharacterPosition(data.getCharacterPosition().getX() - 1, data.getCharacterPosition().getY());
        }
    }

    private void moveRight() {
        if (data.getCharacterPosition().getX() + ParamDisplay.CHARACTER_WIDTH < dimNotToExceed.getX() + dimNotToExceed.getWidth()) {
            data.setCharacterPosition((data.getCharacterPosition().getX() + 1), data.getCharacterPosition().getY());
        }
    }

    private void moveUp() {
        if (data.getCharacterPosition().getY() > dimNotToExceed.getY()) {
            data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() - 1);
        }
    }

    private void moveDown() {
        if (data.getCharacterPosition().getY() + ParamDisplay.CHARACTER_HEIGHT < dimNotToExceed.getY() + dimNotToExceed.getHeight()) {
            data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() + 1);
        }
    }

    public boolean getPresence() {
        return (!data.getPresence().isEmpty());
    }

    public void setRoomCharacterIsIn() {
        ArrayList<Room> roomIn = data.getPresence();
        if (roomIn.size() == 1) {
            dimNotToExceed = roomIn.get(0).getPosition();
        }
    }

    @Override
    public void setObjectsOn() {
        data.setObjectsOn();
    }

    @Override
    public void setObjectsOn(int roomID) {
        data.setObjectsOn(roomID);
    }

    @Override
    public void getObjectsDoors(int floorNo) {
        data.getObjectsDoors(floorNo);
    }

    public void setInTransition(boolean inTransition) {
        this.inTransition = inTransition;
    }

    @Override
    public void setPositionToGoTo() {
        ArrayList<Room> roomIn = data.getPresence();
        if (roomIn.size() == 1) {
            if (roomIn.get(0).getRoomName().equals(RoomsEnum.ROOM.GARDEN_1)) {
                for(ObjectHome door : data.getFloors().get(0).getSpecificRoom(2).getObjectHomes()) {
                    if (door instanceof Door) {
                        doorToCross = (Door)door;
                        this.positionToGoTo = ((Door) door).getDimension();
                    }
                }
            } else {
                for (ObjectHome door : roomIn.get(0).getObjectHomes()) {
                    if (door instanceof Door) {
                        doorToCross = (Door)door;
                        this.positionToGoTo = ((Door) door).getDimension();
                    }
                }
            }
        }
    }

    public void goToPosition() {
        int moveX = 0, moveY = 0;
        if (doorToCross.)
        if ((data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() / 2) < (positionToGoTo.getX() + positionToGoTo.getWidth() / 2)) {
            moveX++;
        } else if ((data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() / 2) > (positionToGoTo.getX() + positionToGoTo.getWidth() / 2)) {
            moveX--;
        }
        if ((data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() / 2) > (positionToGoTo.getY() + positionToGoTo.getHeight() / 2)) {
            moveY--;
        } else if ((data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() / 2) < (positionToGoTo.getY() + positionToGoTo.getHeight() / 2)) {
            moveY++;
        }
        data.setCharacterPosition(data.getCharacterPosition().getX()+moveX,data.getCharacterPosition().getY()+moveY);
    }
}

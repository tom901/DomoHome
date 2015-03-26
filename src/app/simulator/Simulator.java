/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: engine/Engine.java 2015-03-11 buixuan.
 * Modified 2015/03/26 by :
 * - nicolas.didier.fd@gmail.com
 * - leslie.cha@hotmail.fr
 * - thomas.paraison@me.com
 * ******************************************************/
package app.simulator;

import app.common.ParamDisplay;
import app.data.Dimension;
import app.display.HandlerAudio;
import app.services.*;

import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by Thomas on 04/03/15.
 */
public class Simulator implements SimulatorService, RequireDataService, RequireBrainService {
    private Timer simuTimer;
    protected DataService data;
    protected Dimension dimNotToExceed, positionToGoTo, dimToGoTo;
    protected BrainService brainCharacterService;
    protected BrainService brainHomeService;
//    private Door doorToCross;
    protected int direction;
    private boolean inTransition, brainDirige, hasArrived;
    private boolean isPositioned, finishCrossing, doorIsOnTheRightOrAtBottom;

    public Simulator() {}

    /**
     * Method to getPanel the attributes of the engine / simulator.
     */
    public void init() {
        inTransition = false;
        isPositioned = false;
        finishCrossing = false;
        doorIsOnTheRightOrAtBottom = false;
        hasArrived = false;
        simuTimer = new Timer();
        direction = -1;
        dimNotToExceed = new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y, ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT);
        dimToGoTo = new Dimension(10, 200);
        data.setCharacterPosition(10, 200);

        brainHomeService.activation();
        brainCharacterService.activation();

    }

    @Override
    public void bindBrainCharacterService(BrainService service) {
        brainCharacterService = service;
    }

    @Override
    public void bindBrainHomeService(BrainService service) {
        brainHomeService = service;
    }

    /**
     * Method to start the process of the engine.
     */
    public void start() {
        //brainCharacterService.activation();
        simuTimer.schedule(
                new TimerTask() {
                    @Override
                    public void run() {
                        // do this
                        int objectsOn = data.getObjectsOn();

                        brainCharacterService.step();
                        data.setObjectsOff();
                        brainHomeService.step();
                        if (!inTransition) {
                            if (brainDirige) {
                                goToDirige();
                            } else {
                                checkCollision();
                            }
                        }

                        if (data.getObjectsOn() < objectsOn) {
                            HandlerAudio.playSongObjectsOn();
                        } else if (data.getObjectsOn() > objectsOn) {
                            HandlerAudio.playSongObjectsOff();
                        }
                    }
                },
                0, 10);
    }

    /**
     * Method to destroy the process of the engine / simulator
     */
    public void destroy() {
        simuTimer.cancel();
        simuTimer.purge();
    }

    public void pause() {
        simuTimer.cancel();
        simuTimer = new Timer();
    }

    /**
     * Method to make a character move towards a direction.
     *
     * @param direc
     */
    public void setCharacterMove(int direc) {
        direction = direc;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }

    public void checkCollision() {
        switch (direction) {
            case 0: // Move left
                moveLeft();
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
//                moveRight();
                break;
        }
        direction = -1;
    }

    public void moveLeft() {
        if (data.getCharacterPosition().getX() >
                dimNotToExceed.getX()) {
            data.setCharacterPosition(data.getCharacterPosition().getX() - 1, data.getCharacterPosition().getY());
        }
    }

    public void moveRight() {
        if (data.getCharacterPosition().getX() + ParamDisplay.CHARACTER_WIDTH < dimNotToExceed.getX() + dimNotToExceed.getWidth()) {
            data.setCharacterPosition((data.getCharacterPosition().getX() + 1), data.getCharacterPosition().getY());
        }
    }

    public void moveUp() {
        if (data.getCharacterPosition().getY() > dimNotToExceed.getY()) {
            data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() - 1);
        }
    }

    public void moveDown() {
        if (data.getCharacterPosition().getY() + ParamDisplay.CHARACTER_HEIGHT < dimNotToExceed.getY() + dimNotToExceed.getHeight()) {
            data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() + 1);
        }
    }

    /**
     * Method to return a boolean if a presence is detected in either one room.
     * @return presence
     */
    public boolean getPresence() {
        return (!data.getPresence().isEmpty());
    }

    /**
     * Method to set objects ON.
     */
    @Override
    public void setObjectsOn() {
        data.setObjectsOn();
    }

    /**
     * Method to set objects OFF.
     */
    @Override
    public void setObjectsOn(int roomID) {
        data.setObjectsOn(roomID);
    }

    /** Methods to move the character to a given position (for the demonstration due to a lack of time */

    public void setGoTo(Dimension position) {
        brainDirige = true;
        dimToGoTo = position;
    }

    public boolean hasArrived() {
        if (data.getCharacterPosition().getX() ==
                dimToGoTo.getX() &&
                data.getCharacterPosition().getY() ==
                        dimToGoTo.getY()) {
            hasArrived = true;
        }
        return hasArrived;
    }

    public void setHasArrived(boolean bool) {
        this.hasArrived = bool;
    }

    public void goToDirige() {
        int moveX = 0, moveY = 0;
        if (data.getCharacterPosition().getX() > dimToGoTo.getX()) {
            moveX--;
        } else if (data.getCharacterPosition().getX() < dimToGoTo.getX()) {
            moveX++;
        }
        if (data.getCharacterPosition().getY() > dimToGoTo.getY()) {
            moveY--;
        } else if (data.getCharacterPosition().getY() < dimToGoTo.getY()) {
            moveY++;
        }
        if (moveX ==  1 && moveY == 1 || moveX == -1 && moveY == -1) {
            data.setCharacterOrientation(45);
        } else if (moveX == 1 && moveY == -1 || moveX == -1 && moveY == 1) {
            data.setCharacterOrientation(135);
        }else if (moveY != 0) {
            data.setCharacterOrientation(90);
        } else if (moveX != 0) {
            data.setCharacterOrientation(0);
        }
        data.setCharacterPosition(data.getCharacterPosition().getX() + moveX, data.getCharacterPosition().getY() + moveY);
    }

    public void setCharacterOrientation(int orientation) {
        data.setCharacterOrientation(orientation);
    }

    /** Methods to get the character to move in a room then go through a door a do so again */
    /** Work In Progress / TO BE FIXED */
/*
    public void setInTransition(boolean inTransition) {
        this.inTransition = inTransition;
    }

    @Override
    public void setPositionToGoTo() {
        ArrayList<Room> roomIn = data.getPresence();
        if (roomIn.size() == 1) {
            if (roomIn.get(0).getRoomName().equals(RoomsEnum.ROOM.GARDEN_1)) {
                for (ObjectHome door : data.getFloors().get(0).getSpecificRoom(2).getObjectHomes()) {
                    if (door instanceof Door) {
                        doorToCross = (Door) door;
                        checkWhereDoorIs(doorToCross);
                        this.positionToGoTo = ((Door) door).getDimension();

                    }
                }
            } else if (roomIn.get(0).getRoomName().equals(RoomsEnum.ROOM.ENTREE_1)) {
//                Random rand = new Random();
//                switch ()
            } else {
                for (ObjectHome door : roomIn.get(0).getObjectHomes()) {
                    if (door instanceof Door) {
                        doorToCross = (Door) door;
                        checkWhereDoorIs(doorToCross);
                        this.positionToGoTo = ((Door) door).getDimension();
                    }
                }
            }
        }

    }

    public void goToPosition() {
        int moveX = 0, moveY = 0;
        if (doorToCross.isLandscape()) {
            if ((data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() / 2) < (positionToGoTo.getX() + ParamHome.DOOR_WIDTH_LANDSCAPE / 2)) {
                moveX++;
            } else if ((data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() / 2) > (positionToGoTo.getX() + ParamHome.DOOR_WIDTH_LANDSCAPE / 2)) {
                moveX--;
            }
            if (data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() < positionToGoTo.getY()) {
                moveY++;
            } else if (data.getCharacterPosition().getY() > positionToGoTo.getY() + ParamHome.DOOR_HEIGHT_LANDSCAPE) {
                moveY--;
            }
        } else {
            if (data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() < positionToGoTo.getX()) {
                moveX++;
            } else if (data.getCharacterPosition().getX() > positionToGoTo.getX() + ParamHome.DOOR_WIDTH_PORTRAIT) {
                moveX--;
            }
            if ((data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() / 2) > (positionToGoTo.getY() + ParamHome.DOOR_HEIGHT_PORTRAIT / 2)) {
                moveY--;
            } else if ((data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() / 2) < (positionToGoTo.getY() + ParamHome.DOOR_HEIGHT_PORTRAIT / 2)) {
                moveY++;
            }

        }
        if (moveX == 0 && moveY == 0) {
            isPositioned = true;
        } else {
            data.setCharacterPosition(data.getCharacterPosition().getX() + moveX, data.getCharacterPosition().getY() + moveY);
        }
    }

    public void crossTheDoor() {
        if (doorToCross.isLandscape()) {
            if (doorIsOnTheRightOrAtBottom) {
                if (data.getCharacterPosition().getY() < doorToCross.getDimension().getY() + ParamHome.DOOR_HEIGHT_LANDSCAPE) {
                    data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() + 1);
                } else {
                    finishCrossing = true;
                }
            } else {
                if (data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() > doorToCross.getDimension().getY()) {
                    data.setCharacterPosition(data.getCharacterPosition().getX(), data.getCharacterPosition().getY() - 1);
                } else {
                    finishCrossing = true;
                }
            }
        } else {
            if (doorIsOnTheRightOrAtBottom) {
//                System.out.println("Perso X : " + data.getCharacterPosition().getX() + " - DoorWidth: " + (doorToCross.getDimension().getX() + ParamHome.DOOR_WIDTH_PORTRAIT));
                if (data.getCharacterPosition().getX() < (doorToCross.getDimension().getX() + ParamHome.DOOR_WIDTH_PORTRAIT)) {
                    data.setCharacterPosition(data.getCharacterPosition().getX() + 1, data.getCharacterPosition().getY());
                } else {
                    finishCrossing = true;
                }
            } else {
                if (data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() > doorToCross.getDimension().getX()) {
                    data.setCharacterPosition(data.getCharacterPosition().getX() - 1, data.getCharacterPosition().getY());
                } else {
                    finishCrossing = true;
                }
            }
        }
        System.out.println("FinishCross : " + finishCrossing);
    }

    public void checkWhereDoorIs(Door door) {
        if (door.isLandscape()) {
            if (data.getCharacterPosition().getY() > door.getDimension().getY() || data.getCharacterPosition().getY() + data.getCharacterPosition().getHeight() > door.getDimension().getY()) {
                doorIsOnTheRightOrAtBottom = false;
            } else {
                doorIsOnTheRightOrAtBottom = true;
            }
        } else {
            if (data.getCharacterPosition().getX() < door.getDimension().getX() || data.getCharacterPosition().getX() + data.getCharacterPosition().getWidth() < door.getDimension().getX()) {
                doorIsOnTheRightOrAtBottom = true;
            } else {
                doorIsOnTheRightOrAtBottom = false;
            }
        }
    }

    public void setRoomCharacterIsIn() {
        ArrayList<Room> roomIn = data.getPresence();
        if (roomIn.size() == 1) {
            dimNotToExceed = roomIn.get(0).getPosition();
        }
    }


    public boolean isInTransition() {
        return inTransition;
    }

    public boolean isFinishCrossing() {
        return finishCrossing;
    }
*/

}

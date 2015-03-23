package app.services;

import app.data.Dimension;
import app.data.home.Room;

import java.util.ArrayList;

/**
 * Created by Nicolas on 13/03/2015.
 */
public interface SimulatorService {
    public void init();
    public void start();
    public void destroy();
    public void setCharacterMove(int direction);
    public void pause();
    public boolean getPresence();
    public void setObjectsOn();
    public void setObjectsOn(int RoomID);
    public void getObjectsDoors(int floorNo);
    public void setRoomCharacterIsIn();
    public void setPositionToGoTo();
    public void setInTransition(boolean inTransition);
    public boolean isInTransition();
    public boolean isFinishCrossing();
    public boolean hasArrived();
    public void setGoTo(Dimension position);
    public void setHasArrived(boolean bool);
}

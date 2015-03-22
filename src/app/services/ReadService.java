package app.services;

import app.data.Dimension;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.ObjectHome;

import java.util.ArrayList;

/**
 * Created by Nicolas on 16/03/2015.
 */
public interface ReadService {
    public void init();
    public ArrayList<Room> getRooms();
    public ArrayList<ArrayList<Room>> getMainFloor(int floorNo);
    public Dimension getCharacterPosition();
    public ArrayList<Floor> getFloors();
    public ArrayList<ObjectHome> getObjectHomes(int floorNo);
    public ArrayList<Room> getPresence();
}

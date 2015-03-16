package app.services;

import app.data.home.Room;

import java.util.ArrayList;

/**
 * Created by Nicolas on 16/03/2015.
 */
public interface ReadService {
    public void init();
    public ArrayList<Room> getRooms();
}

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
    public ArrayList<Room> getMainFloor(int floorNo);
    public Dimension getCharacterPosition();
    public ArrayList<Floor> getFloors();
    public ArrayList<ObjectHome> getObjectHomes(int floorNo);
    public ArrayList<Room> getPresence();
    public int getObjectsOn();
    public int getCharacterOrientation();
}

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
/* WIP / TO BE FIXED */
//    public void getObjectsDoors(int floorNo);
//    public void setRoomCharacterIsIn();
//    public void setPositionToGoTo();
//    public void setInTransition(boolean inTransition);
//    public boolean isInTransition();
//    public boolean isFinishCrossing();
    public boolean hasArrived();
    public void setGoTo(Dimension position);
    public void setHasArrived(boolean bool);
    public void setCharacterOrientation(int orientation);
}

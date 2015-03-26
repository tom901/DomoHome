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
package app.data.object;

import app.common.ParamHome;
import app.common.ParamSecondFloor;
import app.data.Dimension;
import javafx.scene.Group;
import junit.framework.TestCase;

public class DoorTest extends TestCase {
    Door door;

    public void testSetGroup() throws Exception {
       door = new Door();
        door.setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_DOOR_X, ParamSecondFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_Y), ParamHome.DOOR_PORTRAIT);
        TestCase.assertNotNull(door.group);
        TestCase.assertNotNull(door.groupMini);
        door.setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_DOOR_X, ParamSecondFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_Y), ParamHome.DOOR_LANDSCAPE);
        TestCase.assertNotNull(door.group);
        TestCase.assertNotNull(door.groupMini);
    }



    public void testSetLandscape() throws Exception {
        door = new Door();
        door.setLandscape(false);
        assertEquals(false,door.isLandscape());

        door.setLandscape(true);
        assertEquals(true,door.isLandscape());
    }

    public void testGetGroup() throws Exception {
        door = new Door();
        assertNotNull(door.getGroup());
    }

    public void testGetGroupMini() throws Exception {
        door = new Door();
        assertNotNull(door.getGroupMini());
    }

    public void testGetDimension() throws Exception {
        door = new Door();
        door.setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_DOOR_X, ParamSecondFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_Y), ParamHome.DOOR_PORTRAIT);
        assertNotNull(door.getDimension());

    }
}
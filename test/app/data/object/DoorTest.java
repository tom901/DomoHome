package app.data.object;

import app.common.ParamHome;
import app.common.ParamSecondFloor;
import app.data.Dimension;
import junit.framework.TestCase;

public class DoorTest extends TestCase {
    Door door;

    public void testSetGroup() throws Exception {
       door = new Door();
        door.setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_DOOR_X, ParamSecondFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_Y), ParamHome.DOOR_PORTRAIT);
        TestCase.assertNotNull(door.group);
        TestCase.assertNotNull(door.groupMini);
    }

    public void testGetDoor() throws Exception {

    }

    public void testIsLandscape() throws Exception {

    }

    public void testSetLandscape() throws Exception {

    }

    public void testGetGroup() throws Exception {

    }

    public void testGetGroupMini() throws Exception {

    }

    public void testGetDimension() throws Exception {

    }
}
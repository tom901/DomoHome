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
package app.data;

import app.common.ParamDisplay;
import app.data.home.Room;
import app.data.object.Door;
import app.data.object.ObjectHome;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import javax.naming.event.ObjectChangeListener;
import java.util.ArrayList;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DataTest extends TestCase {
    Data data;
    Character character;

    @Before
    public void setUp() throws Exception {
        data = new Data();
//        data.init();
        character = new Character(new Dimension(10,200,ParamDisplay.CHARACTER_WIDTH, ParamDisplay.CHARACTER_HEIGHT));
    }

    @Test
    public void testInit() throws Exception {
        data.init();
        assertTrue(data.floors.size() == 3 && data.rooms.size() == 11);
    }

    @Test
    public void testInitFloors() throws Exception {
        data.initFloors();
        assertTrue(data.floors.size() == 3);
    }

    @Test
    public void testInitRooms_FirstFloor() {
        data.initFloors();
        data.initRooms(0, 1);
        assertTrue(data.getRooms().size() == 1);
    }

    @Test
    public void testInitRooms_SecondFloor() {
        data.initFloors();
        data.initRooms(0, 1);
        data.initRooms(0, 1);
        assertTrue(data.getRooms().size() == 2);
    }

    @Test
    public void testInitRooms_ThirdFloor() {
        data.initFloors();
        data.initRooms(0, 1);
        data.initRooms(1,2);
        data.initRooms(2, 1);
        assertTrue(data.getRooms().size() == 4);
    }

    @Test
    public void testInitRoomsFirstFloor() {
        data.initFloors();
        data.initRooms(0, 6);
        data.initRoomsFirstFloor();
        assertNotNull(data.getFloors().get(0).getSpecificRoom(2).getRoom());
    }

    @Test
    public void testInitRoomsSecondFloor() {
        data.initFloors();
        data.initRooms(0, 6);
        data.initRooms(1, 4);
        data.initRoomsFirstFloor();
        assertNotNull(data.getFloors().get(1).getSpecificRoom(2).getRoom());

    }

    @Test
    public void testInitRoomsThirdFloor() {
        data.initFloors();
        data.initRooms(0, 6);
        data.initRooms(1, 4);
        data.initRooms(2, 1);
        data.initRoomsFirstFloor();
        assertNotNull(data.getFloors().get(2).getSpecificRoom(0).getRoom());

    }

    @Test
    public void testInitObjectHomes() throws Exception {
        data.init();
        assertEquals((data.getObjectHomes(1).size() + data.getObjectHomes(2).size() + data.getObjectHomes(3).size()), (data.getFloors().get(0).getObjectHomes().size() + data.getFloors().get(1).getObjectHomes().size() + data.getFloors().get(2).getObjectHomes().size()));
    }

    @Test
    public void testGetCharacterPosition() throws Exception {
        data.init();
        assertTrue(data.getCharacterPosition().getX() == character.getPosition().getX() && data.getCharacterPosition().getY() == character.getPosition().getY());
    }

    @Test
    public void testGetFloors() throws Exception {
        data.init();
        assertNotNull(data.getFloors());
    }

    @Test
    public void testGetRooms() throws Exception {
        data.init();
        assertTrue(!data.getRooms().isEmpty() && data.getRooms().size() == 11);
    }

    @Test
    public void testGetMainFloor_firstFloor() throws Exception {
        data.init();
        assertEquals(data.getFloors().get(0).getRooms(), data.getMainFloor(1));
    }
    @Test
    public void testGetMainFloor_secondFloor() throws Exception {
        data.init();
        assertEquals(data.getFloors().get(1).getRooms(),data.getMainFloor(2));
    }
    @Test
    public void testGetMainFloor_thirdFloor() throws Exception {
        data.init();
        assertEquals(data.getFloors().get(2).getRooms(), data.getMainFloor(3));
    }

    @Test
    public void testGetObjectHomes() throws Exception {
        data.init();
        assertTrue(data.getObjectHomes(1).equals(data.getFloors().get(0).getObjectHomes()));
    }

    @Test
    public void testSetCharacterPosition() throws Exception {
        data.init();
        Dimension position = new Dimension(45,84);
        data.setCharacterPosition(position.getX(),position.getY());
        assertTrue(data.getCharacterPosition().getX() == position.getX() && data.getCharacterPosition().getY() == position.getY());
    }

    @Test
    public void testGetPresence_01() throws Exception {
        data.init();
        data.getMainFloor(1);
        assertTrue(!data.getPresence().isEmpty());
    }

    @Test
    public void testGetPresence_02() throws Exception {
        data.init();
        data.getMainFloor(1);
        data.setCharacterPosition(340,210);
        assertTrue(!data.getPresence().isEmpty());
    }

    @Test
    public void testGetPresence_03() throws Exception {
        data.init();
        data.getMainFloor(1);
        data.setCharacterPosition(100,210);
        assertTrue(!data.getPresence().isEmpty());
    }

    @Test
    public void testSetObjectsOn() throws Exception {
        data.init();
        boolean oneObjectIsOn = false;
        data.getMainFloor(1);
        data.setCharacterPosition(300, 200);
        data.getPresence();
        data.setObjectsOn();
        for(ObjectHome ohON : data.getObjectHomes(1)) {
            if (ohON.isState()) {
                oneObjectIsOn = true;
            }
        }
        assertTrue(oneObjectIsOn);
    }

    @Test
    public void testSetObjectsOff() throws Exception {
        data.init();
        boolean allObjectsAreOff = true;
        data.getMainFloor(1);
        data.setCharacterPosition(300, 200);
        data.getPresence();
        data.setObjectsOn();
        data.setObjectsOff();
        for(ObjectHome ohON : data.getObjectHomes(1)) {
            if (!ohON.isState()) {
                allObjectsAreOff = false;
            }
        }
        assertFalse(allObjectsAreOff);
    }

    @Test
    public void testSetObjectsOnWithParameter() {
        int objectOnNo = 0;
        data.init();
        data.getMainFloor(1);
        data.setObjectsOn(1);
        for(ObjectHome oh : data.getFloors().get(0).getRooms().get(1).getObjectHomes()) {
            if (oh.isState() && !(oh instanceof Door)) {
                objectOnNo++;
            }
        }
        assertTrue(objectOnNo == 4);
    }

    @Test
    public void testGetObjectsDoors() throws Exception {
        data.init();
        Room room = data.getFloors().get(0).getRooms().get(0);
        Door door = null;
        ArrayList<ObjectHome> objHome = room.getObjectHomes();
        for(ObjectHome oh : objHome) {
            if (oh instanceof Door) {
                door = (Door)oh;
            }
        }
        assertNotNull(door);
    }

    @Test
    public void testGetObjectsOn() throws Exception {
        data.init();
        data.getFloors().get(0).getObjectHomes().get(0).setState(true);
        assertTrue(data.getObjectsOn() >= 1);
    }

    @Test
    public void testGetCharacterOrientation() throws Exception {
        data.init();
        int orientation = data.getCharacterOrientation();
        assertTrue(orientation == 0);
    }

    @Test
    public void testSetCharacterOrientation() throws Exception {
        data.init();
        data.setCharacterOrientation(45);
        assertTrue(data.getCharacterOrientation() == 45);
    }
}
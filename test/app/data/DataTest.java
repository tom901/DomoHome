package app.data;

import app.common.ParamDisplay;
import app.data.object.ObjectHome;
import junit.framework.TestCase;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

public class DataTest extends TestCase {
    Data data;
    Character character;

    @Before
    public void setUp() throws Exception {
        data = new Data();
        data.init();
        character = new Character(new Dimension(10,200,ParamDisplay.CHARACTER_WIDTH, ParamDisplay.CHARACTER_HEIGHT));
    }

    @Test
    public void testInit() throws Exception {
        assertTrue(data.floors.size() == 3 && data.rooms.size() == 11);
    }

    @Test
    public void testGetRooms() throws Exception {
        assertTrue(!data.getRooms().isEmpty() && data.getRooms().size() == 11);
    }

    @Test
    public void testGetMainFloor_firstFloor() throws Exception {
        assertEquals(data.getFloors().get(0).getRooms(), data.getMainFloor(1));
    }
    @Test
    public void testGetMainFloor_secondFloor() throws Exception {
        assertEquals(data.getFloors().get(1).getRooms(),data.getMainFloor(2));
    }
    @Test
    public void testGetMainFloor_thirdFloor() throws Exception {
        assertEquals(data.getFloors().get(2).getRooms(),data.getMainFloor(3));
    }

    @Test
    public void testInitObjectHomes() throws Exception {
        assertEquals((data.getObjectHomes(1).size() + data.getObjectHomes(2).size() + data.getObjectHomes(3).size()),(data.getFloors().get(0).getObjectHomes().size() + data.getFloors().get(1).getObjectHomes().size() + data.getFloors().get(2).getObjectHomes().size()));
    }

    @Test
    public void testGetCharacterPosition() throws Exception {
        assertTrue(data.getCharacterPosition().getX() == character.getPosition().getX() && data.getCharacterPosition().getY() == character.getPosition().getY());
    }

    @Test
    public void testGetFloors() throws Exception {
        assertNotNull(data.getFloors());
    }

    @Test
    public void testGetObjectHomes() throws Exception {
        assertTrue(data.getObjectHomes(1).equals(data.getFloors().get(0).getObjectHomes()));
    }

    @Test
    public void testSetCharacterPosition() throws Exception {
        Dimension position = new Dimension(45,84);
        data.setCharacterPosition(position.getX(),position.getY());
        assertTrue(data.getCharacterPosition().getX() == position.getX() && data.getCharacterPosition().getY() == position.getY());
    }

    @Test
    public void testGetPresence() throws Exception {
        assertNotNull(data.getPresence());
    }

    @Test
    public void testSetObjectsOn() throws Exception {
//        boolean oneObjectIsOn = false;
//        data.getMainFloor(0);
//        data.setCharacterPosition(300,200);
//        if (!data.getPresence().isEmpty()) {
//            data.setObjectsOn();
//        }
//        System.out.println("Objects state : " + data.getPresence().size());
//        for(ObjectHome ohON : data.getObjectHomes(1)) {
//            if (ohON.isState()) {
//                oneObjectIsOn = true;
//            }
//        }
//        assertTrue(oneObjectIsOn);
    }

    @Test
    public void testSetObjectsOff() throws Exception {

    }

    @Test
    public void testGetObjectsDoors() throws Exception {

    }

    @Test
    public void testGetObjectsOn() throws Exception {

    }

    @Test
    public void testGetCharacterOrientation() throws Exception {

    }

    @Test
    public void testSetCharacterOrientation() throws Exception {

    }
}
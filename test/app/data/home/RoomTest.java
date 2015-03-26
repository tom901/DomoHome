package app.data.home;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.common.ParamHome;
import app.common.RoomsEnum;
import app.data.Dimension;
import app.data.object.ObjectHome;
import app.data.object.Radiator;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

/**
 * Created by Leslie on 26/03/2015.
 */
public class RoomTest {

    Room room;
    Floor floor;
    Radiator radiator;

    @Before
    public void testSetFloor() throws Exception {
        floor = new Floor();
        floor.setGroup(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT));
        room = new Room(floor, RoomsEnum.ROOM.CHAMBRE_1);

    }
    @Test
    public void testRoom() throws Exception {
        room = new Room();
        assertNotNull(room);
    }
    @Test
    public void testGetRoom() throws Exception {
        assertNotNull(room.getRoom());
    }
    @Test
    public void testGetRoomName() throws Exception {
        assertEquals("CHAMBRE_1", room.getRoomName().toString());
        assertNotNull(room.getRoomName());
    }
    @Test
    public void testSetGroup() throws Exception {

        room.setGroup(new Dimension(ParamFirstFloor.FIRST_ROOM_X, ParamFirstFloor.FIRST_ROOM_Y, ParamFirstFloor.FIRST_ROOM_WIDTH, ParamFirstFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_FIRST_LITTLE_MAP, ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT),
                true);

        assertNotNull(room.getRoom());
        assertNotNull(room.getRoomMini());
        assertNotNull(room.getPosition());
        assertNotNull(room.getPositionMini());
        assertEquals(Dimension.class, room.getPosition().getClass());
    }
    @Test
    public void testSetGroup2() throws Exception {

        room.setGroup(new Dimension(ParamFirstFloor.FIRST_ROOM_X, ParamFirstFloor.FIRST_ROOM_Y, ParamFirstFloor.FIRST_ROOM_WIDTH, ParamFirstFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_FIRST_LITTLE_MAP, ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT),
                false);
        assertNotNull(room.getRoom());
        assertNotNull(room.getRoomMini());
        assertNotNull(room.getPosition());
        assertNotNull(room.getPositionMini());
        assertEquals(Dimension.class, room.getPosition().getClass());
    }
    @Test
    public void testSetGroupGarden() throws Exception {

        room.setGroupGarden(new Dimension(ParamFirstFloor.FIRST_ROOM_X, ParamFirstFloor.FIRST_ROOM_Y, ParamFirstFloor.FIRST_ROOM_WIDTH, ParamFirstFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_FIRST_LITTLE_MAP, ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT),
                false);

        assertNotNull(room.getRoom());
        assertNotNull(room.getRoomMini());
    }
    @Test
    public void testSetGroupGarden2() throws Exception {


        room.setGroupGarden(new Dimension(ParamFirstFloor.FIRST_ROOM_X, ParamFirstFloor.FIRST_ROOM_Y, ParamFirstFloor.FIRST_ROOM_WIDTH, ParamFirstFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_FIRST_LITTLE_MAP, ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT),
                true);
        assertNotNull(room.getRoom());
        assertNotNull(room.getRoomMini());
    }

    @Test
    public void testAddObject() throws Exception {
        radiator = new Radiator();
        radiator.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);

        room.addObject(radiator);
        assertNotNull(room.getObjectHomes());
        assertEquals(room.objectHomes.size(), 1);
    }

    @Test
    public void testTurnOnObjects() throws Exception {
        radiator = new Radiator();
        radiator.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);

        assertEquals(false, radiator.isState());
        room.addObject(radiator);
        room.turnOnObjects();
        assertEquals(true, radiator.isState());
    }
    @Test
    public void testTurnOffObjects() throws Exception {
        radiator = new Radiator();
        radiator.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), true, ParamHome.RADIATOR_LANDSCAPE);

        assertEquals(true, radiator.isState());
        room.addObject(radiator);
        room.turnOffObjects();
        assertEquals(false, radiator.isState());
    }

    @Test
    public void testGetGarden() throws Exception {
        room.setGroupGarden(new Dimension(ParamFirstFloor.GARDEN_ROOM_X, ParamFirstFloor.GARDEN_ROOM_Y, ParamFirstFloor.GARDEN_ROOM_WIDTH, ParamFirstFloor.GARDEN_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.GARDEN_LITTLE_ROOM_X, ParamFirstFloor.GARDEN_LITTLE_ROOM_Y, ParamFirstFloor.GARDEN_LITTLE_ROOM_WIDTH, ParamFirstFloor.GARDEN_LITTLE_HEIGHT),
                false);
        assertNotNull(room.getRoom());
        assertNotNull(room.getGarden(ParamFirstFloor.GARDEN_ROOM_WIDTH, ParamFirstFloor.GARDEN_ROOM_HEIGHT, ParamFirstFloor.GARDEN_ROOM_X, ParamFirstFloor.GARDEN_ROOM_Y));
    }
    // getIdRoom <= Méthode non implémenté


}

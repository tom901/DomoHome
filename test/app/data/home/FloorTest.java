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
package app.data.home;

import app.common.ParamDisplay;
import app.common.RoomsEnum;
import app.data.Dimension;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Leslie on 26/03/2015.
 */
public class FloorTest {

    Floor floor;
    Room room;
    @Before
    public void testSetFloor() throws Exception {
        floor = new Floor();
        floor.setGroup(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT));


    }
    @Test
    public void testRoom() throws Exception {
        floor = new Floor();
        assertNotNull(floor);
    }
    @Test
    public void testGetFloor() throws Exception {
        floor = new Floor();
        assertNotNull(floor.getFloor());
    }
    @Test
    public void testAddRoom() throws Exception {
        room = new Room();
        floor.addRoom(room);

        assertNotNull(floor.getRooms().size());
        assertEquals(floor.getRooms().size(), 1);
    }

}

package app.data.object;

import app.common.ParamDisplay;
import app.common.ParamSecondFloor;
import app.data.Dimension;
import org.junit.Test;

import static org.junit.Assert.*;

public class LightTest {

     Light light;

    @Test
    public void testSetGroup() throws Exception {
        light = new Light();
        light.setGroup(new Dimension(ParamSecondFloor.FIRST_LIGHT_X, ParamSecondFloor.FIRST_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_LIGHT_X, ParamSecondFloor.FIRST_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        assertEquals(false, light.isState());
        assertNotNull(light.getGroup());
        assertNotNull(light.getGroupMini());

        light.setGroup(new Dimension(ParamSecondFloor.FIRST_LIGHT_X, ParamSecondFloor.FIRST_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_LIGHT_X, ParamSecondFloor.FIRST_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), true);
       assertEquals(true, light.isState());

        assertNotNull(light.getGroup());
        assertNotNull(light.getGroupMini());

    }

   /* @Test
    public void testGetGroup() throws Exception {
        light = new Light();
        assertNotNull(light.getGroup());
    }

    @Test
    public void testGetGroupMini() throws Exception {
        light = new Light();
        assertNotNull(light.getGroupMini());

    }*/
}
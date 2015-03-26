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

import app.common.ParamFirstFloor;
import app.common.ParamHome;
import app.data.Dimension;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * Created by Leslie on 26/03/2015.
 */
public class RadiatorTest {

    Radiator radiator;

    @Test
    public void testSetGroup() throws Exception {
        radiator = new Radiator();
        radiator.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        assertEquals(false, radiator.isState());
        assertNotNull(radiator.getGroup());
        assertNotNull(radiator.getGroupMini());

        radiator.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), true, ParamHome.RADIATOR_PORTRAIT);

        assertEquals(true, radiator.isState());

        assertNotNull(radiator.getGroup());
        assertNotNull(radiator.getGroupMini());

        assertNotNull(radiator.getRadiator());
        assertNotNull(radiator.getRadiatorMini());
    }
}

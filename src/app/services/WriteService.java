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

/**
 * Created by Nicolas on 16/03/2015.
 */
public interface WriteService {

    public void setCharacterPosition(double x, double y);
    public void setObjectsOn();
    public void setObjectsOff();
    public void setObjectsOn(int roomID);
    public void setCharacterOrientation(int orientation);

}

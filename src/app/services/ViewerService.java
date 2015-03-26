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

import javafx.scene.Parent;

/**
 * Created by Nicolas on 19/03/2015.
 */
public interface ViewerService {
    public void init();
    public Parent getPanel();
    public void setFirstFloorToDisplay(int firstFloorToDisplay);
}

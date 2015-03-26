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

import javafx.scene.Group;
import javafx.scene.shape.Shape;

/**
 * Created by Thomas on 04/03/15.
 */
public abstract class ObjectHome {

    protected boolean state;
    protected Group group;
    protected Group groupMini;

    public ObjectHome(){
        state = false;
        group = new Group();
        groupMini = new Group();
    }

    public boolean isState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

    public abstract Group getGroup();

    public abstract Group getGroupMini();

}

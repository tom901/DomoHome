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

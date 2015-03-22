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

    public void setGroup(Group group) {
        this.group = group;
    }

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

//    public abstract void setGroup();

    public abstract Group getGroup();

    public Group getGroupMini() {
        return groupMini;
    }

}

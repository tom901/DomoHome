package app.data.object;

import javafx.scene.Group;
import javafx.scene.shape.Shape;

/**
 * Created by Thomas on 04/03/15.
 */
public class ObjectHome {

    public boolean state;
    public Group group;
    public Group groupMini;

    public Group getGroup() {
        return group;
    }

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

}

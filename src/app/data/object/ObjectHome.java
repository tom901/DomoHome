package app.data.object;

import javafx.scene.shape.Shape;

/**
 * Created by Thomas on 04/03/15.
 */
public class ObjectHome extends Shape {

    public boolean state;

    public ObjectHome(){
        state = false;
    }

    @Override
    public com.sun.javafx.geom.Shape impl_configShape() {
        return null;
    }


}

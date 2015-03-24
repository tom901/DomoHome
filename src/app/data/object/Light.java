package app.data.object;

import app.common.ParamHome;
import app.data.Dimension;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 04/03/15.
 */
public class Light extends ObjectHome {
    private Circle light;
    private Circle lightMini;

    private Dimension dimLight;
    private Dimension dimLightMini;

    public Light() {
    }

    public void setGroup(Dimension dimension, Dimension dimensionMini, boolean stateLight) {
        super.state = stateLight;
        this.dimLight = dimension;
        this.dimLightMini = dimensionMini;
            this.light = new Circle(dimension.getX(),dimension.getY(),dimension.getRadius());
            this.lightMini = new Circle(dimensionMini.getX(),dimensionMini.getY(),dimensionMini.getRadius());
        if (!stateLight) {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.WHITE);
            lightMini.setStroke(Color.YELLOW);
            lightMini.setFill(Color.WHITE);
        } else {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.YELLOW);
            lightMini.setStroke(Color.YELLOW);
            lightMini.setFill(Color.YELLOW);
        }
        super.group.getChildren().add(light);
        super.groupMini.getChildren().add(lightMini);
    }

    public Group getGroup() {
        if (this.state) {
            light.setFill(Color.YELLOW);
            lightMini.setFill(Color.YELLOW);
        } else {
            light.setFill(Color.WHITE);
            lightMini.setFill(Color.WHITE);
        }
        return group;
    }

    public Group getGroupMini() {
        if (this.state) {
            lightMini.setFill(Color.YELLOW);
        } else {
            lightMini.setFill(Color.WHITE);
        }
        return groupMini;
    }

}

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

    /*public Light(Dimension dimension, boolean stateLight) {
        light = new Circle(dimension.getRadius());
        if (stateLight) {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.YELLOW);
            super.state = false;
        } else {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.WHITE);
            super.state = true;
        }
        light.setCenterX(dimension.getX());
        light.setCenterY(dimension.getY());
        super.group.getChildren().add(light);
    }*/

    public void setGroup(Dimension dimension, Dimension dimensionMini, boolean stateLight) {
        super.state = stateLight;
        this.dimLight = dimension;
        this.dimLightMini = dimensionMini;
            this.light = new Circle(dimension.getX(),dimension.getY(),dimension.getRadius());
            this.lightMini = new Circle(dimensionMini.getX(),dimensionMini.getY(),dimensionMini.getRadius());
        if (!stateLight) {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.YELLOW);
            lightMini.setStroke(Color.YELLOW);
            lightMini.setFill(Color.YELLOW);
        } else {
            light.setStroke(Color.YELLOW);
            light.setFill(Color.WHITE);
            lightMini.setStroke(Color.YELLOW);
            lightMini.setFill(Color.WHITE);
        }
        super.group.getChildren().add(light);
        super.groupMini.getChildren().add(lightMini);
    }

    public Group getLightGroup() {
        return super.group;
    }

    public Group getLightMiniGroup() {
        return super.groupMini;
    }


    public void changeStateLight(boolean stateLight) {
        if (super.state) {
            super.state = false;
        } else {
            super.state = true;
        }
    }

   /* public Dimension getDimensionLight() {
        return dimensionLight;
    }

    public void setDimensionLight(Dimension dimensionLight) {
        this.dimensionLight = dimensionLight;
    }*/
}

package app.data.object;

import app.data.Dimension;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Thomas on 04/03/15.
 */
public class Light extends ObjectHome {
    private Dimension dimensionLight;
    private Circle light;

    public Light() {
    }

    public Light(Dimension dimension, boolean stateLight) {
        //this.dimensionLight = dimensionLight;

        this.dimensionLight = dimension;
//      Group group = new Group();
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
        light.setStroke(Color.BLACK);
        light.setCenterX(dimension.getX());
        light.setCenterY(dimension.getY());
        super.group.getChildren().add(light);
    }

    public Circle getLight() {
        return light;
    }

    public void changeStateLight(boolean stateLight) {
        if (super.state) {
            super.state = false;
        } else {
            super.state = true;
        }
    }

    public Dimension getDimensionLight() {
        return dimensionLight;
    }

    public void setDimensionLight(Dimension dimensionLight) {
        this.dimensionLight = dimensionLight;
    }
}

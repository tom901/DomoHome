package app.data.object;

import app.data.Position;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

/**
 * Created by Thomas on 04/03/15.
 */
public class Light extends ObjectHome {
    Position positionLight;

    public Light(){
    }

    public Group getLight(Position position, boolean stateLight){
        this.positionLight = position;
        Group group = new Group();
        Circle light = new Circle(15);
        if(super.state){
            light.setFill(Color.YELLOW);
            super.state = false;
        }else{
            light.setFill(Color.WHITE);
            super.state = true;
        }
        light.setStroke(Color.BLACK);
        light.setTranslateX(position.getX());
        light.setTranslateY(position.getY());
        group.getChildren().add(light);

        return group;
    }

    public Position getPositionLight() {
        return positionLight;
    }

    public void setPositionLight(Position positionLight) {
        this.positionLight = positionLight;
    }
}

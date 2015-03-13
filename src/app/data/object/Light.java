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
    private Position positionLight;
    private Circle light;

    public Light(){
    }

    public Light(Position position, boolean stateLight) {
        //this.positionLight = positionLight;

        this.positionLight = position;
//        Group group = new Group();
        light = new Circle(15);
        if(stateLight){
            light.setFill(Color.YELLOW);
            super.state = false;
        }else{
            light.setFill(Color.WHITE);
            super.state = true;
        }
        light.setStroke(Color.BLACK);
        light.setCenterX(position.getX());
        light.setCenterY(position.getY());
    }

    public Circle getLight(){
        return light;
    }
    public void changeStateLight(boolean stateLight){
        if(super.state){
            super.state = false;
        }else{
            super.state = true;
        }
    }

    public Position getPositionLight() {
        return positionLight;
    }

    public void setPositionLight(Position positionLight) {
        this.positionLight = positionLight;
    }
}

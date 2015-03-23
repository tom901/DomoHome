package app.data.object;

import app.data.Dimension;
import app.data.home.Floor;
import app.data.home.Room;
import javafx.scene.Group;
import javafx.scene.paint.*;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.*;

/**
 * Created by Leslie on 20/03/2015.
 */
public class Door extends ObjectHome {
    private Dimension dimensionDoor;
    private Dimension dimensionMiniDoor;
    private Rectangle door;
    private Rectangle miniDoor;

    public Door() {
    }

    public void setGroup(Dimension dimension, Dimension dimensionMiniDoor, boolean stateDoor) {
        this.dimensionDoor = dimension;
        this.dimensionMiniDoor = dimensionMiniDoor;

        Rectangle door = new Rectangle(dimension.getX(), dimension.getY(), dimension.getWidth(), dimension.getHeight());
        door.setFill(Color.BLUE);
        Rectangle miniDoor = new Rectangle(dimensionMiniDoor.getX(), dimensionMiniDoor.getY(), dimensionMiniDoor.getWidth(), dimensionMiniDoor.getHeight());
        door.setFill(Color.BLUE);
        super.group.getChildren().add(door);
        super.groupMini.getChildren().add(miniDoor);
    }

    public Rectangle getDoor() {
        return door;
    }

    @Override
    public Group getGroup() {
        return this.group;
    }
}

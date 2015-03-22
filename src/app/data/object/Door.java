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
    private Rectangle door;
    private int room;

    public Door(Dimension dimension, boolean stateDoor, int room) {
        this.dimensionDoor = dimension;
        this.room = room;
        Rectangle door = new Rectangle(dimension.getX(), dimension.getY(), dimension.getWidth(), dimension.getHeight());
        door.setFill(Color.BLUE);
        super.group.getChildren().add(door);
    }

    public Rectangle getDoor() {
        return door;
    }

    @Override
    public Group getGroup() {
        return this.group;
    }
}

package app.data.object;

import app.common.ParamHome;
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

    public void setGroup(Dimension dimension, Dimension dimensionMiniDoor, int orientation) {
        this.dimensionDoor = dimension;
        this.dimensionMiniDoor = dimensionMiniDoor;

        if(orientation == ParamHome.RADIATOR_LANDSCAPE) {
             door = new Rectangle(dimension.getX(), dimension.getY(), ParamHome.DOOR_WIDTH_LANDSCAPE, ParamHome.DOOR_HEIGHT_LANDSCAPE);
             miniDoor = new Rectangle(dimensionMiniDoor.getX(), dimensionMiniDoor.getY(), ParamHome.DOOR_LITTLE_WIDTH_LANDSCAPE, ParamHome.DOOR_LITTLE_HEIGHT_LANDSCAPE);
        }else{
             door = new Rectangle(dimension.getX(), dimension.getY(), ParamHome.DOOR_WIDTH_PORTRAIT, ParamHome.DOOR_HEIGHT_PORTRAIT);
             miniDoor = new Rectangle(dimensionMiniDoor.getX(), dimensionMiniDoor.getY(), ParamHome.DOOR_LITTLE_WIDTH_PORTRAIT, ParamHome.DOOR_LITTLE_HEIGHT_PORTRAIT);
        }
        door.setFill(Color.WHITE);
        miniDoor.setFill(Color.WHITE);
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

    @Override
    public Group getGroupMini() {
        return this.groupMini;
    }
}

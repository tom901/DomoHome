package app.data.home;

import app.common.ParamDisplay;
import app.data.Position;
import app.data.Size;
import app.data.object.ObjectHome;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
public class Room {

    //Attributes
    public Integer Id; // If Id is 0 there are no room in the house
    public ArrayList<ObjectHome> objectHomes;
    double temperature;
    Rectangle rectangle;

    private Group group;

    //Atrtributes private

    public Room() {
        objectHomes = new ArrayList<ObjectHome>();
        Id = 0 ;
        temperature = 0.0;
    }

    public Room(Position p, Size size, int divider, Floor floor, boolean firstRoom){

        group = new Group();
        rectangle = new Rectangle(size.getWidth()/divider,size.getHeight()/divider,Color.WHITE);
        rectangle.setX(floor.getPosition().getX() + p.getX() / divider);
        rectangle.setY(floor.getPosition().getY() + p.getY() / divider);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);
        group.getChildren().add(rectangle);

    }
    public Group getRoom(){

        return group;
    }

    public static Group getGarden(double width, double height, int x, int y){
        Group group = new Group();
        Rectangle room = new Rectangle(width,height,Color.GREEN);
        room.setX(x);
        room.setY(y);
        room.setStroke(Color.BLACK);
        room.setStrokeWidth(1);
        group.getChildren().add(room);
        return group;
    }
    //Function to get Id room
    public void getIdRoom(){

    }

    //Function to add object in room of the house
    public void addObject(ObjectHome obj){

    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }

}

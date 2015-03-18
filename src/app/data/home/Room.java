package app.data.home;

import app.data.Dimension;
import app.data.object.ObjectHome;
import app.display.HomeViewer;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
public class Room {

    //Attributes
    public Integer Id; // If Id is 0 there are no room in the house
    public ArrayList<ObjectHome> objectHomes;
    double temperature;
    private Rectangle rectangle;
    private Group group;
    private Dimension position;

    //Constructor
    public Room() {
        objectHomes = new ArrayList<ObjectHome>();
        Id = 0 ;
        temperature = 0.0;
        group = new Group();
        rectangle = new Rectangle();
    }

    // Methods

    /**
     * Method to initialize the group and rectangle for the room
     * @param p
     * @param floor
     * @param firstRoom
     */
    public void setGroup(Dimension p, Floor floor, boolean firstRoom){
        position = new Dimension(p.getX(),p.getY(),p.getWidth(),p.getHeight());

        rectangle.setWidth(p.getWidth());
        rectangle.setHeight(p.getHeight());
        rectangle.setFill(Color.WHITE);
        if (firstRoom) {
            rectangle.setX(p.getX());
            rectangle.setY(p.getY());
        } else {
            rectangle.setX((floor.getDimension().getX() - floor.getDimension().getX()) + p.getX() );
            rectangle.setY((floor.getDimension().getY() - floor.getDimension().getY()) + p.getY() );
        }
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);


        group.getChildren().add(rectangle);
    }

    /**
     * Method to return the group (therefore rectangle) for the room.
     * @return Group
     */
    public Group getRoom() { return group; }

    public Room getGarden(double width, double height, int x, int y){
        Rectangle room = new Rectangle(width,height,Color.GREEN);
        room.setX(x);
        room.setY(y);
        room.setStroke(Color.BLACK);
        room.setStrokeWidth(1);
        group.getChildren().add(room);
        return this;
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

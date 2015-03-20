package app.data.home;

import app.common.RoomsEnum;
import app.data.Dimension;
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
    private Floor floor;
    double temperature;
    private Rectangle rectangle;
    private Rectangle rectangleMini;
    private Group group;
    private Group groupMini;
    private Dimension position;
    private Dimension positionMini;
    private RoomsEnum.ROOM roomName;

    //Constructor
    public Room() {}

    public Room(Floor floor, RoomsEnum.ROOM roomName) {
        this.floor = floor;
        objectHomes = new ArrayList<ObjectHome>();
        Id = 0 ;
        temperature = 0.0;
        group = new Group();
        groupMini = new Group();
        rectangle = new Rectangle();
        rectangleMini = new Rectangle();
        this.roomName = roomName;
    }

    // Methods

    /**
     * Method to initialize the group and rectangle for the room
     * @param p
     * @param p_mini
     * @param firstRoom
     */
    public void setGroup(Dimension p, Dimension p_mini, boolean firstRoom){
        // Construct Main Recrangle
        this.position = p;

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

        // Construct mini rectangle
        this.positionMini = p_mini;

        rectangleMini.setWidth(p_mini.getWidth());
        rectangleMini.setHeight(p_mini.getHeight());
        rectangleMini.setFill(Color.WHITE);
        if (firstRoom) {
            rectangleMini.setX(p_mini.getX());
            rectangleMini.setY(p_mini.getY());
        } else {
            rectangleMini.setX((floor.getDimension().getX() - floor.getDimension().getX()) + p_mini.getX());
            rectangleMini.setY((floor.getDimension().getY() - floor.getDimension().getY()) + p_mini.getY());
        }
        rectangleMini.setStroke(Color.BLACK);
        rectangleMini.setStrokeWidth(1);

        groupMini.getChildren().add(rectangleMini);
    }

    /**
     * Method to return the group (therefore rectangle) for the room.
     * @return Group
     */
    public Group getRoom() { return group; }

    public Group getRoomMini() { return groupMini; }

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
        this.objectHomes.add(obj);
    }

    public ArrayList<ObjectHome> getObjectHomes() {
        return objectHomes;
    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }

    public Dimension getPosition() {
        return position;
    }

    public Dimension getPositionMini() {
        return positionMini;
    }
}

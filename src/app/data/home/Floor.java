package app.data.home;

import app.data.Dimension;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
//Classe to handler the floor of the house
public class Floor {


    // Attributes
    private Dimension dimension;
    private Dimension dimensionMini;
    public ArrayList<Room> rooms;
    public boolean inFront;
    public Group group;
    public Group groupMini;
    Rectangle rectangle;
    Rectangle rectangleMini;

    // Constructors
    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();
        group = new Group();
        groupMini = new Group();

    }

    public Floor(Dimension p, int divider) {

        group = new Group();
        this.dimension = p;
        Rectangle floor = new Rectangle(p.getWidth()/divider,p.getHeight()/divider, Color.WHITE);
        floor.setX(p.getX());
        floor.setY(p.getY());
        floor.setFill(Color.WHITE);
        floor.setStroke(Color.BLACK);
        floor.setStrokeWidth(1);
        group.getChildren().add(floor);
    }

    //Methods
    public void setGroup (Dimension p) {
        // Set the group and rectangle for the normal size
        this.setDimension(p);
        rectangle = new Rectangle(p.getWidth(), p.getHeight(), Color.WHITE);
        rectangle.setX(p.getX());
        rectangle.setY(p.getY());
        rectangle.setFill(Color.WHITE);
        rectangle.setStroke(Color.BLACK);
        rectangle.setStrokeWidth(1);
        group.getChildren().add(rectangle);

        // Set the group and rectangle for the mini size
//        this.setDimensionMini(pMini);
//        rectangleMini = new Rectangle(pMini.getWidth(), pMini.getHeight(), Color.WHITE);
//        rectangleMini.setX(pMini.getX());
//        rectangleMini.setY(pMini.getY());
//        rectangleMini.setFill(Color.WHITE);
//        rectangleMini.setStroke(Color.BLACK);
//        rectangleMini.setStrokeWidth(1);
//        group.getChildren().add(rectangleMini);
    }

    /**
     * Method to return the group (therefore the rectangle) of the floor.
     * @return Group
     */
    public Group getFloor() {
        System.out.println("Size floor group : " + group.getChildren().getClass());
        return group;
    }

    /**
     * Function to add floor in floor
     * @return Group
     */
    public void addRoom(Room room){
        this.rooms.add(room);
    }

    public ArrayList<Room> getRooms() { return this.rooms; }

    public Room getSpecificRoom(int index) { return this.rooms.get(index); }

    //Function to know what floor is in front of the view
    public void isInFront(){

    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }

    /**
     * Method to return the dimension onf a floor.
     * @return Dimension
     */
    public Dimension getDimension() {
        return dimension;
    }

    public Dimension getDimensionMini() {
        return dimensionMini;
    }

    /**
     * Method to set the dimension(position + size) of a floor
     * @param p
     */
    public void setDimension(Dimension p) {
        this.dimension = p;
    }
    public void setDimensionMini(Dimension p) {
        this.dimensionMini = p;
    }




}

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
    private Dimension p;
    public ArrayList<Room> rooms;
    public boolean inFront;
    public Group group;

    // Constructors
    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();
    }
    public Floor(Dimension p) {
        group = new Group();
        this.p = p;
        Rectangle floor = new Rectangle(p.getWidth(),p.getHeight(), Color.WHITE);
        floor.setX(p.getX());
        floor.setY(p.getY());
        floor.setFill(Color.WHITE);
        floor.setStroke(Color.BLACK);
        floor.setStrokeWidth(1);
        group.getChildren().add(floor);
    }

    public Floor(Dimension p, int divider) {

        group = new Group();
        this.p = p;
        Rectangle floor = new Rectangle(p.getWidth()/divider,p.getHeight()/divider, Color.WHITE);
        floor.setX(p.getX());
        floor.setY(p.getY());
        floor.setFill(Color.WHITE);
        floor.setStroke(Color.BLACK);
        floor.setStrokeWidth(1);
        group.getChildren().add(floor);
    }

    //Methods

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
    public Group addRoom(){
        return null;
    }

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
        return p;
    }

    /**
     * Method to set the dimension(position + size) of a floor
     * @param p
     */
    public void setDimension(Dimension p) {
        this.p = p;
    }




}

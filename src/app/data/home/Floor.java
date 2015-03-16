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
public class Floor extends Home {


    //Attributes
    private Dimension p;
    public ArrayList<Room> rooms;
    public boolean inFront;
    public Group group;

    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();
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

    public Group getFloor() {
        return group;
    }

    //Function to add floor in floor
    public Group addRoom(){
        return null;
    }

    //Function to know what floor is in front of the view
    public void isInFront(){

    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }

    public Dimension getDimension() {
        return p;
    }

    public void setDimension(Dimension p) {
        this.p = p;
    }




}

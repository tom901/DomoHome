package app.data.home;

import javafx.scene.Group;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
//Classe to handler the floor of the house
public class Floor extends Home {

    //Attributes
    public ArrayList<Room> rooms;
    public boolean inFront;

    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();


    }
    //Function to add room in floor
    public Group addRoom(){
        return null;
    }

    //Function to know what floor is in front of the view
    public void isInFront(){

    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }





}

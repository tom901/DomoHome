package app.home;

import app.object.ObjectHome;
import javafx.scene.effect.Reflection;
import javafx.scene.paint.Color;
import javafx.scene.paint.CycleMethod;
import javafx.scene.paint.LinearGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.Rectangle;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
public class Room extends Floor {

    //Attributes
    public Integer Id; // If Id is 0 there are no room in the house
    public ArrayList<ObjectHome> objectHomes;
    double temperature;

    public Room(){
        objectHomes = new ArrayList<ObjectHome>();
        Id = 0 ;
        temperature = 0.0;
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

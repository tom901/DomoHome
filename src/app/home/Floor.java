package app.home;

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
//Classe to handler the floor of the house
public class Floor extends Home {

    //Attributes
    public ArrayList<Room> rooms;
    public boolean inFront;

    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();

        //Etage 1
       /* Rectangle floor1 = new Rectangle();
        floor1.setWidth(700);
        floor1.setHeight(500);
        floor1.setArcWidth(30);
        floor1.setArcHeight(30);
        floor1.setFill(Color.WHITE);
        this.setTranslateX(5);
        this.setTranslateY(5);
        this.getChildren().add(floor1);*/
    }
    //Function to add room in floor
    public void addRoom(){

    }

    //Function to know what floor is in front of the view
    public void isInFront(){

    }

    //Function to change state of all objects
    public void swithStateObjects(){

    }





}

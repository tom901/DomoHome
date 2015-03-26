/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: engine/Engine.java 2015-03-11 buixuan.
 * Modified 2015/03/26 by :
 * - nicolas.didier.fd@gmail.com
 * - leslie.cha@hotmail.fr
 * - thomas.paraison@me.com
 * ******************************************************/
package app.data.home;

import app.data.Dimension;
import app.data.object.ObjectHome;
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
    private ArrayList<Room> rooms;
    private ArrayList<ObjectHome> objectHomes;
    private boolean inFront;
    private Group group;
    private Rectangle rectangle;

    // Constructors
    public Floor(){
        inFront = false;
        rooms = new ArrayList<Room>();
        group = new Group();
        objectHomes = new ArrayList<ObjectHome>();
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

    /**
     * Method to return the dimension onf a floor.
     * @return Dimension
     */
    public Dimension getDimension() {
        return dimension;
    }

    /**
     * Method to set the dimension(position + size) of a floor
     * @param p
     */
    public void setDimension(Dimension p) {
        this.dimension = p;
    }

    public ArrayList<ObjectHome> getObjectHomes() {
        return objectHomes;
    }

    public void addObjectHome(ObjectHome objectHome) {
        this.objectHomes.add(objectHome);
    }

}

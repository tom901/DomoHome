package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.data.Data;
import app.data.Dimension;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.Light;
import app.data.object.ObjectHome;
import app.services.DataService;
import app.services.ReadService;
import app.services.RequireReadService;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TitledPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

import java.awt.event.MouseEvent;
import java.util.ArrayList;

/**
 * Created by Nicolas on 16/03/2015.
 *
 * This class has for main purpose to display the floors and the rooms
 */
public class HomeViewer extends Parent implements RequireReadService {
    private ReadService data;
    public int divider = 1;
    private double xShrink,yShrink,shrink,xModifier,yModifier,heroesScale;

    public ArrayList<Room> displayBigFloor;

    public HomeViewer() {}

    public Group init() {
        xShrink =1;
        yShrink =1;
        xModifier=0;
        yModifier=0;

        data = new Data();

        Group root = new Group();

        data.init();


        for (ArrayList<Room> rooms : data.getMainFloor(1)) {
            for (Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
            for(ObjectHome objectHomeTmp : data.getObjectHomes(1)){
                root.getChildren().add(objectHomeTmp.group);
            }
            //Boucle pour afficher les objets du premier étage, place automatiquement, il faut trouver comment prendre cette liste sulement si on veut affcher le premier étage sur la map
           /* for(ObjectHome objectHomeTmp : data.getObjectHomes(1)){
                root.getChildren().add(objectHomeTmp.group);
            }*/
        }


        //loop to make placement of mini floors
        for(int i = 1 ; i <= 3; i++){
            for (ArrayList<Room> rooms : data.getSecondaryFloors(i)){
                for(Room room : rooms) {
                    root.getChildren().add(room.getRoom());
                }
            }
        }
        //Il faudra vérifier que si on change l'état d'une lampe sur la grande map, il faudra aussi modifier la liste avec les minimaps pour mettre a jour l'object concerné
        for(ObjectHome objectHomeTmp : data.getMiniObjectHomes()){
            root.getChildren().add(objectHomeTmp.group);
        }


        return root;
    }

    public void getPanel() {
        shrink = Math.min(xShrink, yShrink);

    }
    public  Group changeBigMap(int numberFloor){
        Group root = new Group();

        for (ArrayList<Room> rooms : data.getMainFloor(numberFloor)) {
            for (Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
        }
        return root;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

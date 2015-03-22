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
import javafx.scene.shape.Circle;
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

    public HomeViewer() {
//        data = new Data();
//        data.init();
    }

    public Group init() {
        xShrink =1;
        yShrink =1;
        xModifier=0;
        yModifier=0;

        Group root = new Group();

        for (ArrayList<Room> rooms : data.getMainFloor(1)) {
            for (Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
            for(ObjectHome objectHomeTmp : data.getObjectHomes(1)){
                root.getChildren().add(objectHomeTmp.getGroup());
            }
        }


        //loop to make placement of mini floors
        for (Room room : data.getRooms()) {
            root.getChildren().add(room.getRoomMini());
            for (ObjectHome oh : room.getObjectHomes()) {
                root.getChildren().add(oh.getGroupMini());
            }
        }

        Rectangle rectCharacter = new Rectangle(ParamDisplay.CHARACTER_WIDTH,ParamDisplay.CHARACTER_HEIGHT);
        rectCharacter.setFill(Color.BLACK);
        rectCharacter.setTranslateX(data.getCharacterPosition().getX());
        rectCharacter.setTranslateY(data.getCharacterPosition().getY());
        rectCharacter.setArcWidth(70);
        rectCharacter.setArcHeight(70);

        Circle head = new Circle();
        head.setCenterX(data.getCharacterPosition().getX() + (rectCharacter.getWidth()/2));
        head.setCenterY(data.getCharacterPosition().getY() + (rectCharacter.getHeight()/2));
        head.setRadius(5);
        head.setStroke(Color.WHITE);
        head.setFill(Color.TRANSPARENT);

        root.getChildren().add(rectCharacter);
        root.getChildren().add(head);

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

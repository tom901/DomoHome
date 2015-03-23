package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.common.ParamHome;
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
    public int divider = 1, firstFloorToDisplay, j, lastFloor;
    private double xShrink,yShrink,shrink,xModifier,yModifier,heroesScale;
    private boolean changeFloor;

    public ArrayList<Room> displayBigFloor;
//    private ArrayList<ArrayList<Room>> roomsInBig;

    public HomeViewer() {
//        roomsInBig = new ArrayList<ArrayList<Room>>();
//        data = new Data();
//        data.getPanel();
        changeFloor = true;
        j = 0;
        lastFloor = -1;
    }



    public Group getPanel() {
        xShrink =1;
        yShrink =1;
        xModifier=0;
        yModifier=0;

        //System.out.println("Y : " + data.getCharacterPosition().getY() + " - Y+H : " + (data.getCharacterPosition().getY() + ParamDisplay.CHARACTER_HEIGHT) + " StairY: " + ParamHome.FIRST_STAIR_Y + " - StairY+H: " + (ParamHome.FIRST_STAIR_Y + ParamHome.STAIR_HEIGHT));
        if (changeFloor && data.getCharacterPosition().getY() > ParamHome.FIRST_STAIR_Y && data.getCharacterPosition().getY() + ParamDisplay.CHARACTER_HEIGHT <= ParamHome.FIRST_STAIR_Y + ParamHome.STAIR_HEIGHT) {
            if (firstFloorToDisplay == 1 || firstFloorToDisplay == 3) {
                System.out.println("firstFloor : " + firstFloorToDisplay);
                lastFloor = firstFloorToDisplay;
                firstFloorToDisplay = 2;
                System.out.println("lastFloor : " + lastFloor);
            } else if (firstFloorToDisplay == 2) {
                if (lastFloor == 1) {
                    firstFloorToDisplay = 3;
                } else {
                    firstFloorToDisplay = 1;
                }
            }
            changeFloor = false;
        }
        if (!changeFloor) {
            j++;
            if (j == 5) { changeFloor = true; j = 0; }
        }


        Group root = new Group();
//        roomsInBig.clear();
//        roomsInBig = data.getMainFloor(firstFloorToDisplay);
//        for (ArrayList<Room> rooms : data.getMainFloor(firstFloorToDisplay)) {
            for (Room room : data.getMainFloor(firstFloorToDisplay)) {
                root.getChildren().add(room.getRoom());
            }
            for(ObjectHome objectHomeTmp : data.getObjectHomes(firstFloorToDisplay)){
                root.getChildren().add(objectHomeTmp.getGroup());
            }
//        }


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

        StairViewer stair = new StairViewer();

        root.getChildren().add(stair.getStair());
        root.getChildren().add(rectCharacter);
        root.getChildren().add(head);
        return root;
    }

    public void setFirstFloorToDisplay(int firstFloorToDisplay) {
        this.firstFloorToDisplay = firstFloorToDisplay;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

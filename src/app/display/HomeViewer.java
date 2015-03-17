package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.data.Data;
import app.data.Dimension;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.Light;
import app.services.DataService;
import app.services.ReadService;
import app.services.RequireReadService;
import javafx.scene.Group;
import javafx.scene.Parent;

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

        }
        for (ArrayList<Room> rooms : data.getSecondaryFloors(1)){
            for(Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
        }
        for (ArrayList<Room> rooms : data.getSecondaryFloors(2)){
            for(Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
        }
        for (ArrayList<Room> rooms : data.getSecondaryFloors(3)){
            for(Room room : rooms) {
                root.getChildren().add(room.getRoom());
            }
        }



        return root;
    }

    public void getPanel() {
        shrink = Math.min(xShrink, yShrink);

    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

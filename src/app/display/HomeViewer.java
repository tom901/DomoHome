package app.display;

import app.common.ParamDisplay;
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

/**
 * Created by Nicolas on 16/03/2015.
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

        for(Room room : data.getRooms()) {
            root.getChildren().add(room.getRoom());
        }

        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));

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

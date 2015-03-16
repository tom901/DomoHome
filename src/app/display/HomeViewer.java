package app.display;

import app.common.ParamDisplay;
import app.data.Dimension;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.Light;
import javafx.scene.Group;
import javafx.scene.Parent;

/**
 * Created by Nicolas on 16/03/2015.
 */
public class HomeViewer extends Parent {
    public int divider = 1;

    public Group init() {
        Group root = new Group();

        Floor floor_rdc = new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider);

        root.getChildren().add(floor_rdc.getFloor());

        Room room01_01 = new Room();
        root.getChildren().add(room01_01.getRoom(new Dimension(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y,ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT),
                divider, floor_rdc, true));

        Room room01_02 = new Room();
        root.getChildren().add(room01_02.getRoom(new Dimension(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y,ParamDisplay.SECOND_ROOM_WIDTH,ParamDisplay.SECOND_ROOM_HEIGHT),
                divider, floor_rdc, false));

        Room room01_03 = new Room();
        root.getChildren().add(room01_03.getRoom(new Dimension(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y,ParamDisplay.THIRD_ROOM_WIDTH,ParamDisplay.THIRD_ROOM_HEIGHT),
                divider, floor_rdc, false));

        Room room01_04 = new Room();
        root.getChildren().add(room01_04.getRoom(new Dimension(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y,ParamDisplay.FOURTH_ROOM_WIDTH,ParamDisplay.FOURTH_ROOM_HEIGHT),
                divider, floor_rdc, false));

        Room room01_05 = new Room();
        root.getChildren().add(room01_05.getRoom(new Dimension(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y,ParamDisplay.FIFTH_ROOM_WIDTH,ParamDisplay.FIFTH_ROOM_HEIGHT),
                divider, floor_rdc, false));

        Light lightFirstPlace = new Light(new Dimension(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y,15),true);
        root.getChildren().add(lightFirstPlace.getLight());

        Light lightSecondPlace = new Light(new Dimension(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y,15),false);
        root.getChildren().add(lightSecondPlace.getLight());

        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));

        return root;
    }

}

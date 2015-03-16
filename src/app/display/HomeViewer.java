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
    public int divider;

    public HomeViewer(Group root) {
        System.out.println("root : "+root.getChildren().size());

        Floor floor_rdc = new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider);

        root.getChildren().add(floor_rdc.getFloor());
        System.out.println("root : "+root.getChildren().size());

        Room room01_01 = new Room(new Dimension(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y,ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT),
                divider, floor_rdc, true);
        root.getChildren().add(room01_01.getRoom());

        Room room01_02 = new Room(new Dimension(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y,ParamDisplay.SECOND_ROOM_WIDTH,ParamDisplay.SECOND_ROOM_HEIGHT),
                divider, floor_rdc, false);
        System.out.println("2nd room X : " + ParamDisplay.SECOND_ROOM_X);
        root.getChildren().add(room01_02.getRoom());

        Room room01_03 = new Room(new Dimension(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y,ParamDisplay.THIRD_ROOM_WIDTH,ParamDisplay.THIRD_ROOM_HEIGHT),
                divider, floor_rdc, false);
        root.getChildren().add(room01_03.getRoom());

        Room room01_04 = new Room(new Dimension(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y,ParamDisplay.FOURTH_ROOM_WIDTH,ParamDisplay.FOURTH_ROOM_HEIGHT),
                divider, floor_rdc, false);
        root.getChildren().add(room01_04.getRoom());

        Room room01_05 = new Room(new Dimension(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y,ParamDisplay.FIFTH_ROOM_WIDTH,ParamDisplay.FIFTH_ROOM_HEIGHT),
                divider, floor_rdc, false);
        root.getChildren().add(room01_05.getRoom());

        Light lightFirstPlace = new Light(new Dimension(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y,15),true);
        root.getChildren().add(lightFirstPlace.getLight());

        Light lightSecondPlace = new Light(new Dimension(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y,15),false);
        root.getChildren().add(lightSecondPlace.getLight());

        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));

    }

}

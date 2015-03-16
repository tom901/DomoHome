package app.data;

import app.common.ParamDisplay;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.Light;
import app.data.object.ObjectHome;
import app.services.DataService;

import java.util.ArrayList;

/**
 * Created by Nicolas on 16/03/2015.
 */
public class Data implements DataService {
    ArrayList<Floor> floors;
    ArrayList<Room> rooms;
    ArrayList<ObjectHome> objects;

    public void init() {
        floors = new ArrayList<Floor>();
        rooms = new ArrayList<Room>();
        objects = new ArrayList<ObjectHome>();
        initFloors();
        initRooms();
        initObjects();
    }

    public ArrayList<Room> getRooms() {
        return rooms;
    }

    private void initFloors() {
        int divider = 1;
        floors.add(new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider));
    }

    private void initRooms() {
        int divider = 1;
        Room room01_01 = new Room();
        room01_01.setGroup(new Dimension(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y, ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT),
                divider, floors.get(0), true);
        rooms.add(room01_01);

        Room room01_02 = new Room();
        room01_02.setGroup(new Dimension(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y, ParamDisplay.SECOND_ROOM_WIDTH, ParamDisplay.SECOND_ROOM_HEIGHT),
                divider, floors.get(0), false);
        rooms.add(room01_02);

        Room room01_03 = new Room();
        room01_03.setGroup(new Dimension(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y, ParamDisplay.THIRD_ROOM_WIDTH, ParamDisplay.THIRD_ROOM_HEIGHT),
                divider, floors.get(0), false);
        rooms.add(room01_03);

        Room room01_04 = new Room();
        room01_04.setGroup(new Dimension(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y, ParamDisplay.FOURTH_ROOM_WIDTH, ParamDisplay.FOURTH_ROOM_HEIGHT),
                divider, floors.get(0), false);
        rooms.add(room01_04);

        Room room01_05 = new Room();
        room01_05.setGroup(new Dimension(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y, ParamDisplay.FIFTH_ROOM_WIDTH, ParamDisplay.FIFTH_ROOM_HEIGHT),
                divider, floors.get(0), false);
        rooms.add(room01_05);

//        root.getChildren().add(lightFirstPlace.getLight());
//        root.getChildren().add(lightSecondPlace.getLight());
    }

    private void initObjects() {
        Light lightFirstPlace = new Light(new Dimension(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y,15),true);

        Light lightSecondPlace = new Light(new Dimension(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y,15),false);

    }
}

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
//    ArrayList<Room> rooms;
    ArrayList<ObjectHome> objects;

    public void init() {
        floors = new ArrayList<Floor>();
//        rooms = new ArrayList<Room>();
        objects = new ArrayList<ObjectHome>();
        initFloors();
        //initRooms();
        initObjects();
    }

    public ArrayList<Room> getRooms() {
        return null;
    }

    private void initFloors() {
        int divider = 1;
        floors.add(new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider));

        floors.add(new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X+600,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y+100,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider));

        floors.add(new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X+600,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y+400,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
                ,divider));

    }

    private ArrayList<Room> initRoomsFirstFloor(int divider) {
        ArrayList<Room> rooms = new ArrayList<Room>();
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

        return rooms;
    }

    private ArrayList<Room> initRoomsSecondFloor(int divider) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room room01_01 = new Room();
        room01_01.setGroup(new Dimension(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y, ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT),
                divider, floors.get(1), true);
        rooms.add(room01_01);

        Room room01_02 = new Room();
        room01_02.setGroup(new Dimension(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y, ParamDisplay.SECOND_ROOM_WIDTH, ParamDisplay.SECOND_ROOM_HEIGHT),
                divider, floors.get(1), false);
        rooms.add(room01_02);

        Room room01_03 = new Room();
        room01_03.setGroup(new Dimension(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y, ParamDisplay.THIRD_ROOM_WIDTH, ParamDisplay.THIRD_ROOM_HEIGHT),
                divider, floors.get(1), false);
        rooms.add(room01_03);

        Room room01_04 = new Room();
        room01_04.setGroup(new Dimension(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y, ParamDisplay.FOURTH_ROOM_WIDTH, ParamDisplay.FOURTH_ROOM_HEIGHT),
                divider, floors.get(1), false);
        rooms.add(room01_04);

        Room room01_05 = new Room();
        room01_05.setGroup(new Dimension(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y, ParamDisplay.FIFTH_ROOM_WIDTH, ParamDisplay.FIFTH_ROOM_HEIGHT),
                divider, floors.get(1), false);
        rooms.add(room01_05);

        return rooms;
    }

    private ArrayList<Room> initRoomsThirdFloor(int divider) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        Room room01_01 = new Room();
        room01_01.setGroup(new Dimension(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y, ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT),
                divider, floors.get(2), true);
        rooms.add(room01_01);

        Room room01_02 = new Room();
        room01_02.setGroup(new Dimension(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y, ParamDisplay.SECOND_ROOM_WIDTH, ParamDisplay.SECOND_ROOM_HEIGHT),
                divider, floors.get(2), false);
        rooms.add(room01_02);

        Room room01_03 = new Room();
        room01_03.setGroup(new Dimension(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y, ParamDisplay.THIRD_ROOM_WIDTH, ParamDisplay.THIRD_ROOM_HEIGHT),
                divider, floors.get(2), false);
        rooms.add(room01_03);

        Room room01_04 = new Room();
        room01_04.setGroup(new Dimension(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y, ParamDisplay.FOURTH_ROOM_WIDTH, ParamDisplay.FOURTH_ROOM_HEIGHT),
                divider, floors.get(2), false);
        rooms.add(room01_04);

        Room room01_05 = new Room();
        room01_05.setGroup(new Dimension(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y, ParamDisplay.FIFTH_ROOM_WIDTH, ParamDisplay.FIFTH_ROOM_HEIGHT),
                divider, floors.get(2), false);
        rooms.add(room01_05);

        return rooms;
    }

    private void initObjects() {
        Light lightFirstPlace = new Light(new Dimension(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y,15),true);

        Light lightSecondPlace = new Light(new Dimension(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y,15),false);

    }

    public ArrayList<ArrayList<Room>> getMainFloor(int floorNo) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        switch (floorNo) {
            case 1:
                rooms = initRoomsFirstFloor(1);
                break;
            case 2:
                rooms = initRoomsSecondFloor(1);
                break;
            case 3:
                rooms = initRoomsThirdFloor(1);
                break;
        }
        ArrayList<ArrayList<Room>> lel = new ArrayList<ArrayList<Room>>();
        lel.add(rooms);
        return lel;
    }

    public ArrayList<ArrayList<Room>> getSecondaryFloors(int floorNoInFull) {
        ArrayList<ArrayList<Room>> lel = new ArrayList<ArrayList<Room>>();
        ArrayList<Room> rooms;
        switch (floorNoInFull) {
            case 1:
                rooms = initRoomsSecondFloor(4);
                lel.add(rooms);
                rooms = initRoomsThirdFloor(4);
                lel.add(rooms);
                break;
            case 2:
                rooms = initRoomsFirstFloor(4);
                lel.add(rooms);
                rooms = initRoomsThirdFloor(4);
                lel.add(rooms);
                break;
            case 3:
                rooms = initRoomsSecondFloor(4);
                lel.add(rooms);
                rooms = initRoomsFirstFloor(4);
                lel.add(rooms);
                break;
        }
        return lel;
    }
}

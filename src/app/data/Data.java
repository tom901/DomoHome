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
package app.data;

import app.common.*;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.*;
import app.display.HandlerAudio;
import app.services.DataService;

import java.util.ArrayList;

/**
 * Created by Nicolas on 16/03/2015.
 */
public class Data implements DataService {
    ArrayList<Floor> floors;
    ArrayList<Floor> miniFloors;
    ArrayList<Room> rooms;
    ArrayList<Room> roomsNotEmpty;
    ArrayList<ObjectHome> objectHomes;
    Character character;
    int mainFloorNo;

    public Data() {
        floors = new ArrayList<Floor>();
        miniFloors = new ArrayList<Floor>();
        rooms = new ArrayList<Room>();
        objectHomes = new ArrayList<ObjectHome>();
    }

    /**
     * Method to getPanel the main content of the simulator
     */
    public void init() {
        mainFloorNo = -1;
        floors = new ArrayList<Floor>();
        miniFloors = new ArrayList<Floor>();
        rooms = new ArrayList<Room>();
        objectHomes = new ArrayList<ObjectHome>();
        character = new Character(new Dimension(10, 200, ParamDisplay.CHARACTER_WIDTH, ParamDisplay.CHARACTER_HEIGHT));

        initFloors();
        initRooms(0, 6);
        initRooms(1, 4);
        initRooms(2, 1);

        initRoomsFirstFloor();
        initRoomsSecondFloor();
        initRoomsThirdFloor();

        initObjectHomes();
    }

    /**
     * Method to getPanel the floors.
     */
    public void initFloors() {
        Floor floor_01 = new Floor();
        floor_01.setGroup(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT));
        floors.add(floor_01);

        Floor floor_02 = new Floor();
        floor_02.setGroup(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT));
        floors.add(floor_02);

        Floor floor_03 = new Floor();
        floor_03.setGroup(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X, ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH, ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT));
        floors.add(floor_03);

    }

    /**
     * Method to getPanel the rooms without creating the rectangles for their display.
     *
     * @param floorIndex
     * @param noOfRoom
     */
    public void initRooms(int floorIndex, int noOfRoom) {
        RoomsEnum.ROOM enumRoom = RoomsEnum.ROOM.CHAMBRE_1;
        for (int i = 0; i < noOfRoom; i++) {
            if (floorIndex == 0) {
                switch (i) {
                    case 0:
                        enumRoom = RoomsEnum.ROOM.CHAMBRE_1;
                        break;
                    case 1:
                        enumRoom = RoomsEnum.ROOM.SALON_1;
                        break;
                    case 2:
                        enumRoom = RoomsEnum.ROOM.ENTREE_1;
                        break;
                    case 3:
                        enumRoom = RoomsEnum.ROOM.CUISINE_1;
                        break;
                    case 4:
                        enumRoom = RoomsEnum.ROOM.SDB_1;
                        break;
                    case 5:
                        enumRoom = RoomsEnum.ROOM.GARDEN_1;
                        break;
                }
            } else {
                if (floorIndex == 1) {
                    switch (i) {
                        case 0:
                            enumRoom = RoomsEnum.ROOM.SALLE_JEU_2;
                            break;
                        case 1:
                            enumRoom = RoomsEnum.ROOM.COULOIR_2;
                            break;
                        case 2:
                            enumRoom = RoomsEnum.ROOM.CHAMBRE_2;
                            break;
                        case 3:
                            enumRoom = RoomsEnum.ROOM.SDB_2;
                            break;
                    }
                } else {
                    switch (i) {
                        case 0:
                            enumRoom = RoomsEnum.ROOM.GRENIER_3;
                            break;

                    }
                }
            }
            Room room = new Room(floors.get(floorIndex), enumRoom);
            rooms.add(room);
            floors.get(floorIndex).addRoom(room);
        }
    }

    /**
     * Method to initialize all rooms for floors No. 1 (for the main floor rectangle).
     */
    public void initRoomsFirstFloor() {
        floors.get(0).getSpecificRoom(0).setGroup(new Dimension(ParamFirstFloor.FIRST_ROOM_X, ParamFirstFloor.FIRST_ROOM_Y, ParamFirstFloor.FIRST_ROOM_WIDTH, ParamFirstFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_FIRST_LITTLE_MAP, ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT),
                true);

        floors.get(0).getSpecificRoom(1).setGroup(new Dimension(ParamFirstFloor.SECOND_ROOM_X, ParamFirstFloor.SECOND_ROOM_Y, ParamFirstFloor.SECOND_ROOM_WIDTH, ParamFirstFloor.SECOND_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.SECOND_LITTLE_ROOM_X, ParamFirstFloor.SECOND_LITTLE_ROOM_Y, ParamFirstFloor.SECOND_LITTLE_ROOM_WIDTH, ParamFirstFloor.SECOND_LITTLE_ROOM_HEIGHT),
                false);

        floors.get(0).getSpecificRoom(2).setGroup(new Dimension(ParamFirstFloor.THIRD_ROOM_X, ParamFirstFloor.THIRD_ROOM_Y, ParamFirstFloor.THIRD_ROOM_WIDTH, ParamFirstFloor.THIRD_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.THIRD_LITTLE_ROOM_X, ParamFirstFloor.THIRD_LITTLE_ROOM_Y, ParamFirstFloor.THIRD_LITTLE_ROOM_WIDTH, ParamFirstFloor.THIRD_LITTLE_ROOM_HEIGHT),
                false);

        floors.get(0).getSpecificRoom(3).setGroup(new Dimension(ParamFirstFloor.FOURTH_ROOM_X, ParamFirstFloor.FOURTH_ROOM_Y, ParamFirstFloor.FOURTH_ROOM_WIDTH, ParamFirstFloor.FOURTH_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.FOURTH_LITTLE_ROOM_X, ParamFirstFloor.FOURTH_LITTLE_ROOM_Y, ParamFirstFloor.FOURTH_LITTLE_ROOM_WIDTH, ParamFirstFloor.FOURTH_LITTLE_ROOM_HEIGHT),
                false);

        floors.get(0).getSpecificRoom(4).setGroup(new Dimension(ParamFirstFloor.FIFTH_ROOM_X, ParamFirstFloor.FIFTH_ROOM_Y, ParamFirstFloor.FIFTH_ROOM_WIDTH, ParamFirstFloor.FIFTH_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.FIFTH_LITTLE_ROOM_X, ParamFirstFloor.FIFTH_LITTLE_ROOM_Y, ParamFirstFloor.FIFTH_LITTLE_ROOM_WIDTH, ParamFirstFloor.FIFTH_LITTLE_ROOM_HEIGHT),
                false);

        floors.get(0).getSpecificRoom(5).setGroupGarden(new Dimension(ParamFirstFloor.GARDEN_ROOM_X, ParamFirstFloor.GARDEN_ROOM_Y, ParamFirstFloor.GARDEN_ROOM_WIDTH, ParamFirstFloor.GARDEN_ROOM_HEIGHT),
                new Dimension(ParamFirstFloor.GARDEN_LITTLE_ROOM_X, ParamFirstFloor.GARDEN_LITTLE_ROOM_Y, ParamFirstFloor.GARDEN_LITTLE_ROOM_WIDTH, ParamFirstFloor.GARDEN_LITTLE_HEIGHT),
                false);

    }

    /**
     * Method to initialize all rooms for floors No. 2 (for the main floor rectangle)
     *
     * @return ArrayList<Room>
     */
    public void initRoomsSecondFloor() {
        floors.get(1).getSpecificRoom(0).setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_X, ParamSecondFloor.FIRST_ROOM_Y, ParamSecondFloor.FIRST_ROOM_WIDTH, ParamSecondFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_SECOND_LITTLE_MAP, ParamSecondFloor.FIRST_LITTLE_ROOM_WIDTH, ParamSecondFloor.FIRST_LITTLE_ROOM_HEIGHT), false);

        floors.get(1).getSpecificRoom(1).setGroup(new Dimension(ParamSecondFloor.SECOND_ROOM_X, ParamSecondFloor.SECOND_ROOM_Y, ParamSecondFloor.SECOND_ROOM_WIDTH, ParamSecondFloor.SECOND_ROOM_HEIGHT),
                new Dimension(ParamSecondFloor.SECOND_LITTLE_ROOM_X, ParamSecondFloor.SECOND_LITTLE_ROOM_Y, ParamSecondFloor.SECOND_LITTLE_ROOM_WIDTH, ParamSecondFloor.SECOND_LITTLE_ROOM_HEIGHT), false);

        floors.get(1).getSpecificRoom(2).setGroup(new Dimension(ParamSecondFloor.THIRD_ROOM_X, ParamSecondFloor.THIRD_ROOM_Y, ParamSecondFloor.THIRD_ROOM_WIDTH, ParamSecondFloor.THIRD_ROOM_HEIGHT),
                new Dimension(ParamSecondFloor.THIRD_LITTLE_ROOM_X, ParamSecondFloor.THIRD_LITTLE_ROOM_Y, ParamSecondFloor.THIRD_LITTLE_ROOM_WIDTH, ParamSecondFloor.THIRD_LITTLE_ROOM_HEIGHT), false);

        floors.get(1).getSpecificRoom(3).setGroup(new Dimension(ParamSecondFloor.FOURTH_ROOM_X, ParamSecondFloor.FOURTH_ROOM_Y, ParamSecondFloor.FOURTH_ROOM_WIDTH, ParamSecondFloor.FOURTH_ROOM_HEIGHT),
                new Dimension(ParamSecondFloor.FOURTH_LITTLE_ROOM_X, ParamSecondFloor.FOURTH_LITTLE_ROOM_Y, ParamSecondFloor.FOURTH_LITTLE_ROOM_WIDTH, ParamSecondFloor.FOURTH_LITTLE_ROOM_HEIGHT), false);
    }

    /**
     * Method to initialize all rooms for floors No. 3 (for the main floor rectangle)
     */
    public void initRoomsThirdFloor() {
        floors.get(2).getSpecificRoom(0).setGroup(new Dimension(ParamThirdFloor.FIRST_ROOM_X, ParamThirdFloor.FIRST_ROOM_Y, ParamThirdFloor.FIRST_ROOM_WIDTH, ParamThirdFloor.FIRST_ROOM_HEIGHT),
                new Dimension(ParamDisplay.X_MINI_MAP, ParamDisplay.Y_THIRD_LITTLE_MAP, ParamThirdFloor.FIRST_LITTLE_ROOM_WIDTH, ParamThirdFloor.FIRST_LITTLE_ROOM_HEIGHT),
                true);
    }

    /**
     * Method to initialize all the objects of the big house.
     */
    public void initObjectHomes() {
        //First floor
        Light lightFirstPlace = new Light();
        Light lightSecondPlace = new Light();
        Light lightThirdPlace = new Light();
        Light lightFourthPlace = new Light();
        Light lightFifthPlace = new Light();
        Light lightSixthPlace = new Light();
        Radiator radiatorFirst = new Radiator();
        Radiator radiatorSecond = new Radiator();
        Radiator radiatorThird = new Radiator();
        Radiator radiatorFourth = new Radiator();
        Radiator radiatorFifth = new Radiator();
        Radiator radiatorSixth = new Radiator();

        Door doorFirst = new Door();
        Door doorSecond= new Door();
        Door doorThird = new Door();
        Door doorFourth = new Door();
        Door doorFifth= new Door();


        // Code pour ajouter les objets aux pièces (room) respectives. Les objets sont dans la liste d'objet de chaque Room.
        floors.get(0).getSpecificRoom(0).addObject(lightFirstPlace);
        floors.get(0).getSpecificRoom(1).addObject(lightSecondPlace);
        floors.get(0).getSpecificRoom(2).addObject(lightThirdPlace);
        floors.get(0).getSpecificRoom(3).addObject(lightFourthPlace);
        floors.get(0).getSpecificRoom(4).addObject(lightFifthPlace);
        floors.get(0).getSpecificRoom(1).addObject(lightSixthPlace);
        floors.get(0).getSpecificRoom(0).addObject(radiatorFirst);
        floors.get(0).getSpecificRoom(1).addObject(radiatorSecond);
        floors.get(0).getSpecificRoom(1).addObject(radiatorThird);
        floors.get(0).getSpecificRoom(2).addObject(radiatorFourth);
        floors.get(0).getSpecificRoom(3).addObject(radiatorFifth);
        floors.get(0).getSpecificRoom(4).addObject(radiatorSixth);

        floors.get(0).getSpecificRoom(0).addObject(doorFirst);
        floors.get(0).getSpecificRoom(1).addObject(doorSecond);
        floors.get(0).getSpecificRoom(2).addObject(doorThird);
        floors.get(0).getSpecificRoom(3).addObject(doorFourth);
        floors.get(0).getSpecificRoom(4).addObject(doorFifth);
        // Code pour ajouter les objets à la liste des objets des étages (pour afficher tous les objets d'un étage).
        floors.get(0).addObjectHome(lightFirstPlace);
        floors.get(0).addObjectHome(lightSecondPlace);
        floors.get(0).addObjectHome(lightThirdPlace);
        floors.get(0).addObjectHome(lightFourthPlace);
        floors.get(0).addObjectHome(lightFifthPlace);
        floors.get(0).addObjectHome(lightSixthPlace);
        floors.get(0).addObjectHome(radiatorFirst);
        floors.get(0).addObjectHome(radiatorSecond);
        floors.get(0).addObjectHome(radiatorThird);
        floors.get(0).addObjectHome(radiatorFourth);
        floors.get(0).addObjectHome(radiatorFifth);
        floors.get(0).addObjectHome(radiatorSixth);

        floors.get(0).addObjectHome(doorFirst);
        floors.get(0).addObjectHome(doorSecond);
        floors.get(0).addObjectHome(doorThird);
        floors.get(0).addObjectHome(doorFourth);
        floors.get(0).addObjectHome(doorFifth);

        lightFirstPlace.setGroup(new Dimension(ParamFirstFloor.FIRST_LIGHT_X, ParamFirstFloor.FIRST_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_LIGHT_X, ParamFirstFloor.FIRST_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightSecondPlace.setGroup(new Dimension(ParamFirstFloor.SECOND_LIGHT_X, ParamFirstFloor.SECOND_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.SECOND_LITTLE_LIGHT_X, ParamFirstFloor.SECOND_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightThirdPlace.setGroup(new Dimension(ParamFirstFloor.THIRD_LIGHT_X, ParamFirstFloor.THIRD_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.THIRD_LITTLE_LIGHT_X, ParamFirstFloor.THIRD_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightFourthPlace.setGroup(new Dimension(ParamFirstFloor.FOURTH_LIGHT_X, ParamFirstFloor.FOURTH_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.FOURTH_LITTLE_LIGHT_X, ParamFirstFloor.FOURTH_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightFifthPlace.setGroup(new Dimension(ParamFirstFloor.FIFTH_LIGHT_X, ParamFirstFloor.FIFTH_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.FIFTH_LITTLE_LIGHT_X, ParamFirstFloor.FIFTH_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightSixthPlace.setGroup(new Dimension(ParamFirstFloor.SIXTH_LIGHT_X, ParamFirstFloor.SIXTH_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamFirstFloor.SIXTH_LITTLE_LIGHT_X, ParamFirstFloor.SIXTH_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);

        radiatorFirst.setGroup(new Dimension(ParamFirstFloor.FIRST_RADIATOR_X, ParamFirstFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_RADIATOR_X, ParamFirstFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        radiatorSecond.setGroup(new Dimension(ParamFirstFloor.SECOND_RADIATOR_X, ParamFirstFloor.SECOND_RADIATOR_Y),
                new Dimension(ParamFirstFloor.SECOND_LITTLE_RADIATOR_X, ParamFirstFloor.SECOND_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);
        radiatorThird.setGroup(new Dimension(ParamFirstFloor.THIRD_RADIATOR_X, ParamFirstFloor.THIRD_RADIATOR_Y),
                new Dimension(ParamFirstFloor.THIRD_LITTLE_RADIATOR_X, ParamFirstFloor.THIRD_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);
        radiatorFourth.setGroup(new Dimension(ParamFirstFloor.FOURTH_RADIATOR_X, ParamFirstFloor.FOURTH_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FOURTH_LITTLE_RADIATOR_X, ParamFirstFloor.FOURTH_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        radiatorFifth.setGroup(new Dimension(ParamFirstFloor.FIFTH_RADIATOR_X, ParamFirstFloor.FIFTH_RADIATOR_Y),
                new Dimension(ParamFirstFloor.FIFTH_LITTLE_RADIATOR_X, ParamFirstFloor.FIFTH_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        radiatorSixth.setGroup(new Dimension(ParamFirstFloor.SIXTH_RADIATOR_X, ParamFirstFloor.SIXTH_RADIATOR_Y),
                new Dimension(ParamFirstFloor.SIXTH_LITTLE_RADIATOR_X, ParamFirstFloor.SIXTH_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);

        doorFirst.setGroup(new Dimension(ParamFirstFloor.FIRST_ROOM_DOOR_X, ParamFirstFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamFirstFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamFirstFloor.FIRST_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_LANDSCAPE);
        doorSecond.setGroup(new Dimension(ParamFirstFloor.SECOND_ROOM_DOOR_X, ParamFirstFloor.SECOND_ROOM_DOOR_Y),
                new Dimension(ParamFirstFloor.SECOND_LITTLE_ROOM_DOOR_X, ParamFirstFloor.SECOND_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_PORTRAIT);
        doorThird.setGroup(new Dimension(ParamFirstFloor.THIRD_ROOM_DOOR_X, ParamFirstFloor.THIRD_ROOM_DOOR_Y),
                new Dimension(ParamFirstFloor.THIRD_LITTLE_ROOM_DOOR_X, ParamFirstFloor.THIRD_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_PORTRAIT);
        doorFourth.setGroup(new Dimension(ParamFirstFloor.FOURTH_ROOM_DOOR_X, ParamFirstFloor.FOURTH_ROOM_DOOR_Y),
                new Dimension(ParamFirstFloor.FOURTH_LITTLE_ROOM_DOOR_X, ParamFirstFloor.FOURTH_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_LANDSCAPE);
        doorFifth.setGroup(new Dimension(ParamFirstFloor.FIFTH_ROOM_DOOR_X, ParamFirstFloor.FIFTH_ROOM_DOOR_Y),
                new Dimension(ParamFirstFloor.FIFTH_LITTLE_ROOM_DOOR_X, ParamFirstFloor.FIFTH_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_LANDSCAPE);

        objectHomes.add(lightFirstPlace);
        objectHomes.add(lightSecondPlace);
        objectHomes.add(lightThirdPlace);
        objectHomes.add(lightFourthPlace);
        objectHomes.add(lightFifthPlace);
        objectHomes.add(lightSixthPlace);

        objectHomes.add(radiatorFirst);
        objectHomes.add(radiatorSecond);
        objectHomes.add(radiatorThird);
        objectHomes.add(radiatorFourth);
        objectHomes.add(radiatorFifth);
        objectHomes.add(radiatorSixth);

        objectHomes.add(doorFirst);
        objectHomes.add(doorSecond);
        objectHomes.add(doorThird);
        objectHomes.add(doorFourth);
        objectHomes.add(doorFifth);


        //Second floor
        Light lightFirstPlaceSndFloor = new Light();
        Light lightSecondPlaceSndFloor = new Light();
        Light lightThirdPlaceSndFloor = new Light();
        Light lightFourthPlaceSndFloor = new Light();

        Radiator radiatorFirstPlaceSndFloor  = new Radiator();
        Radiator radiatorSecondPlaceSndFloor  = new Radiator();
        Radiator radiatorThirdPlaceSndFloor  = new Radiator();
        Radiator radiatorFourthPlaceSndFloor  = new Radiator();

        Door doorFirstPlaceSndFloor = new Door();
        Door doorSecondPlaceSndFloor= new Door();
        Door doorThirdPlaceSndFloor = new Door();

        floors.get(1).getSpecificRoom(0).addObject(lightFirstPlaceSndFloor);
        floors.get(1).addObjectHome(lightFirstPlaceSndFloor);
        floors.get(1).getSpecificRoom(1).addObject(lightSecondPlaceSndFloor);
        floors.get(1).addObjectHome(lightSecondPlaceSndFloor);
        floors.get(1).getSpecificRoom(2).addObject(lightThirdPlaceSndFloor);
        floors.get(1).addObjectHome(lightThirdPlaceSndFloor);
        floors.get(1).getSpecificRoom(3).addObject(lightFourthPlaceSndFloor);
        floors.get(1).addObjectHome(lightFourthPlaceSndFloor);

        floors.get(1).getSpecificRoom(0).addObject(radiatorFirstPlaceSndFloor);
        floors.get(1).addObjectHome(radiatorFirstPlaceSndFloor);
        floors.get(1).getSpecificRoom(0).addObject(radiatorSecondPlaceSndFloor);
        floors.get(1).addObjectHome(radiatorSecondPlaceSndFloor);
        floors.get(1).getSpecificRoom(2).addObject(radiatorThirdPlaceSndFloor);
        floors.get(1).addObjectHome(radiatorThirdPlaceSndFloor);
        floors.get(1).getSpecificRoom(3).addObject(radiatorFourthPlaceSndFloor);
        floors.get(1).addObjectHome(radiatorFourthPlaceSndFloor);

        floors.get(1).getSpecificRoom(0).addObject(doorFirstPlaceSndFloor);
        floors.get(1).addObjectHome(doorFirstPlaceSndFloor);
        floors.get(1).getSpecificRoom(2).addObject(doorSecondPlaceSndFloor);
        floors.get(1).addObjectHome(doorSecondPlaceSndFloor);
        floors.get(1).getSpecificRoom(3).addObject(doorThirdPlaceSndFloor);
        floors.get(1).addObjectHome(doorThirdPlaceSndFloor);

        lightFirstPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.FIRST_LIGHT_X, ParamSecondFloor.FIRST_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_LIGHT_X, ParamSecondFloor.FIRST_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightSecondPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.SECOND_LIGHT_X, ParamSecondFloor.SECOND_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.SECOND_LITTLE_LIGHT_X, ParamSecondFloor.SECOND_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightThirdPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.THIRD_LIGHT_X, ParamSecondFloor.THIRD_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.THIRD_LITTLE_LIGHT_X, ParamSecondFloor.THIRD_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightFourthPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.FOURTH_LIGHT_X, ParamSecondFloor.FOURTH_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamSecondFloor.FOURTH_LITTLE_LIGHT_X, ParamSecondFloor.FOURTH_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);

        radiatorFirstPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.FIRST_RADIATOR_X, ParamSecondFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_RADIATOR_X, ParamSecondFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);
        radiatorSecondPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.SECOND_RADIATOR_X, ParamSecondFloor.SECOND_RADIATOR_Y),
                new Dimension(ParamSecondFloor.SECOND_LITTLE_RADIATOR_X, ParamSecondFloor.SECOND_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);
        radiatorThirdPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.THIRD_RADIATOR_X, ParamSecondFloor.THIRD_RADIATOR_Y),
                new Dimension(ParamSecondFloor.THIRD_LITTLE_RADIATOR_X, ParamSecondFloor.THIRD_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);
        radiatorFourthPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.FOURTH_RADIATOR_X, ParamSecondFloor.FOURTH_RADIATOR_Y),
                new Dimension(ParamSecondFloor.FOURTH_LITTLE_RADIATOR_X, ParamSecondFloor.FOURTH_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_PORTRAIT);

        doorFirstPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.FIRST_ROOM_DOOR_X, ParamSecondFloor.FIRST_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_X, ParamSecondFloor.FIRST_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_PORTRAIT);
        doorSecondPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.SECOND_ROOM_DOOR_X, ParamSecondFloor.SECOND_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.SECOND_LITTLE_ROOM_DOOR_X, ParamSecondFloor.SECOND_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_LANDSCAPE);
        doorThirdPlaceSndFloor.setGroup(new Dimension(ParamSecondFloor.THIRD_ROOM_DOOR_X, ParamSecondFloor.THIRD_ROOM_DOOR_Y),
                new Dimension(ParamSecondFloor.THIRD_LITTLE_ROOM_DOOR_X, ParamSecondFloor.THIRD_LITTLE_ROOM_DOOR_Y),ParamHome.DOOR_LANDSCAPE);

        objectHomes.add(lightFirstPlaceSndFloor);
        objectHomes.add(lightSecondPlaceSndFloor);
        objectHomes.add(lightThirdPlaceSndFloor);
        objectHomes.add(lightFourthPlaceSndFloor);

        objectHomes.add(radiatorFirstPlaceSndFloor);
        objectHomes.add(radiatorSecondPlaceSndFloor);
        objectHomes.add(radiatorThirdPlaceSndFloor);
        objectHomes.add(radiatorFourthPlaceSndFloor);

        objectHomes.add(doorFirstPlaceSndFloor);
        objectHomes.add(doorSecondPlaceSndFloor);
        objectHomes.add(doorThirdPlaceSndFloor);

//        objectHomes.add(doorFirstRoomPlaceSndFloor);

        Light lightFirstPlaceThrdFloor = new Light();
        Light lightSecondPlaceThrdFloor = new Light();

        Radiator radiatorFirstPlaceThrdFloor = new Radiator();
        Radiator radiatorSecondPlaceThrdFloor = new Radiator();
        Radiator radiatorThirdPlaceThrdFloor = new Radiator();

        floors.get(2).getSpecificRoom(0).addObject(lightFirstPlaceThrdFloor);
        floors.get(2).addObjectHome(lightFirstPlaceThrdFloor);
        floors.get(2).getSpecificRoom(0).addObject(lightSecondPlaceThrdFloor);
        floors.get(2).addObjectHome(lightSecondPlaceThrdFloor);

        floors.get(2).getSpecificRoom(0).addObject(radiatorFirstPlaceThrdFloor);
        floors.get(2).addObjectHome(radiatorFirstPlaceThrdFloor);
        floors.get(2).getSpecificRoom(0).addObject(radiatorSecondPlaceThrdFloor);
        floors.get(2).addObjectHome(radiatorSecondPlaceThrdFloor);
        floors.get(2).getSpecificRoom(0).addObject(radiatorThirdPlaceThrdFloor);
        floors.get(2).addObjectHome(radiatorThirdPlaceThrdFloor);

        lightFirstPlaceThrdFloor.setGroup(new Dimension(ParamThirdFloor.FIRST_LIGHT_X, ParamThirdFloor.FIRST_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamThirdFloor.FIRST_LITTLE_LIGHT_X, ParamThirdFloor.FIRST_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);
        lightSecondPlaceThrdFloor.setGroup(new Dimension(ParamThirdFloor.SECOND_LIGHT_X, ParamThirdFloor.SECOND_LIGHT_Y, ParamDisplay.BIG_FLOOR_RADIUS_LIGTH),
                new Dimension(ParamThirdFloor.SECOND_LITTLE_LIGHT_X, ParamThirdFloor.SECOND_LITTLE_LIGHT_Y, ParamDisplay.MINI_FLOOR_LITTLE_RADIUS_LIGTH), false);

        radiatorFirstPlaceThrdFloor.setGroup(new Dimension(ParamThirdFloor.FIRST_RADIATOR_X, ParamThirdFloor.FIRST_RADIATOR_Y),
                new Dimension(ParamThirdFloor.FIRST_LITTLE_RADIATOR_X, ParamThirdFloor.FIRST_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        radiatorSecondPlaceThrdFloor.setGroup(new Dimension(ParamThirdFloor.SECOND_RADIATOR_X, ParamThirdFloor.SECOND_RADIATOR_Y),
                new Dimension(ParamThirdFloor.SECOND_LITTLE_RADIATOR_X, ParamThirdFloor.SECOND_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);
        radiatorThirdPlaceThrdFloor.setGroup(new Dimension(ParamThirdFloor.THIRD_RADIATOR_X, ParamThirdFloor.THIRD_RADIATOR_Y),
                new Dimension(ParamThirdFloor.THIRD_LITTLE_RADIATOR_X, ParamThirdFloor.THIRD_LITTLE_RADIATOR_Y), false, ParamHome.RADIATOR_LANDSCAPE);

        objectHomes.add(lightFirstPlaceThrdFloor);
        objectHomes.add(lightSecondPlaceThrdFloor);

        objectHomes.add(radiatorFirstPlaceThrdFloor);
        objectHomes.add(radiatorSecondPlaceThrdFloor);
        objectHomes.add(radiatorThirdPlaceThrdFloor);

    }

    @Override
    public Dimension getCharacterPosition() {
        return character.getPosition();
    }

    public ArrayList<Floor> getFloors() {
        return this.floors;
    }

    @Override
    public ArrayList<ObjectHome> getObjectHomes(int floorNo) {
        return floors.get(floorNo - 1).getObjectHomes();
    }

    /**
     * Method to return the content of the main floor rectangle
     *
     * @param floorNo
     * @return ArrayList<ArrayList<Room>>
     */
    public ArrayList<Room> getMainFloor(int floorNo) {
        ArrayList<Room> rooms = new ArrayList<Room>();
        switch (floorNo) {
            case 1:
                rooms = floors.get(0).getRooms();
                mainFloorNo = 0;
                break;
            case 2:
                rooms = floors.get(1).getRooms();
                mainFloorNo = 1;
                break;
            case 3:
                rooms = floors.get(2).getRooms();
                mainFloorNo = 2;
                break;
        }
        return rooms;
    }

    @Override
    public void setCharacterPosition(double x, double y) {
        character.getPosition().setX(x);
        character.getPosition().setY(y);
    }

    public ArrayList<Room> getRooms() {
        return this.rooms;
    }

    @Override
    public ArrayList<Room> getPresence() {
        roomsNotEmpty = new ArrayList<Room>();
        if (mainFloorNo > -1) {
            for (Room room : floors.get(mainFloorNo).getRooms()) {
                if (
                        (
                                (character.getPosition().getX() > room.getPosition().getX() && character.getPosition().getX() < room.getPosition().getX() + room.getPosition().getWidth()) ||
                                        (character.getPosition().getX() + character.getPosition().getWidth() > room.getPosition().getX() && character.getPosition().getX() + character.getPosition().getWidth() < room.getPosition().getX() + room.getPosition().getWidth())
                        ) &&
                                (
                                        (character.getPosition().getY() > room.getPosition().getY() && character.getPosition().getY() < room.getPosition().getY() + room.getPosition().getHeight()) ||
                                                (character.getPosition().getY() + character.getPosition().getHeight() > room.getPosition().getY() && character.getPosition().getY() + character.getPosition().getHeight() < room.getPosition().getY() + room.getPosition().getHeight())
                                )
                        ) {
                    if (room.getRoomName() == RoomsEnum.ROOM.ENTREE_1) {
                        if (character.getPosition().getX() > floors.get(0).getSpecificRoom(5).getPosition().getX() + floors.get(0).getSpecificRoom(5).getPosition().getWidth() ||
                                character.getPosition().getX() + character.getPosition().getWidth() > floors.get(0).getSpecificRoom(5).getPosition().getX() + floors.get(0).getSpecificRoom(5).getPosition().getWidth()) {
                            roomsNotEmpty.add(room);
                        }
                    } else if (room.getRoomName() == RoomsEnum.ROOM.SALON_1) {
                        if (character.getPosition().getX() > floors.get(0).getSpecificRoom(4).getPosition().getX() + floors.get(0).getSpecificRoom(4).getPosition().getWidth() ||
                                character.getPosition().getX() + character.getPosition().getWidth() > floors.get(0).getSpecificRoom(4).getPosition().getX() + floors.get(0).getSpecificRoom(4).getPosition().getWidth() ||
                                character.getPosition().getY() < floors.get(0).getSpecificRoom(4).getPosition().getY()) {
                            roomsNotEmpty.add(room);
                        }
                    } else {
                        roomsNotEmpty.add(room);
                    }
                }
            }
        }
        return roomsNotEmpty;
    }

    @Override
    public void setObjectsOn() {
        for (Room room : roomsNotEmpty) {
            room.turnOnObjects();
        }
    }

    @Override
    public void setObjectsOff() {
        for (Room room : rooms) {
            room.turnOffObjects();
        }
    }

    @Override
    public void setObjectsOn(int roomID) {
        if (floors.get(mainFloorNo).getRooms().size() > roomID) {
            floors.get(mainFloorNo).getSpecificRoom(roomID).turnOnObjects();
        }
    }

    public int getObjectsOn() {
        int objectOn = 0;
        for(ObjectHome oh : objectHomes) {
            if (oh.isState()) {
                objectOn++;
            }
        }
        return objectOn;
    }

    public int getCharacterOrientation() {
        return this.character.getOrientation();
    }

    public void setCharacterOrientation(int orientation) {
        this.character.setOrientation(orientation);
    }

}

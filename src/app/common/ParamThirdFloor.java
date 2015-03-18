package app.common;

/**
 * Created by Thomas on 17/03/15.
 */
public class ParamThirdFloor {

    //Constants for the first room of the first floor
    public static final int FIRST_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH;
    public static final int FIRST_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT;
    public static final int FIRST_ROOM_X = ParamDisplay.MAIN_FLOOR_DISPLAYED_X;
    public static final int FIRST_ROOM_Y = ParamDisplay.MAIN_FLOOR_DISPLAYED_Y;

    public static final int FIRST_LITTLE_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/4;
    public static final int FIRST_LITTLE_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/4;
    public static final int FIRST_LITTLE_ROOM_X = ParamDisplay.SECONDARY_FLOORS_BLOCK_X;
    public static final int FIRST_LITTLE_ROOM_Y = ParamDisplay.SECONDARY_FLOORS_BLOCK_Y;



    public static final int FIRST_LIGHT_X = (FIRST_ROOM_WIDTH / 3) + FIRST_ROOM_X;
    public static final int FIRST_LIGHT_Y = (FIRST_ROOM_HEIGHT / 2) + FIRST_ROOM_Y;

    public static final int SECOND_LIGHT_X =((FIRST_ROOM_WIDTH / 3)*2) + FIRST_ROOM_X;
    public static final int SECOND_LIGHT_Y = (FIRST_ROOM_HEIGHT / 2) + FIRST_ROOM_Y;


    public static final int FIRST_LITTLE_LIGHT_X = (FIRST_LITTLE_ROOM_WIDTH / 3) + ParamDisplay.X_MINI_MAP;
    public static final int FIRST_LITTLE_LIGHT_Y = (FIRST_LITTLE_ROOM_HEIGHT / 2) + ParamDisplay.Y_THIRD_LITTLE_MAP;

    public static final int SECOND_LITTLE_LIGHT_X =((FIRST_LITTLE_ROOM_WIDTH / 3)*2) + ParamDisplay.X_MINI_MAP;
    public static final int SECOND_LITTLE_LIGHT_Y = (FIRST_LITTLE_ROOM_HEIGHT / 2) + ParamDisplay.Y_THIRD_LITTLE_MAP;
}

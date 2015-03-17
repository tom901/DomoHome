package app.common;

/**
 * Created by Thomas on 17/03/15.
 */
public class ParamSecondFloor {

    //Constants for the first room of the first floor
    public static final int FIRST_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3;
    public static final int FIRST_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT;
    public static final int FIRST_ROOM_X = ParamDisplay.MAIN_FLOOR_DISPLAYED_X;
    public static final int FIRST_ROOM_Y = ParamDisplay.MAIN_FLOOR_DISPLAYED_Y;

    //Constants for the Second room of the first floor
    public static final int SECOND_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3*2;
    public static final int SECOND_ROOM_HEIGHT =ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/2;
    public static final int SECOND_ROOM_X = FIRST_ROOM_WIDTH+FIRST_ROOM_X;
    public static final int SECOND_ROOM_Y = FIRST_ROOM_Y;

    //Constants for the Third room of the first floor
    public static final int THIRD_ROOM_WIDTH = SECOND_ROOM_WIDTH/2;
    public static final int THIRD_ROOM_HEIGHT = SECOND_ROOM_HEIGHT;
    public static final int THIRD_ROOM_X = SECOND_ROOM_X;
    public static final int THIRD_ROOM_Y = SECOND_ROOM_HEIGHT+SECOND_ROOM_Y;

    //Constants for the Fourth room of the first floor
    public static final int FOURTH_ROOM_WIDTH = SECOND_ROOM_WIDTH/2;
    public static final int FOURTH_ROOM_HEIGHT = SECOND_ROOM_HEIGHT;
    public static final int FOURTH_ROOM_X = THIRD_ROOM_X+THIRD_ROOM_WIDTH;
    public static final int FOURTH_ROOM_Y = THIRD_ROOM_Y;


}

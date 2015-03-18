package app.common;

/**
 * Created by Thomas on 17/03/15.
 */
public class ParamFirstFloor {

    //Constants for the first room of the first floor
    public static final int FIRST_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int FIRST_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FIRST_ROOM_X = ParamDisplay.MAIN_FLOOR_DISPLAYED_X;
    public static final int FIRST_ROOM_Y = ParamDisplay.MAIN_FLOOR_DISPLAYED_Y;

    //Constants for the Second room of the first floor
    public static final int SECOND_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int SECOND_ROOM_HEIGHT =ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT;
    public static final int SECOND_ROOM_X = FIRST_ROOM_WIDTH+FIRST_ROOM_X;
    public static final int SECOND_ROOM_Y = FIRST_ROOM_Y;

    //Constants for the Third room of the first floor
    public static final int THIRD_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int THIRD_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int THIRD_ROOM_X = FIRST_ROOM_X;
    public static final int THIRD_ROOM_Y = FIRST_ROOM_HEIGHT+FIRST_ROOM_Y;

    //Constants for the Fourth room of the first floor
    public static final int FOURTH_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3;
    public static final int FOURTH_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FOURTH_ROOM_X = FIRST_ROOM_X;
    public static final int FOURTH_ROOM_Y = THIRD_ROOM_Y+THIRD_ROOM_HEIGHT;

    //Constants for the Fifth room of the first floor
    public static final int FIFTH_ROOM_WIDTH = ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3;
    public static final int FIFTH_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FIFTH_ROOM_X = FOURTH_ROOM_WIDTH+FOURTH_ROOM_X;
    public static final int FIFTH_ROOM_Y = THIRD_ROOM_Y+THIRD_ROOM_HEIGHT;

    //Constants for the Garden room of the first floor
    public static final int GARDEN_ROOM_WIDTH = THIRD_ROOM_WIDTH/5;
    public static final int GARDEN_ROOM_HEIGHT = THIRD_ROOM_HEIGHT;
    public static final int GARDEN_ROOM_X = FIRST_ROOM_Y;
    public static final int GARDEN_ROOM_Y = FIRST_ROOM_HEIGHT+ParamDisplay.MAIN_FLOOR_DISPLAYED_Y;

    //Constantes for all rool for mini floors
    //Constants for the first room of the first floor
    public static final int FIRST_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2)/4;
    public static final int FIRST_LITTLE_ROOM_HEIGHT = (ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3)/4;
    public static final int FIRST_LITTLE_ROOM_X = ParamDisplay.X_MINI_MAP;
    public static final int FIRST_LITTLE_ROOM_Y = ParamDisplay.Y_FIRST_LITTLE_MAP;

    //Constants for the Second room of the first floor
    public static final int SECOND_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2)/4;
    public static final int SECOND_LITTLE_ROOM_HEIGHT = (ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)/4;
    public static final int SECOND_LITTLE_ROOM_X = FIRST_LITTLE_ROOM_X+FIRST_LITTLE_ROOM_WIDTH;
    public static final int SECOND_LITTLE_ROOM_Y = ParamDisplay.Y_FIRST_LITTLE_MAP;

    //Constants for the Third room of the first floor
    public static final int THIRD_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/2)/4;
    public static final int THIRD_LITTLE_ROOM_HEIGHT = (ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3)/4;
    public static final int THIRD_LITTLE_ROOM_X = FIRST_LITTLE_ROOM_X;
    public static final int THIRD_LITTLE_ROOM_Y = FIRST_LITTLE_ROOM_HEIGHT+FIRST_LITTLE_ROOM_Y;

    //Constants for the Fourth room of the first floor
    public static final int FOURTH_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3)/4;
    public static final int FOURTH_LITTLE_ROOM_HEIGHT = (ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3)/4;
    public static final int FOURTH_LITTLE_ROOM_X = FIRST_LITTLE_ROOM_X;
    public static final int FOURTH_LITTLE_ROOM_Y = ParamDisplay.Y_FIRST_LITTLE_MAP+THIRD_LITTLE_ROOM_HEIGHT*2;

    //Constants for the Fifth room of the first floor
    public static final int FIFTH_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3)/4;
    public static final int FIFTH_LITTLE_ROOM_HEIGHT =( ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/3)/4;
    public static final int FIFTH_LITTLE_ROOM_X = FOURTH_LITTLE_ROOM_WIDTH+FOURTH_LITTLE_ROOM_X;
    public static final int FIFTH_LITTLE_ROOM_Y = ParamDisplay.Y_FIRST_LITTLE_MAP+THIRD_LITTLE_ROOM_HEIGHT*2;

    //Constants for the Garden room of the first floor
    public static final int GARDEN_LITTLE_ROOM_WIDTH = (THIRD_ROOM_WIDTH/5)/4;
    public static final int GARDEN_LITTLE_HEIGHT = THIRD_LITTLE_ROOM_HEIGHT;
    public static final int GARDEN_LITTLE_ROOM_X = FIRST_LITTLE_ROOM_X;
    public static final int GARDEN_LITTLE_ROOM_Y = FIRST_LITTLE_ROOM_HEIGHT+FIRST_LITTLE_ROOM_Y;

    //Constants for the objects house

    public static final int FIRST_LIGHT_X = (FIRST_ROOM_WIDTH / 2) + FIRST_ROOM_X;
    public static final int FIRST_LIGHT_Y = (FIRST_ROOM_HEIGHT / 2) + FIRST_ROOM_Y;

    //Light of room 2
    public static final int SECOND_LIGHT_X =(SECOND_ROOM_WIDTH / 2) + SECOND_ROOM_X;
    public static final int SECOND_LIGHT_Y = (SECOND_ROOM_HEIGHT / 3) + SECOND_ROOM_Y;

    public static final int THIRD_LIGHT_X =(THIRD_ROOM_WIDTH / 2)+THIRD_ROOM_X;
    public static final int THIRD_LIGHT_Y = (THIRD_ROOM_HEIGHT / 2)+THIRD_ROOM_Y;

    public static final int FOURTH_LIGHT_X =(FOURTH_ROOM_WIDTH / 2)+ FOURTH_ROOM_X;
    public static final int FOURTH_LIGHT_Y = (FOURTH_ROOM_HEIGHT / 2)+ FOURTH_ROOM_Y;

    public static final int FIFTH_LIGHT_X =(FIFTH_ROOM_WIDTH / 2)+ FIFTH_ROOM_X ;
    public static final int FIFTH_LIGHT_Y = (FIFTH_ROOM_HEIGHT / 2)+ FIFTH_ROOM_Y;

    //Light of room 2
    public static final int SIXTH_LIGHT_X =(SECOND_ROOM_WIDTH / 2) + SECOND_ROOM_X + 20;
    public static final int SIXTH_LIGHT_Y = (FIFTH_ROOM_HEIGHT / 2)+ FIFTH_ROOM_Y;

    //Constant for the objects house mini map
    public static final int FIRST_LITTLE_LIGHT_X = (FIRST_LITTLE_ROOM_WIDTH / 2) + FIRST_LITTLE_ROOM_X;
    public static final int FIRST_LITTLE_LIGHT_Y = (FIRST_LITTLE_ROOM_HEIGHT / 2) + FIRST_LITTLE_ROOM_Y;

    //Light of room 2
    public static final int SECOND_LITTLE_LIGHT_X =(SECOND_LITTLE_ROOM_WIDTH / 2) + SECOND_LITTLE_ROOM_X;
    public static final int SECOND_LITTLE_LIGHT_Y = (SECOND_LITTLE_ROOM_HEIGHT / 3) + SECOND_LITTLE_ROOM_Y;

    public static final int THIRD_LITTLE_LIGHT_X =(THIRD_LITTLE_ROOM_WIDTH / 2)+THIRD_LITTLE_ROOM_X;
    public static final int THIRD_LITTLE_LIGHT_Y = (THIRD_LITTLE_ROOM_HEIGHT / 2)+THIRD_LITTLE_ROOM_Y;

    public static final int FOURTH_LITTLE_LIGHT_X =(FOURTH_LITTLE_ROOM_WIDTH / 2)+ FOURTH_LITTLE_ROOM_X;
    public static final int FOURTH_LITTLE_LIGHT_Y = (FOURTH_LITTLE_ROOM_HEIGHT / 2)+ FOURTH_LITTLE_ROOM_Y;

    public static final int FIFTH_LITTLE_LIGHT_X =(FIFTH_LITTLE_ROOM_WIDTH / 2)+ FIFTH_LITTLE_ROOM_X ;
    public static final int FIFTH_LITTLE_LIGHT_Y = (FIFTH_LITTLE_ROOM_HEIGHT / 2)+ FIFTH_LITTLE_ROOM_Y;

    //Light of room 2
    public static final int SIXTH_LITTLE_LIGHT_X =(SECOND_LITTLE_ROOM_WIDTH / 2) + SECOND_LITTLE_ROOM_X + 10;
    public static final int SIXTH_LITTLE_LIGHT_Y = (FIFTH_LITTLE_ROOM_HEIGHT / 2)+ FIFTH_LITTLE_ROOM_Y;
}

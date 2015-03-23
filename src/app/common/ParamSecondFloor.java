package app.common;

/**
 * Created by Thomas on 17/03/15.
 */
public class ParamSecondFloor {
    //All constante for the big floor
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

    //All constante for the mini Floor
    //Constants for the first room of the first floor
    public static final int FIRST_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3)/4;
    public static final int FIRST_LITTLE_ROOM_HEIGHT = ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/4;
    public static final int FIRST_LITTLE_ROOM_X = ParamDisplay.X_MINI_MAP;
    public static final int FIRST_LITTLE_ROOM_Y = ParamDisplay.Y_SECOND_LITTLE_MAP;

    //Constants for the Second room of the first floor
    public static final int SECOND_LITTLE_ROOM_WIDTH = (ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH/3*2)/4;
    public static final int SECOND_LITTLE_ROOM_HEIGHT =(ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT/2)/4;
    public static final int SECOND_LITTLE_ROOM_X = FIRST_LITTLE_ROOM_WIDTH+FIRST_LITTLE_ROOM_X;
    public static final int SECOND_LITTLE_ROOM_Y = FIRST_LITTLE_ROOM_Y ;

    //Constants for the Third room of the first floor
    public static final int THIRD_LITTLE_ROOM_WIDTH = (SECOND_ROOM_WIDTH/2)/4;
    public static final int THIRD_LITTLE_ROOM_HEIGHT = SECOND_ROOM_HEIGHT/4;
    public static final int THIRD_LITTLE_ROOM_X = SECOND_LITTLE_ROOM_X;
    public static final int THIRD_LITTLE_ROOM_Y = SECOND_LITTLE_ROOM_HEIGHT+SECOND_LITTLE_ROOM_Y;

    //Constants for the Fourth room of the first floor
    public static final int FOURTH_LITTLE_ROOM_WIDTH = (SECOND_ROOM_WIDTH/2)/4;
    public static final int FOURTH_LITTLE_ROOM_HEIGHT = SECOND_ROOM_HEIGHT/4;
    public static final int FOURTH_LITTLE_ROOM_X = THIRD_LITTLE_ROOM_X+THIRD_LITTLE_ROOM_WIDTH;
    public static final int FOURTH_LITTLE_ROOM_Y = THIRD_LITTLE_ROOM_Y;



    public static final int FIRST_LIGHT_X = (FIRST_ROOM_WIDTH / 2) + FIRST_ROOM_X;
    public static final int FIRST_LIGHT_Y = (FIRST_ROOM_HEIGHT / 2) + FIRST_ROOM_Y;

    public static final int SECOND_LIGHT_X =(SECOND_ROOM_WIDTH / 2) + SECOND_ROOM_X;
    public static final int SECOND_LIGHT_Y = (SECOND_ROOM_HEIGHT / 2) + SECOND_ROOM_Y;

    public static final int THIRD_LIGHT_X =(THIRD_ROOM_WIDTH / 2)+THIRD_ROOM_X;
    public static final int THIRD_LIGHT_Y = (THIRD_ROOM_HEIGHT / 2)+THIRD_ROOM_Y;

    public static final int FOURTH_LIGHT_X =(FOURTH_ROOM_WIDTH / 2)+ FOURTH_ROOM_X;
    public static final int FOURTH_LIGHT_Y = (FOURTH_ROOM_HEIGHT / 2)+ FOURTH_ROOM_Y;

    //Constant for the objects house mini map
    public static final int FIRST_LITTLE_LIGHT_X = (FIRST_LITTLE_ROOM_WIDTH / 2) + FIRST_LITTLE_ROOM_X;
    public static final int FIRST_LITTLE_LIGHT_Y = (FIRST_LITTLE_ROOM_HEIGHT / 2) + FIRST_LITTLE_ROOM_Y;

    public static final int SECOND_LITTLE_LIGHT_X =(SECOND_LITTLE_ROOM_WIDTH / 2) + SECOND_LITTLE_ROOM_X;
    public static final int SECOND_LITTLE_LIGHT_Y = (SECOND_LITTLE_ROOM_HEIGHT / 3) + SECOND_LITTLE_ROOM_Y;

    public static final int THIRD_LITTLE_LIGHT_X =(THIRD_LITTLE_ROOM_WIDTH / 2)+THIRD_LITTLE_ROOM_X;
    public static final int THIRD_LITTLE_LIGHT_Y = (THIRD_LITTLE_ROOM_HEIGHT / 2)+THIRD_LITTLE_ROOM_Y;

    public static final int FOURTH_LITTLE_LIGHT_X =(FOURTH_LITTLE_ROOM_WIDTH / 2)+ FOURTH_LITTLE_ROOM_X;
    public static final int FOURTH_LITTLE_LIGHT_Y = (FOURTH_LITTLE_ROOM_HEIGHT / 2)+ FOURTH_LITTLE_ROOM_Y;

    //Radiator BIG
    public static final int FIRST_RADIATOR_X = FIRST_ROOM_X ;
    public static final int FIRST_RADIATOR_Y = FIRST_ROOM_Y + FIRST_ROOM_HEIGHT/4;

    public static final int SECOND_RADIATOR_X = FIRST_ROOM_X +FIRST_ROOM_WIDTH - ParamHome.RADIATOR_PORTRAIT_WIDTH;
    public static final int SECOND_RADIATOR_Y = FIRST_ROOM_Y+ ((FIRST_ROOM_HEIGHT/4)*3);

    public static final int THIRD_RADIATOR_X = THIRD_ROOM_X + THIRD_ROOM_WIDTH - ParamHome.RADIATOR_PORTRAIT_WIDTH;
    public static final int THIRD_RADIATOR_Y = SECOND_RADIATOR_Y;

    public static final int FOURTH_RADIATOR_X = FOURTH_ROOM_X + FOURTH_ROOM_WIDTH - ParamHome.RADIATOR_PORTRAIT_WIDTH;
    public static final int FOURTH_RADIATOR_Y = SECOND_RADIATOR_Y;

    //Radiator Mini
    public static final int FIRST_LITTLE_RADIATOR_X = FIRST_LITTLE_ROOM_X;
    public static final int FIRST_LITTLE_RADIATOR_Y = FIRST_LITTLE_ROOM_Y + FIRST_LITTLE_ROOM_WIDTH/4;

    public static final int SECOND_LITTLE_RADIATOR_X = FIRST_LITTLE_ROOM_X +FIRST_LITTLE_ROOM_WIDTH - ParamHome.RADIATOR_MINI_PORTRAIT_WIDTH;
    public static final int SECOND_LITTLE_RADIATOR_Y = FIRST_LITTLE_ROOM_Y+ ((FIRST_LITTLE_ROOM_HEIGHT/4)*3);

    public static final int THIRD_LITTLE_RADIATOR_X = THIRD_LITTLE_ROOM_X + THIRD_LITTLE_ROOM_WIDTH - ParamHome.RADIATOR_MINI_PORTRAIT_WIDTH;
    public static final int THIRD_LITTLE_RADIATOR_Y = SECOND_LITTLE_RADIATOR_Y;

    public static final int FOURTH_LITTLE_RADIATOR_X = FOURTH_LITTLE_ROOM_X + FOURTH_LITTLE_ROOM_WIDTH - ParamHome.RADIATOR_MINI_PORTRAIT_WIDTH;
    public static final int FOURTH_LITTLE_RADIATOR_Y = SECOND_LITTLE_RADIATOR_Y ;

    //Door of room
    public static final int FIRST_DOOR_X = FIRST_ROOM_WIDTH;
    public static final int FIRST_ROOM_DOOR_Y = FIRST_ROOM_HEIGHT /4 ;
    public static final int FIRST_DOOR_WIDTH = FIRST_ROOM_WIDTH / 6;
    public static final int FIRST_DOOR_HEIGHT = FIRST_ROOM_HEIGHT / 6;

    public static final int THIRD_ROOM_DOOR_X = (SECOND_ROOM_WIDTH / 2) + (FIRST_ROOM_HEIGHT/4);
    public static final int THIRD_ROOM_DOOR_Y = SECOND_ROOM_HEIGHT ;
    public static final int THIRD_DOOR_WIDTH = SECOND_ROOM_WIDTH / 6;
    public static final int THIRD_DOOR_HEIGHT = SECOND_ROOM_HEIGHT / 8;

    public static final int FOURTH_ROOM_DOOR_X = (SECOND_ROOM_WIDTH / 5) + (FIRST_ROOM_HEIGHT);
    public static final int FOURTH_ROOM_DOOR_Y = THIRD_ROOM_HEIGHT;
    public static final int FOURTH_DOOR_WIDTH = THIRD_ROOM_WIDTH / 3;
    public static final int FOURTH_DOOR_HEIGHT = THIRD_ROOM_HEIGHT / 6;

    // Mini Door of room
    public static final int FIRST_LITTLE_ROOM_DOOR_X = FIRST_LITTLE_ROOM_WIDTH ;
    public static final int FIRST_LITTLE_ROOM_DOOR_Y = SECOND_LITTLE_ROOM_Y /4;
    public static final int FIRST_LITTLE_DOOR_WIDTH = SECOND_LITTLE_ROOM_WIDTH /6;
    public static final int FIRST_LITTLE_DOOR_HEIGHT = SECOND_LITTLE_ROOM_HEIGHT / 4 ;

    public static final int THIRD_LITTLE_ROOM_DOOR_X = SECOND_LITTLE_ROOM_X +FIRST_LITTLE_ROOM_WIDTH - ParamHome.RADIATOR_MINI_PORTRAIT_WIDTH;
    public static final int THIRD_LITTLE_ROOM_DOOR_Y = SECOND_LITTLE_ROOM_Y /4 ;
    public static final int THIRD_LITTLE_DOOR_WIDTH = THIRD_LITTLE_ROOM_WIDTH /6;
    public static final int THIRD_LITTLE_DOOR_HEIGHT = THIRD_LITTLE_ROOM_HEIGHT /6 ;
}

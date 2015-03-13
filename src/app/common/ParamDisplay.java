package app.common;

/**
 * Created by Thomas on 06/03/15.
 */
//Classe for handler all constante of the application display
public class ParamDisplay {

    //Constants for the first block display on the application
    /*public static final int MAIN_FLOOR_DISPLAYED_X = 50;
    public static final int MAIN_FLOOR_DISPLAYED_Y = 50;*/
    public static final int MAIN_FLOOR_DISPLAYED_X = 5;
    public static final int MAIN_FLOOR_DISPLAYED_Y = 5;
    public static final int MAIN_FLOOR_DISPLAYED_WIDTH = 590;
    public static final int MAIN_FLOOR_DISPLAYED_HEIGHT = 400;
   /* public static final int MAIN_FLOOR_DISPLAYED_WIDTH = 290;
    public static final int MAIN_FLOOR_DISPLAYED_HEIGHT = 200;*/
    //Constants for the second block display on the application
    public static final int SECONDARY_FLOORS_BLOCK_X = 600;
    public static final int SECONDARY_FLOORS_BLOCK_Y = 5;
    public static final int SECONDARY_FLOORS_BLOCK_WIDTH = 190;
    public static final int SECONDARY_FLOORS_BLOCK_HEIGHT = 400;

    //Constants for the third block display on the application
    public static final int INDICATORS_BLOCK_X = 5;
    public static final int INDICATORS_BLOCK_Y = 408;
    public static final int INDICATORS_BLOCK_WIDTH = 590;
    public static final int INDICATORS_BLOCK_HEIGHT = 180;

    //Constants for the fourth block display on the application
    public static final int LEGEND_BLOCK_X = 600;
    public static final int LEGEND_BLOCK_Y = 408;
    public static final int LEGEND_BLOCK_WIDTH = 190;
    public static final int LEGEND_BLOCK_HEIGHT = 180;

    //Constants for the first room of the first floor
    public static final int FIRST_ROOM_WIDTH = MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int FIRST_ROOM_HEIGHT = MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FIRST_ROOM_X = MAIN_FLOOR_DISPLAYED_X;
    public static final int FIRST_ROOM_Y = MAIN_FLOOR_DISPLAYED_Y;

    //Constants for the Second room of the first floor
    public static final int SECOND_ROOM_WIDTH = MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int SECOND_ROOM_HEIGHT = MAIN_FLOOR_DISPLAYED_HEIGHT;
    public static final int SECOND_ROOM_X = FIRST_ROOM_WIDTH+FIRST_ROOM_X;
    public static final int SECOND_ROOM_Y = FIRST_ROOM_Y;

    //Constants for the Third room of the first floor
    public static final int THIRD_ROOM_WIDTH = MAIN_FLOOR_DISPLAYED_WIDTH/2;
    public static final int THIRD_ROOM_HEIGHT = MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int THIRD_ROOM_X = MAIN_FLOOR_DISPLAYED_X;
    public static final int THIRD_ROOM_Y = FIRST_ROOM_HEIGHT+MAIN_FLOOR_DISPLAYED_Y;

    //Constants for the Fourth room of the first floor
    public static final int FOURTH_ROOM_WIDTH = MAIN_FLOOR_DISPLAYED_WIDTH/3;
    public static final int FOURTH_ROOM_HEIGHT = MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FOURTH_ROOM_X = MAIN_FLOOR_DISPLAYED_X;
    public static final int FOURTH_ROOM_Y = THIRD_ROOM_Y+THIRD_ROOM_HEIGHT;

    //Constants for the Fifth room of the first floor
    public static final int FIFTH_ROOM_WIDTH = MAIN_FLOOR_DISPLAYED_WIDTH/3;
    public static final int FIFTH_ROOM_HEIGHT = MAIN_FLOOR_DISPLAYED_HEIGHT/3;
    public static final int FIFTH_ROOM_X = FOURTH_ROOM_WIDTH+FOURTH_ROOM_X;
    public static final int FIFTH_ROOM_Y = THIRD_ROOM_Y+THIRD_ROOM_HEIGHT;

    //Constants for the Garden room of the first floor
    public static final int GARDEN_ROOM_WIDTH = THIRD_ROOM_WIDTH/5;
    public static final int GARDEN_ROOM_HEIGHT = THIRD_ROOM_HEIGHT;
    public static final int GARDEN_ROOM_X = MAIN_FLOOR_DISPLAYED_X;
    public static final int GARDEN_ROOM_Y = FIRST_ROOM_HEIGHT+MAIN_FLOOR_DISPLAYED_Y;

    public static final int FIRST_LIGHT_X = FIRST_ROOM_WIDTH/2;
    public static final int FIRST_LIGHT_Y =FIRST_ROOM_HEIGHT/2;

    public static final int SECOND_LIGHT_X = SECOND_ROOM_WIDTH/2;
    public static final int SECOND_LIGHT_Y =SECOND_ROOM_HEIGHT/2;

}

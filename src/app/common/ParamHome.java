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
package app.common;

/**
 * Created by Thomas on 06/03/15.
 */
//Classe for the parameters of floor, room of the house
public class ParamHome {

    public static final int DOOR_PORTRAIT = 0;
    public static final int DOOR_LANDSCAPE = 1;


    public static final int DOOR_WIDTH_LANDSCAPE = 50;
    public static final int DOOR_HEIGHT_LANDSCAPE= 20;

    public static final int DOOR_LITTLE_WIDTH_LANDSCAPE = DOOR_WIDTH_LANDSCAPE / 3;
    public static final int DOOR_LITTLE_HEIGHT_LANDSCAPE= DOOR_HEIGHT_LANDSCAPE / 3;

    public static final int DOOR_WIDTH_PORTRAIT = 20;
    public static final int DOOR_HEIGHT_PORTRAIT= 50;

    public static final int DOOR_LITTLE_WIDTH_PORTRAIT = DOOR_WIDTH_PORTRAIT / 3;
    public static final int DOOR_LITTLE_HEIGHT_PORTRAIT= DOOR_HEIGHT_PORTRAIT / 3;

    public static final int RADIATOR_LANDSCAPE_WIDTH = 40;
    public static final int RADIATOR_LANDSCAPE_HEIGHT= 10;

    public static final int RADIATOR_PORTRAIT_WIDTH = 10;
    public static final int RADIATOR_PORTRAIT_HEIGHT= 40;

    public static final int RADIATOR_MINI_LANDSCAPE_WIDTH = 10;
    public static final int RADIATOR_MINI_LANDSCAPE_HEIGHT= 5;

    public static final int RADIATOR_MINI_PORTRAIT_WIDTH = 5;
    public static final int RADIATOR_MINI_PORTRAIT_HEIGHT= 10;


    public static final int RADIATOR_PORTRAIT = 0;
    public static final int RADIATOR_LANDSCAPE = 1;

    public static final int STAIR_WIDTH = 150;
    public static final int STAIR_HEIGHT = 40;

    public static final int STAIR_LITTLE_WIDTH = STAIR_WIDTH/3;
    public static final int STAIR_LITTLE_HEIGHT = STAIR_HEIGHT/3;

    //Param for The stair Big
    public static final int FIRST_STAIR_X = ParamFirstFloor.SECOND_ROOM_X ;
    public static final int FIRST_STAIR_Y =  ParamFirstFloor.SECOND_ROOM_Y;

    //Param for The stair Mini
    public static final int FIRST_LITTLE_STAIR_X =  ParamFirstFloor.SECOND_LITTLE_ROOM_X ;
    public static final int FIRST_LITTLE_STAIR_Y =  ParamDisplay.Y_FIRST_LITTLE_MAP;

    public static final int SECOND_LITTLE_STAIR_X =  ParamFirstFloor.SECOND_LITTLE_ROOM_X ;
    public static final int SECOND_LITTLE_STAIR_Y =  ParamDisplay.Y_SECOND_LITTLE_MAP;

    public static final int THIRD_LITTLE_STAIR_X =  ParamFirstFloor.SECOND_LITTLE_ROOM_X ;
    public static final int THIRD_LITTLE_STAIR_Y =  ParamDisplay.Y_THIRD_LITTLE_MAP;
}

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
//Classe for handler all constante of the application display
public class ParamDisplay {

    public static final int CHARACTER_WIDTH = 15;
    public static final int CHARACTER_HEIGHT = 30;

    //Constants for the first block display on the application
    /*public static final int MAIN_FLOOR_DISPLAYED_X = 50;
    public static final int MAIN_FLOOR_DISPLAYED_Y = 50;*/
    public static final int MAIN_FLOOR_DISPLAYED_X = 5;
    public static final int MAIN_FLOOR_DISPLAYED_Y = 5;
    public static final int MAIN_FLOOR_DISPLAYED_WIDTH = 590;
    public static final int MAIN_FLOOR_DISPLAYED_HEIGHT = 396;
    /* public static final int MAIN_FLOOR_DISPLAYED_WIDTH = 290;
     public static final int MAIN_FLOOR_DISPLAYED_HEIGHT = 200;*/
    //Constants for the second block display on the application
    public static final int SECONDARY_FLOORS_BLOCK_X = 600;
    public static final int SECONDARY_FLOORS_BLOCK_Y = 5;
    public static final int SECONDARY_FLOORS_BLOCK_WIDTH = 190;
    public static final int SECONDARY_FLOORS_BLOCK_HEIGHT = 396;

    //Constants for the third block display on the application
    public static final int INDICATORS_BLOCK_X = 5;
    public static final int INDICATORS_BLOCK_Y = 406;
    public static final int INDICATORS_BLOCK_WIDTH = 590;
    public static final int INDICATORS_BLOCK_HEIGHT = 200;

    //Constants for the fourth block display on the application
    public static final int LEGEND_BLOCK_X = 600;
    public static final int LEGEND_BLOCK_Y = 406;
    public static final int LEGEND_BLOCK_WIDTH = 190;
    public static final int LEGEND_BLOCK_HEIGHT = 200;

    //Constante for the mini map of floors
    public static final int X_MINI_MAP = SECONDARY_FLOORS_BLOCK_X + 15;
    public static final int Y_FIRST_LITTLE_MAP = SECONDARY_FLOORS_BLOCK_Y + 5;
    public static final int Y_SECOND_LITTLE_MAP = Y_FIRST_LITTLE_MAP + 130;
    public static final int Y_THIRD_LITTLE_MAP = Y_SECOND_LITTLE_MAP + 150;

    public static final int BIG_FLOOR_RADIUS_LIGTH = 15;
    public static final int MINI_FLOOR_LITTLE_RADIUS_LIGTH = 5;

    //Constants for the legend
    public static final int LEGEND_RADIUS_LIGHT = 10;
    public static final int LEGEND_LABEL_X = LEGEND_BLOCK_X + 5;
    public static final int LEGEND_LABEL_Y = LEGEND_BLOCK_Y + 5;

    //Constants for the legend Light
    public static final int LEGEND_LIGHT_ON_X = LEGEND_LABEL_X + 15;
    public static final int LEGEND_LIGHT_ON_Y = LEGEND_LABEL_Y + 30;
    public static final int LEGEND_LIGHT_OFF_X = LEGEND_LIGHT_ON_X + 25;
    public static final int LEGEND_LIGHT_OFF_Y = LEGEND_LIGHT_ON_Y;
    public static final int LEGEND_LIGHT_LABEL_X = LEGEND_LIGHT_OFF_X + 20;
    public static final int LEGEND_LIGHT_LABEL_Y = LEGEND_LIGHT_OFF_Y - 5;
    //Constants for the legend Radiator
    public static final int LEGEND_RADIATOR_WIDTH= 20;
    public static final int LEGEND_RADIATOR_HEIGHT= 10;

    public static final int LEGEND_RADIATOR_ON_X = LEGEND_BLOCK_X + 10  ;
    public static final int LEGEND_RADIATOR_ON_Y = LEGEND_LIGHT_ON_Y + 30;
    public static final int LEGEND_RADIATOR_OFF_X = LEGEND_RADIATOR_ON_X + 25;
    public static final int LEGEND_RADIATOR_OFF_Y = LEGEND_RADIATOR_ON_Y;
    public static final int LEGEND_RADIATOR_LABEL_X = LEGEND_LIGHT_LABEL_X;
    public static final int LEGEND_RADIATOR_LABEL_Y = LEGEND_RADIATOR_OFF_Y - 5;

    //Constants for the legend Garden
    public static final int LEGEND_GARDEN_WIDTH= 30;
    public static final int LEGEND_GARDEN_HEIGHT= 20;

    public static final int LEGEND_GARDEN_X = LEGEND_BLOCK_X + 15  ;
    public static final int LEGEND_GARDEN_Y = LEGEND_RADIATOR_ON_Y + 25;

    public static final int LEGEND_GARDEN_LABEL_X = LEGEND_RADIATOR_LABEL_X;
    public static final int LEGEND_GARDEN_LABEL_Y = LEGEND_GARDEN_Y;

    //Constants for the legend Space

    public static final int LEGEND_SPACE_X = LEGEND_RADIATOR_ON_X ;
    public static final int LEGEND_SPACE_Y = LEGEND_GARDEN_Y + 30;

    public static final int LEGEND_SPACE_LABEL_X = LEGEND_GARDEN_LABEL_X +30;
    public static final int LEGEND_SPACE_LABEL_Y = LEGEND_GARDEN_LABEL_Y + 30;

    //Constants for the legend Reset

    public static final int LEGEND_RESET_X = LEGEND_RADIATOR_ON_X  ;
    public static final int LEGEND_RESET_Y = LEGEND_SPACE_Y + 25;

    public static final int LEGEND_RESET_LABEL_X = LEGEND_GARDEN_LABEL_X + 5;
    public static final int LEGEND_RESET_LABEL_Y = LEGEND_SPACE_LABEL_Y + 25;


    //Legend des bouton switch
    public static final int LEGEND_ACTIVTY_LABEL_X = INDICATORS_BLOCK_X + 5;
    public static final int LEGEND_ACTIVTY_LABEL_Y = INDICATORS_BLOCK_Y + 5;

    public static final int LEGEND_FIRST_FLOOR_LIGHT_LABEL_X = LEGEND_ACTIVTY_LABEL_X + 80;


    public static final int LEGEND_FIRST_FLOOR_LABEL_X = LEGEND_ACTIVTY_LABEL_X;
    public static final int LEGEND_FIRST_FLOOR_LABEL_Y = LEGEND_ACTIVTY_LABEL_Y + 15;

    public static final int LEGEND_FIRST_FLOOR_LIGHT_1_X = LEGEND_FIRST_FLOOR_LABEL_X;
    public static final int LEGEND_FIRST_FLOOR_LIGHT_1_Y = LEGEND_FIRST_FLOOR_LABEL_Y + 15;

    /*public static final int LEGEND_FIRST_FLOOR_LIGHT_2_X = LEGEND_FIRST_FLOOR_LIGHT_1_X;
    public static final int LEGEND_FIRST_FLOOR_LIGHT_2_Y = LEGEND_FIRST_FLOOR_LIGHT_1_Y + 15;

    public static final int LEGEND_FIRST_FLOOR_LIGHT_3_X = LEGEND_FIRST_FLOOR_LIGHT_2_X;
    public static final int LEGEND_FIRST_FLOOR_LIGHT_3_Y = LEGEND_FIRST_FLOOR_LIGHT_2_Y + 15;

    public static final int LEGEND_FIRST_FLOOR_LIGHT_4_X = LEGEND_FIRST_FLOOR_LIGHT_3_X;
    public static final int LEGEND_FIRST_FLOOR_LIGHT_4_Y = LEGEND_FIRST_FLOOR_LIGHT_3_Y + 15;

    public static final int LEGEND_FIRST_FLOOR_LIGHT_5_X = LEGEND_FIRST_FLOOR_LIGHT_4_X;
    public static final int LEGEND_FIRST_FLOOR_LIGHT_5_Y = LEGEND_FIRST_FLOOR_LIGHT_4_Y + 15;*/

    //Constants for doors

}

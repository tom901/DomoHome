package app.display;

import app.common.ParamDisplay;
import app.data.Dimension;
import app.data.home.Floor;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 06/03/15.
 */
public class Base extends Parent {
    static int divider = 1;

    public Base(Group root){
//        Floor floor_rdc = new Floor(new Dimension(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y,
//                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT)
//                ,divider);
//
//        this.getChildren().add(floor_rdc.getFloor());

        Rectangle rectangleOfRight = new Rectangle();
        rectangleOfRight.setX(ParamDisplay.SECONDARY_FLOORS_BLOCK_X);
        rectangleOfRight.setY(ParamDisplay.SECONDARY_FLOORS_BLOCK_Y);
        rectangleOfRight.setWidth(ParamDisplay.SECONDARY_FLOORS_BLOCK_WIDTH);
        rectangleOfRight.setHeight(ParamDisplay.SECONDARY_FLOORS_BLOCK_HEIGHT);
        rectangleOfRight.setFill(Color.WHITE);
        rectangleOfRight.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfRight);

        Rectangle rectangleOfBottom = new Rectangle();
        rectangleOfBottom.setX(ParamDisplay.INDICATORS_BLOCK_X);
        rectangleOfBottom.setY(ParamDisplay.INDICATORS_BLOCK_Y);
        rectangleOfBottom.setWidth(ParamDisplay.INDICATORS_BLOCK_WIDTH);
        rectangleOfBottom.setHeight(ParamDisplay.INDICATORS_BLOCK_HEIGHT);
        rectangleOfBottom.setFill(Color.WHITE);
        rectangleOfBottom.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfBottom);

        Rectangle rectangleOfLegend = new Rectangle();
        rectangleOfLegend.setX(ParamDisplay.LEGEND_BLOCK_X);
        rectangleOfLegend.setY(ParamDisplay.LEGEND_BLOCK_Y);
        rectangleOfLegend.setWidth(ParamDisplay.LEGEND_BLOCK_WIDTH);
        rectangleOfLegend.setHeight(ParamDisplay.LEGEND_BLOCK_HEIGHT);
        rectangleOfLegend.setFill(Color.WHITE);
        rectangleOfLegend.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfLegend);

    }

}

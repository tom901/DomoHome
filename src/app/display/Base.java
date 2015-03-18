package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.data.Dimension;
import app.data.home.Floor;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 06/03/15.
 *
 * This class has for main purpose to display the main rectangles of the simulator
 */
public class Base extends Parent {
    static int divider = 1;

    public Base(Group root) {

        // Rectangle to display the main floor
        Rectangle rectangleOfLeft = new Rectangle();
        rectangleOfLeft.setX(ParamDisplay.MAIN_FLOOR_DISPLAYED_X);
        rectangleOfLeft.setY(ParamDisplay.MAIN_FLOOR_DISPLAYED_Y);
        rectangleOfLeft.setWidth(ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH);
        rectangleOfLeft.setHeight(ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT);
        rectangleOfLeft.setFill(Color.WHITE);
        rectangleOfLeft.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfLeft);

        // Rectangle to display the secondary floors
        Rectangle rectangleOfRight = new Rectangle();
        rectangleOfRight.setX(ParamDisplay.SECONDARY_FLOORS_BLOCK_X);
        rectangleOfRight.setY(ParamDisplay.SECONDARY_FLOORS_BLOCK_Y);
        rectangleOfRight.setWidth(ParamDisplay.SECONDARY_FLOORS_BLOCK_WIDTH);
        rectangleOfRight.setHeight(ParamDisplay.SECONDARY_FLOORS_BLOCK_HEIGHT);
        rectangleOfRight.setFill(Color.WHITE);
        rectangleOfRight.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfRight);

        // Rectangle to display the indicators
        Rectangle rectangleOfBottom = new Rectangle();
        rectangleOfBottom.setX(ParamDisplay.INDICATORS_BLOCK_X);
        rectangleOfBottom.setY(ParamDisplay.INDICATORS_BLOCK_Y);
        rectangleOfBottom.setWidth(ParamDisplay.INDICATORS_BLOCK_WIDTH);
        rectangleOfBottom.setHeight(ParamDisplay.INDICATORS_BLOCK_HEIGHT);
        rectangleOfBottom.setFill(Color.WHITE);
        rectangleOfBottom.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfBottom);

        // Rectangle to display the legend
        Rectangle rectangleOfLegend = new Rectangle();
        rectangleOfLegend.setX(ParamDisplay.LEGEND_BLOCK_X);
        rectangleOfLegend.setY(ParamDisplay.LEGEND_BLOCK_Y);
        rectangleOfLegend.setWidth(ParamDisplay.LEGEND_BLOCK_WIDTH);
        rectangleOfLegend.setHeight(ParamDisplay.LEGEND_BLOCK_HEIGHT);
        rectangleOfLegend.setFill(Color.WHITE);
        rectangleOfLegend.setStroke(Color.BLACK);
        root.getChildren().add(rectangleOfLegend);

        // Rectangle to display the first mini map
        /*final Rectangle rectangleFirstMiniMap = new Rectangle();
        rectangleFirstMiniMap.setX(ParamDisplay.X_MINI_MAP);
        rectangleFirstMiniMap.setY(ParamDisplay.Y_FIRST_LITTLE_MAP);
        rectangleFirstMiniMap.setWidth(ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH + ParamFirstFloor.SECOND_LITTLE_ROOM_WIDTH);
        rectangleFirstMiniMap.setHeight(ParamFirstFloor.FIRST_LITTLE_ROOM_HEIGHT + ParamFirstFloor.THIRD_LITTLE_ROOM_HEIGHT + ParamFirstFloor.FOURTH_LITTLE_ROOM_HEIGHT);
        rectangleFirstMiniMap.setFill(Color.WHITE);
        rectangleFirstMiniMap.setStroke(Color.BLACK);
        rectangleFirstMiniMap.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                rectangleFirstMiniMap.setFill(Color.RED);
            }
        });
        root.getChildren().add(rectangleFirstMiniMap);*/




    }

}

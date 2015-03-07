package app.display;

import app.common.ParamDisplay;
import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 06/03/15.
 */
public class Base extends Parent {

    public Base(){
        Rectangle rectangleOfFloor = new Rectangle();
        rectangleOfFloor.setWidth(ParamDisplay.WIDTH_FIRST_BLOCK);
        rectangleOfFloor.setHeight(ParamDisplay.HEIGHT_FIRST_BLOCK);
        rectangleOfFloor.setArcWidth(15);
        rectangleOfFloor.setArcHeight(15);
        rectangleOfFloor.setFill(Color.WHITE);
        rectangleOfFloor.setTranslateY(ParamDisplay.Y_FIRST_BLOCK);
        rectangleOfFloor.setTranslateX(ParamDisplay.X_FIRST_BLOCK);
        rectangleOfFloor.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfFloor);


        Rectangle rectangleOfRight = new Rectangle();
        rectangleOfRight.setWidth(ParamDisplay.WIDTH_SECOND_BLOCK);
        rectangleOfRight.setHeight(ParamDisplay.HEIGHT_SECOND_BLOCK);
        rectangleOfRight.setArcWidth(15);
        rectangleOfRight.setArcHeight(15);
        rectangleOfRight.setFill(Color.WHITE);
        rectangleOfRight.setTranslateX(ParamDisplay.X_SECOND_BLOCK);
        rectangleOfRight.setTranslateY(ParamDisplay.Y_SECOND_BLOCK);
        rectangleOfRight.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfRight);


        Rectangle rectangleOfBottom = new Rectangle();
        rectangleOfBottom.setWidth(ParamDisplay.WIDTH_THIRD_BLOCK);
        rectangleOfBottom.setHeight(ParamDisplay.HEIGHT_THIRD_BLOCK);
        rectangleOfBottom.setArcWidth(15);
        rectangleOfBottom.setArcHeight(15);
        rectangleOfBottom.setFill(Color.WHITE);
        rectangleOfBottom.setTranslateX(ParamDisplay.X_THIRD_BLOCK);
        rectangleOfBottom.setTranslateY(ParamDisplay.Y_THIRD_BLOCK);
        rectangleOfBottom.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfBottom);

        Rectangle rectangleOfLegend = new Rectangle();
        rectangleOfLegend.setWidth(ParamDisplay.WIDTH_FOURTH_BLOCK);
        rectangleOfLegend.setHeight(ParamDisplay.HEIGHT_FOURTH_BLOCK);
        rectangleOfLegend.setArcWidth(15);
        rectangleOfLegend.setArcHeight(15);
        rectangleOfLegend.setFill(Color.WHITE);
        rectangleOfLegend.setTranslateX(ParamDisplay.X_FOURTH_BLOCK);
        rectangleOfLegend.setTranslateY(ParamDisplay.Y_FOURTH_BLOCK);
        rectangleOfLegend.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfLegend);
    }
}

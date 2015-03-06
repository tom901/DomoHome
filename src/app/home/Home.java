package app.home;

import javafx.scene.Parent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 05/03/15.
 */
public class Home extends Parent {
    String numberFloor;
    //Classe to paint the base of the house
    public Home(){
        Rectangle rectangleOfFloor = new Rectangle();
        rectangleOfFloor.setWidth(590);
        rectangleOfFloor.setHeight(400);
        rectangleOfFloor.setArcWidth(15);
        rectangleOfFloor.setArcHeight(15);
        rectangleOfFloor.setFill(Color.WHITE);
        rectangleOfFloor.setTranslateY(5);
        rectangleOfFloor.setTranslateX(5);
        rectangleOfFloor.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfFloor);


        Rectangle rectangleOfRight = new Rectangle();
        rectangleOfRight.setWidth(190);
        rectangleOfRight.setHeight(400);
        rectangleOfRight.setArcWidth(15);
        rectangleOfRight.setArcHeight(15);
        rectangleOfRight.setFill(Color.WHITE);
        rectangleOfRight.setTranslateY(5);
        rectangleOfRight.setTranslateX(600);
        rectangleOfRight.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfRight);


        Rectangle rectangleOfBottom = new Rectangle();
        rectangleOfBottom.setWidth(590);
        rectangleOfBottom.setHeight(180);
        rectangleOfBottom.setArcWidth(15);
        rectangleOfBottom.setArcHeight(15);
        rectangleOfBottom.setFill(Color.WHITE);
        rectangleOfBottom.setTranslateY(408);
        rectangleOfBottom.setTranslateX(5);
        rectangleOfBottom.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfBottom);

        Rectangle rectangleOfLegend = new Rectangle();
        rectangleOfLegend.setWidth(190);
        rectangleOfLegend.setHeight(180);
        rectangleOfLegend.setArcWidth(15);
        rectangleOfLegend.setArcHeight(15);
        rectangleOfLegend.setFill(Color.WHITE);
        rectangleOfLegend.setTranslateY(408);
        rectangleOfLegend.setTranslateX(600);
        rectangleOfLegend.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfLegend);

    }


}

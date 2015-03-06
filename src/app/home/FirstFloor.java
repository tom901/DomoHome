package app.home;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 05/03/15.
 */
public class FirstFloor extends Floor {

    public FirstFloor(){
        Rectangle rectangleRoom1 = new Rectangle();
        rectangleRoom1.setWidth(295);
        rectangleRoom1.setHeight(150);
        rectangleRoom1.setFill(Color.WHITE);
        rectangleRoom1.setTranslateY(5);
        rectangleRoom1.setTranslateX(5);
        rectangleRoom1.setStroke(Color.BLACK);

        Rectangle rectangleRoom2 = new Rectangle();
        rectangleRoom2.setWidth(295);
        rectangleRoom2.setHeight(100);
        rectangleRoom2.setFill(Color.WHITE);
        rectangleRoom2.setTranslateY(156);
        rectangleRoom2.setTranslateX(5);
        rectangleRoom2.setStroke(Color.BLACK);

        Rectangle rectangleRoom3 = new Rectangle();
        rectangleRoom3.setWidth(320);
        rectangleRoom3.setHeight(150);
        rectangleRoom2.setTranslateY(256);
        rectangleRoom2.setTranslateX(5);
        rectangleRoom3.setFill(Color.WHITE);
        rectangleRoom3.setStroke(Color.BLACK);

        Rectangle rectangleRoom4 = new Rectangle();
        rectangleRoom4.setWidth(290);
        rectangleRoom4.setHeight(400);
        rectangleRoom4.setFill(Color.WHITE);
        rectangleRoom4.setTranslateY(5);
        rectangleRoom4.setTranslateX(300);
        rectangleRoom4.setStroke(Color.BLACK);

        this.getChildren().add(rectangleRoom1);
        this.getChildren().add(rectangleRoom2);
        this.getChildren().add(rectangleRoom3);
        this.getChildren().add(rectangleRoom4);

    }
}

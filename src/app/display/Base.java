package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.data.Dimension;
import app.data.home.Floor;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TitledPane;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 06/03/15.
 * <p/>
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
        //To add a title bar on a element and allow to hide it
       /* TitledPane titledPaneSecondaryBlock = new TitledPane("Etages",rectangleOfRight);
        titledPaneSecondaryBlock.setLayoutX(ParamDisplay.SECONDARY_FLOORS_BLOCK_X);
        titledPaneSecondaryBlock.setLayoutY(ParamDisplay.SECONDARY_FLOORS_BLOCK_Y);
        root.getChildren().add(titledPaneSecondaryBlock);*/
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

        //Legend
        Label lblLegend = new Label("Légende : ");
        lblLegend.setTranslateX(ParamDisplay.LEGEND_LABEL_X);
        lblLegend.setTranslateY(ParamDisplay.LEGEND_LABEL_Y);
        root.getChildren().add(lblLegend);

        Circle legendLightOn = new Circle(ParamDisplay.LEGEND_LIGHT_ON_X, ParamDisplay.LEGEND_LIGHT_ON_Y, ParamDisplay.LEGEND_RADIUS_LIGHT);
        legendLightOn.setStroke(Color.YELLOW);
        legendLightOn.setFill(Color.YELLOW);
        root.getChildren().add(legendLightOn);

        Circle legendLightOff = new Circle(ParamDisplay.LEGEND_LIGHT_OFF_X, ParamDisplay.LEGEND_LIGHT_OFF_Y, ParamDisplay.LEGEND_RADIUS_LIGHT);
        legendLightOff.setStroke(Color.YELLOW);
        legendLightOff.setFill(Color.WHITE);
        root.getChildren().add(legendLightOff);
        //Light Legend
        Label lblLegendLight = new Label("Lampes");
        lblLegendLight.setTranslateX(ParamDisplay.LEGEND_LIGHT_LABEL_X);
        lblLegendLight.setTranslateY(ParamDisplay.LEGEND_LIGHT_LABEL_Y);
        root.getChildren().add(lblLegendLight);
        //Radiator Legend
        Rectangle legendRadiatorOn = new Rectangle(ParamDisplay.LEGEND_RADIATOR_ON_X,ParamDisplay.LEGEND_RADIATOR_ON_Y, ParamDisplay.LEGEND_RADIATOR_WIDTH,ParamDisplay.LEGEND_RADIATOR_HEIGHT);
        legendRadiatorOn.setStroke(Color.RED);
        legendRadiatorOn.setFill(Color.RED);
        root.getChildren().add(legendRadiatorOn);

        Rectangle legendRadiatorOff = new Rectangle(ParamDisplay.LEGEND_RADIATOR_OFF_X,ParamDisplay.LEGEND_RADIATOR_OFF_Y, ParamDisplay.LEGEND_RADIATOR_WIDTH,ParamDisplay.LEGEND_RADIATOR_HEIGHT);
        legendRadiatorOff.setStroke(Color.RED);
        legendRadiatorOff.setFill(Color.WHITE);
        root.getChildren().add(legendRadiatorOff);

        Label lblLegendRadiator = new Label("Radiateur");
        lblLegendRadiator.setTranslateX(ParamDisplay.LEGEND_RADIATOR_LABEL_X);
        lblLegendRadiator.setTranslateY(ParamDisplay.LEGEND_RADIATOR_LABEL_Y);
        root.getChildren().add(lblLegendRadiator);
        //garden Legend

        Rectangle legendGarden = new Rectangle(ParamDisplay.LEGEND_GARDEN_X,ParamDisplay.LEGEND_GARDEN_Y, ParamDisplay.LEGEND_GARDEN_WIDTH,ParamDisplay.LEGEND_GARDEN_HEIGHT);
        legendGarden.setStroke(Color.BLACK);
        legendGarden.setFill(Color.GREEN);
        root.getChildren().add(legendGarden);

        Label lblLegendGarden = new Label("Jardin");
        lblLegendGarden.setTranslateX(ParamDisplay.LEGEND_GARDEN_LABEL_X);
        lblLegendGarden.setTranslateY(ParamDisplay.LEGEND_GARDEN_LABEL_Y);
        root.getChildren().add(lblLegendGarden);
        //Les switchs

        Label lblActivity = new Label("Activité :");
        lblActivity.setTranslateX(ParamDisplay.LEGEND_ACTIVTY_LABEL_X);
        lblActivity.setTranslateY(ParamDisplay.LEGEND_ACTIVTY_LABEL_Y);
        root.getChildren().add(lblActivity);


    }

}

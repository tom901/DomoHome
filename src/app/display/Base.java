package app.display;

import app.common.ParamDisplay;
import app.data.Position;
import app.data.home.Floor;
import app.data.home.Room;
import app.data.object.Light;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Thomas on 06/03/15.
 */
public class Base extends Parent {
    static int multiplier = 4;

    public Base(Group root){
        Floor floor_rdc = new Floor(new Position(ParamDisplay.MAIN_FLOOR_DISPLAYED_X,ParamDisplay.MAIN_FLOOR_DISPLAYED_Y),
                ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH,
                ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT,multiplier);
        /*Rectangle rectangleOfFloor = new Rectangle();
        rectangleOfFloor.setX(ParamDisplay.MAIN_FLOOR_DISPLAYED_X);
        rectangleOfFloor.setY(ParamDisplay.MAIN_FLOOR_DISPLAYED_Y);
        rectangleOfFloor.setWidth(ParamDisplay.MAIN_FLOOR_DISPLAYED_WIDTH);
        rectangleOfFloor.setHeight(ParamDisplay.MAIN_FLOOR_DISPLAYED_HEIGHT);
        floor_rdc.setFill(Color.WHITE);
        floor_rdc.setStroke(Color.BLACK);
        floor_rdc.setStrokeWidth(1);
        */

        this.getChildren().add(floor_rdc.getFloor());

        Rectangle rectangleOfRight = new Rectangle();
        rectangleOfRight.setX(ParamDisplay.SECONDARY_FLOORS_BLOCK_X);
        rectangleOfRight.setY(ParamDisplay.SECONDARY_FLOORS_BLOCK_Y);
        rectangleOfRight.setWidth(ParamDisplay.SECONDARY_FLOORS_BLOCK_WIDTH);
        rectangleOfRight.setHeight(ParamDisplay.SECONDARY_FLOORS_BLOCK_HEIGHT);
        rectangleOfRight.setFill(Color.WHITE);
        rectangleOfRight.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfRight);

        Rectangle rectangleOfBottom = new Rectangle();
        rectangleOfBottom.setX(ParamDisplay.INDICATORS_BLOCK_X);
        rectangleOfBottom.setY(ParamDisplay.INDICATORS_BLOCK_Y);
        rectangleOfBottom.setWidth(ParamDisplay.INDICATORS_BLOCK_WIDTH);
        rectangleOfBottom.setHeight(ParamDisplay.INDICATORS_BLOCK_HEIGHT);
        rectangleOfBottom.setFill(Color.WHITE);
        rectangleOfBottom.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfBottom);

        Rectangle rectangleOfLegend = new Rectangle();
        rectangleOfLegend.setX(ParamDisplay.LEGEND_BLOCK_X);
        rectangleOfLegend.setY(ParamDisplay.LEGEND_BLOCK_Y);
        rectangleOfLegend.setWidth(ParamDisplay.LEGEND_BLOCK_WIDTH);
        rectangleOfLegend.setHeight(ParamDisplay.LEGEND_BLOCK_HEIGHT);
        rectangleOfLegend.setFill(Color.WHITE);
        rectangleOfLegend.setStroke(Color.BLACK);
        this.getChildren().add(rectangleOfLegend);

        root.getChildren().add(this);


        Room room01_01 = new Room(ParamDisplay.FIRST_ROOM_WIDTH, ParamDisplay.FIRST_ROOM_HEIGHT, new Position(ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y),multiplier);
        room01_01.getRoom().setOnMouseClicked(new MouseClicked());
        root.getChildren().add(room01_01.getRoom());

        Room room01_02 = new Room(ParamDisplay.SECOND_ROOM_WIDTH,ParamDisplay.SECOND_ROOM_HEIGHT, new Position(ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y),multiplier);
        room01_02.getRoom().setOnMouseClicked(new MouseClicked());
        root.getChildren().add(room01_02.getRoom());

        Room room01_03 = new Room(ParamDisplay.THIRD_ROOM_WIDTH,ParamDisplay.THIRD_ROOM_HEIGHT, new Position(ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y),multiplier);
        room01_03.getRoom().setOnMouseClicked(new MouseClicked());
        root.getChildren().add(room01_03.getRoom());

        Room room01_04 = new Room(ParamDisplay.FOURTH_ROOM_WIDTH,ParamDisplay.FOURTH_ROOM_HEIGHT, new Position(ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y),multiplier);
        room01_04.getRoom().setOnMouseClicked(new MouseClicked());
        root.getChildren().add(room01_04.getRoom());

        Room room01_05 = new Room(ParamDisplay.FIFTH_ROOM_WIDTH,ParamDisplay.FIFTH_ROOM_HEIGHT, new Position(ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y),multiplier);
        room01_05.getRoom().setOnMouseClicked(new MouseClicked());
        root.getChildren().add(room01_05.getRoom());

        Light lightFirstPlace = new Light(new Position(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y),true);
        root.getChildren().add(lightFirstPlace.getLight());

        Light lightSecondPlace = new Light(new Position(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y),false);
        root.getChildren().add(lightSecondPlace.getLight());

        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));


    }

}

class  MouseClicked implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent event) {
        System.out.println("Mouse clicked.");
    }
}

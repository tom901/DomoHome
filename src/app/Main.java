package app;

import app.common.ParamDisplay;
import app.data.Position;
import app.data.home.Room;
import app.data.object.Light;
import app.display.Base;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DomoHome");
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.web("#ECE9D8"));

        Base basePlan = new Base();

        Light lightFirstPlace = new Light();

        root.getChildren().add(basePlan);
        root.getChildren().add(Room.getRoom(ParamDisplay.FIRST_ROOM_WIDTH,ParamDisplay.FIRST_ROOM_HEIGHT, ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.SECOND_ROOM_WIDTH,ParamDisplay.SECOND_ROOM_HEIGHT, ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.THIRD_ROOM_WIDTH,ParamDisplay.THIRD_ROOM_HEIGHT, ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.FOURTH_ROOM_WIDTH,ParamDisplay.FOURTH_ROOM_HEIGHT, ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.FIFTH_ROOM_WIDTH,ParamDisplay.FIFTH_ROOM_HEIGHT, ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y));

        root.getChildren().add(lightFirstPlace.getLight(new Position(ParamDisplay.FIRST_LIGHT_X,ParamDisplay.FIRST_LIGHT_Y),true));
        root.getChildren().add(lightFirstPlace.getLight(new Position(ParamDisplay.SECOND_LIGHT_X,ParamDisplay.SECOND_LIGHT_Y),false));


        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));


        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

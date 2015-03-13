package app;

import app.common.ParamDisplay;
import app.data.home.Room;
import app.display.Base;
import app.services.SimulatorService;
import app.simulator.Simulator;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    private static SimulatorService simulator;

    public static void main(String[] args) {
        simulator = new Simulator();

        simulator.init();

        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DomoHome");
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.web("#ECE9D8"));

        Base basePlan = new Base();

        root.getChildren().add(basePlan);
        root.getChildren().add(Room.getRoom(ParamDisplay.FIRST_ROOM_WIDTH,ParamDisplay.FIRST_ROOM_HEIGHT, ParamDisplay.FIRST_ROOM_X, ParamDisplay.FIRST_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.SECOND_ROOM_WIDTH,ParamDisplay.SECOND_ROOM_HEIGHT, ParamDisplay.SECOND_ROOM_X, ParamDisplay.SECOND_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.THIRD_ROOM_WIDTH,ParamDisplay.THIRD_ROOM_HEIGHT, ParamDisplay.THIRD_ROOM_X, ParamDisplay.THIRD_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.FOURTH_ROOM_WIDTH,ParamDisplay.FOURTH_ROOM_HEIGHT, ParamDisplay.FOURTH_ROOM_X, ParamDisplay.FOURTH_ROOM_Y));
        root.getChildren().add(Room.getRoom(ParamDisplay.FIFTH_ROOM_WIDTH,ParamDisplay.FIFTH_ROOM_HEIGHT, ParamDisplay.FIFTH_ROOM_X, ParamDisplay.FIFTH_ROOM_Y));

        root.getChildren().add(Room.getGarden(ParamDisplay.GARDEN_ROOM_WIDTH, ParamDisplay.GARDEN_ROOM_HEIGHT, ParamDisplay.GARDEN_ROOM_X, ParamDisplay.GARDEN_ROOM_Y));


        primaryStage.setOnShown(
            new EventHandler<WindowEvent>() {
                @Override
                public void handle(WindowEvent we) {
                    simulator.start();
                }
        });
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                simulator.stop();
            }
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

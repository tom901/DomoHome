package app;

import app.display.Base;
import app.display.HomeViewer;
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

        Base basePlan = new Base(root);

        HomeViewer homeViewer = new HomeViewer(root);


        primaryStage.setOnShown(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
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

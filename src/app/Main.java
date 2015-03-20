package app;

import app.algorithm.BrainCharacter;
import app.common.ParamDisplay;
import app.data.Data;
import app.data.Dimension;
import app.data.home.Room;
import app.data.object.Light;
import app.display.Base;
import app.display.HandlerSwitch;
import app.display.HomeViewer;
import app.display.Viewer;
import app.services.*;
import app.simulator.Simulator;
//import com.guigarage.responsive.ResponsiveHandler;
import app.data.Character;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    private static SimulatorService simulator;
    private static DataService data;
    private static ViewerService viewer;
    private static BrainService brainCharacter;
    private static AnimationTimer timerMain;

    public static void main(String[] args) {

        data = new Data();
        simulator = new Simulator();
        viewer = new Viewer();
        brainCharacter = new BrainCharacter();

        ((Simulator)simulator).bindDataService(data);
        ((Simulator)simulator).bindBrainService(brainCharacter);
        ((Viewer)viewer).bindDataService(data);
        ((BrainCharacter)brainCharacter).bindSimulatorService(simulator);

        data.init();
        simulator.init();
        viewer.init();

        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        primaryStage.setTitle("DomoHome");
        // Always call the getPanel method to display our elements.
        final Scene scene = new Scene(((Viewer)viewer).getPanel(), Color.web("#ECE9D8"));
        //new Scene(root, 800, 600, Color.web("#ECE9D8"));

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

        timerMain = new AnimationTimer() {
            @Override
            public void handle(long now) {
                scene.setRoot(((Viewer)viewer).getPanel());
            }
        };
        timerMain.start();
    }
}
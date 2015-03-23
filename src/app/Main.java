package app;

import app.algorithm.BrainCharacter;
import app.algorithm.BrainHome;
import app.data.Data;
import app.display.Viewer;
import app.services.*;
import app.simulator.Simulator;
//import com.guigarage.responsive.ResponsiveHandler;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

public class Main extends Application {

    private static SimulatorService simulator;
    private static DataService data;
    private static ViewerService viewer;
    private static BrainCharacterService brainCharacter;
    private static BrainHomeService brainHome;
    private static AnimationTimer timerMain;
    private static boolean onPause;

    public static void main(String[] args) {
        onPause = true;
        data = new Data();
        simulator = new Simulator();
        viewer = new Viewer();
        brainCharacter = new BrainCharacter();
        brainHome = new BrainHome();

        ((Simulator)simulator).bindDataService(data);
        ((Simulator)simulator).bindBrainCharacterService(brainCharacter);
        ((Simulator)simulator).bindBrainHomeService(brainHome);
        ((Viewer)viewer).bindDataService(data);
        ((BrainCharacter)brainCharacter).bindSimulatorService(simulator);
        ((BrainHome)brainHome).bindSimulatorService(simulator);

        data.init();
        simulator.init();
        viewer.init();

        launch(args);
    }

    @Override
    public void start(final Stage primaryStage) throws Exception {

        primaryStage.setTitle("DomoHome");
        // Always call the getPanel method to display our elements.
        final Scene scene = new Scene(((Viewer)viewer).getPanel(),800,620, Color.web("#ECE9D8"));
        //new Scene(root, 800, 600, Color.web("#ECE9D8"));

//        primaryStage.setOnShown(new EventHandler<WindowEvent>() {
//            @Override
//            public void handle(WindowEvent event) {
//                simulator.start();
//            }
//        });
        primaryStage.setOnCloseRequest(new EventHandler<WindowEvent>() {
            @Override
            public void handle(WindowEvent event) {
                simulator.destroy();
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
//        timerMain.start();
        // Gestion de la pause et de la reprise
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (onPause) {
                    if (event.getCode().equals(KeyCode.SPACE)){
                        timerMain.start();
                        simulator.start();
                        onPause = false;
                    }
                } else {
                    if (event.getCode().equals(KeyCode.SPACE)){
                        timerMain.stop();
                        simulator.pause();
                        onPause = true;
                    }
                }
            }
        });
    }
}

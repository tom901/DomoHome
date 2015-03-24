package app;

import app.algorithm.BrainCharacter;
import app.algorithm.BrainCharacterDirige;
import app.algorithm.BrainHome;
import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.data.Data;
import app.display.HandlerAudio;
import app.display.Viewer;
import app.services.*;
import app.simulator.Simulator;
//import com.guigarage.responsive.ResponsiveHandler;
import javafx.animation.AnimationTimer;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import javafx.stage.WindowEvent;
import javafx.event.EventHandler;

import java.io.File;

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
//        brainCharacter = new BrainCharacter();
        brainCharacter = new BrainCharacterDirige();
        brainHome = new BrainHome();

        ((Simulator)simulator).bindDataService(data);
        ((Simulator)simulator).bindBrainCharacterService(brainCharacter);
        ((Simulator)simulator).bindBrainHomeService(brainHome);
        ((Viewer)viewer).bindDataService(data);
//        ((BrainCharacter)brainCharacter).bindSimulatorService(simulator);
        ((BrainCharacterDirige)brainCharacter).bindSimulatorService(simulator);
        ((BrainHome)brainHome).bindSimulatorService(simulator);

        data.init();
        simulator.init();
        viewer.init();

        launch(args);



    }

    @Override
    public void start(final Stage primaryStage) throws Exception {
        HandlerAudio.playSongStart();

        primaryStage.setTitle("DomoHome");
        // Always call the getPanel method to display our elements.
        final Scene scene = new Scene(((Viewer)viewer).getPanel(),800,620, Color.web("#ECE9D8"));

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
        // Gestion de la pause, de la reprise et du reset.
        scene.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode().equals(KeyCode.SPACE)){
                    if (onPause) {
                        timerMain.start();
                        simulator.start();
                        onPause = false;
                    } else {
                        timerMain.stop();
                        simulator.pause();
                        onPause = true;
                    }
                }
                if (event.getCode().equals(KeyCode.R)) {
                    simulator.init();
                    data.init();
                    scene.setRoot(((Viewer) viewer).getPanel());
                    timerMain.start();
                }
            }
        });

        // Gestion du changement d'étage dans l'affichage principal.é
        scene.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
                if (event.getX() > ParamDisplay.X_MINI_MAP && event.getX() < ParamDisplay.X_MINI_MAP + ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH + ParamFirstFloor.SECOND_LITTLE_ROOM_WIDTH &&
                        event.getY() > ParamDisplay.Y_FIRST_LITTLE_MAP && event.getY() < ParamDisplay.Y_FIRST_LITTLE_MAP + ParamFirstFloor.SECOND_LITTLE_ROOM_HEIGHT) {
                    viewer.setFirstFloorToDisplay(1);
                    HandlerAudio.playSongSwitchMap();
                    scene.setRoot(((Viewer) viewer).getPanel());
                } else if (event.getX() > ParamDisplay.X_MINI_MAP && event.getX() < ParamDisplay.X_MINI_MAP + ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH + ParamFirstFloor.SECOND_LITTLE_ROOM_WIDTH &&
                        event.getY() > ParamDisplay.Y_SECOND_LITTLE_MAP && event.getY() < ParamDisplay.Y_SECOND_LITTLE_MAP + ParamFirstFloor.SECOND_LITTLE_ROOM_HEIGHT) {
                    viewer.setFirstFloorToDisplay(2);
                    scene.setRoot(((Viewer) viewer).getPanel());
                    HandlerAudio.playSongSwitchMap();
                } else if (event.getX() > ParamDisplay.X_MINI_MAP && event.getX() < ParamDisplay.X_MINI_MAP + ParamFirstFloor.FIRST_LITTLE_ROOM_WIDTH + ParamFirstFloor.SECOND_LITTLE_ROOM_WIDTH &&
                        event.getY() > ParamDisplay.Y_THIRD_LITTLE_MAP && event.getY() < ParamDisplay.Y_THIRD_LITTLE_MAP + ParamFirstFloor.SECOND_LITTLE_ROOM_HEIGHT) {
                    viewer.setFirstFloorToDisplay(3);
                    HandlerAudio.playSongSwitchMap();
                    scene.setRoot(((Viewer) viewer).getPanel());
                }

            }
        });
    }
}

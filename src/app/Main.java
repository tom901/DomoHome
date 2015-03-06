package app;

import app.display.Base;
import app.home.FirstFloor;
import app.home.Floor;
import app.home.Home;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;

import java.util.Map;
import java.util.Set;

public class Main extends Application {

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("DomoHome");
        Group root = new Group();
        Scene scene = new Scene(root, 800, 600, Color.web("#ECE9D8"));
/*

        Floor floor1 = new Floor();
        root.getChildren().add(floor1);
*/
        //MyModification
//        Home displayHome = new Home();
       // FirstFloor firstFloor = new FirstFloor();
//        Floor floor = new Floor();
        Base basePlan = new Base();
        root.getChildren().add(basePlan);
        //root.getChildren().add(firstFloor);
        //root.getChildren().add(displayHome.displayRectangleOfRight());
        //root.getChildren().add(displayHome.displayRectangleOfBottom());

        primaryStage.setScene(scene);
        primaryStage.show();
    }
}

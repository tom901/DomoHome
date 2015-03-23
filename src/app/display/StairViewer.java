package app.display;

import app.common.ParamFirstFloor;
import app.common.ParamHome;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 * Created by Thomas on 23/03/15.
 */
public class StairViewer {

    public StairViewer() {

    }

    public Group getStair() {
        Image imageStair = new Image("file:images/stair.png");
        Group root = new Group();

        ImageView imageStairBig = new ImageView(imageStair);
        imageStairBig.setFitWidth(ParamHome.STAIR_WIDTH);
        imageStairBig.setFitHeight(ParamHome.STAIR_HEIGHT);
        imageStairBig.setTranslateX(ParamHome.FIRST_STAIR_X);
        imageStairBig.setTranslateY(ParamHome.FIRST_STAIR_Y);

        ImageView imageStairLittleFirst = new ImageView(imageStair);
        imageStairLittleFirst.setFitWidth(ParamHome.STAIR_LITTLE_WIDTH);
        imageStairLittleFirst.setFitHeight(ParamHome.STAIR_LITTLE_HEIGHT);
        imageStairLittleFirst.setTranslateX(ParamHome.FIRST_LITTLE_STAIR_X);
        imageStairLittleFirst.setTranslateY(ParamHome.FIRST_LITTLE_STAIR_Y);

        ImageView imageStairLittleSecond = new ImageView(imageStair);
        imageStairLittleSecond.setFitWidth(ParamHome.STAIR_LITTLE_WIDTH);
        imageStairLittleSecond.setFitHeight(ParamHome.STAIR_LITTLE_HEIGHT);
        imageStairLittleSecond.setTranslateX(ParamHome.SECOND_LITTLE_STAIR_X);
        imageStairLittleSecond.setTranslateY(ParamHome.SECOND_LITTLE_STAIR_Y);

        ImageView imageStairLittleThird = new ImageView(imageStair);
        imageStairLittleThird.setFitWidth(ParamHome.STAIR_LITTLE_WIDTH);
        imageStairLittleThird.setFitHeight(ParamHome.STAIR_LITTLE_HEIGHT);
        imageStairLittleThird.setTranslateX(ParamHome.THIRD_LITTLE_STAIR_X);
        imageStairLittleThird.setTranslateY(ParamHome.THIRD_LITTLE_STAIR_Y);

        root.getChildren().add(imageStairBig);
        root.getChildren().add(imageStairLittleFirst);
        root.getChildren().add(imageStairLittleSecond);
        root.getChildren().add(imageStairLittleThird);

        return root;

    }
}

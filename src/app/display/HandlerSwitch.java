package app.display;

import app.common.ParamDisplay;
import app.data.Data;
import app.data.object.ObjectHome;
import app.services.ReadService;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
//Classe to handler the button switch
public class HandlerSwitch extends Parent {
    private ReadService data;
    public boolean state;

    public HandlerSwitch() {
        data = new Data();


        /*Image imgLight1 = new Image("file:images/switch_on.png");
        ImageView imgViewLight1 = new ImageView(imgLight1);
        imgViewLight1.setTranslateX(ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_X);
        imgViewLight1.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y);*/

//        Label lblLight1FirstFloor = new Label("Lampe 1", imgViewLight1);
//        this.getChildren().add(imgViewLight1);
//        this.getChildren().add(lblLight1FirstFloor);
    }

    public Group getBtnSwitchFirstFloor() {
        int count = 1;
        int xDisplayFirstFloor =ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_X;
        int yDisplayFirstFloor =ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;
        data = new Data();
        ArrayList<Label> displayLabelObjectsHome = new ArrayList<Label>();
        ArrayList<ImageView> displayObjectsHome = new ArrayList<ImageView>();

        Group root = new Group();

        Label lblfirstFloor = new Label("Rez-de-chaussé");
        lblfirstFloor.setTranslateX(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_X);
        lblfirstFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
        displayLabelObjectsHome.add(lblfirstFloor);

        for (ObjectHome oH : data.getMiniObjectHomes()) {
            Label lbllampe = new Label("Lampe "+count);
            lbllampe.setTranslateX(xDisplayFirstFloor + 70);
            lbllampe.setTranslateY(yDisplayFirstFloor);
            displayLabelObjectsHome.add(lbllampe);
            if (!oH.state){
                Image imgLight1 = new Image("file:images/switch_on.png");
                ImageView imgViewLight1 = new ImageView(imgLight1);
                imgViewLight1.setTranslateX(xDisplayFirstFloor);
                imgViewLight1.setTranslateY(  yDisplayFirstFloor);
                displayObjectsHome.add(imgViewLight1);
            }
            else{
                Image imgLight1 = new Image("file:images/switch_off.png");
                ImageView imgViewLight1 = new ImageView(imgLight1);
                imgViewLight1.setTranslateX(xDisplayFirstFloor);
                imgViewLight1.setTranslateY(yDisplayFirstFloor);
                displayObjectsHome.add(imgViewLight1);
            }
            yDisplayFirstFloor = yDisplayFirstFloor+20;

            if (count == 6){
                xDisplayFirstFloor = xDisplayFirstFloor + 150;
                yDisplayFirstFloor =ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;

                Label lblSecondFloor = new Label("Etage 1");
                lblSecondFloor.setTranslateX(xDisplayFirstFloor);
                lblSecondFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
                displayLabelObjectsHome.add(lblSecondFloor);
            }else if (count == 10){
                xDisplayFirstFloor = xDisplayFirstFloor + 150;
                yDisplayFirstFloor =ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;

                Label lblThirdFloor = new Label("Etage 2");
                lblThirdFloor.setTranslateX(xDisplayFirstFloor);
                lblThirdFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
                displayLabelObjectsHome.add(lblThirdFloor);
            }
            count++;
        }
        root.getChildren().addAll(displayLabelObjectsHome);
        root.getChildren().addAll(displayObjectsHome);
        return root;
    }
}

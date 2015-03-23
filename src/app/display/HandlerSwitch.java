package app.display;

import app.common.ParamDisplay;
import app.data.Data;
import app.data.object.Door;
import app.data.object.Light;
import app.data.object.ObjectHome;
import app.data.object.Radiator;
import app.services.DataService;
import app.services.ReadService;
import app.services.RequireReadService;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.ArrayList;

/**
 * Created by Thomas on 05/03/15.
 */
//Classe to handler the button switch
public class HandlerSwitch extends Parent implements RequireReadService {
    private ReadService data;
    private int firstFloorToDisplay;

    public HandlerSwitch() {
    }

    public Group getBtnSwitchObjectFloor() {
        int count = 1;
        int xDisplayFirstFloor = ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_X;
        int yDisplayFirstFloor = ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;
//        data = new Data();
        ArrayList<Label> displayLabelObjectsHome = new ArrayList<Label>();
        ArrayList<ImageView> displayObjectsHome = new ArrayList<ImageView>();

        Group root = new Group();

        Label lblfirstFloor = new Label("Rez-de-chaussé");
        lblfirstFloor.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
        lblfirstFloor.setTranslateX(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_X);
        lblfirstFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
        displayLabelObjectsHome.add(lblfirstFloor);

        ArrayList<ObjectHome> tmpListObjectsHome = new ArrayList<ObjectHome>();

        for (int i = 1; i <= 3; i++) {
            for (ObjectHome oH : data.getObjectHomes(i)) {
                if (!(oH instanceof Door)) {
                    tmpListObjectsHome.add(oH);

                }
                //System.out.println(tmpListObjectsHome.size());
            }
        }

        int numberObject = 1;
        for (ObjectHome oH : tmpListObjectsHome) {
            Label labelButton = new Label();

            if (oH instanceof Light) {
                labelButton.setText("Lampe " + numberObject);
            } else if (oH instanceof Radiator) {
                labelButton.setText("Radiateur " + numberObject);
            } else if (oH instanceof Door) {
                labelButton.setText("Porte " + numberObject);
            }
            labelButton.setTranslateX(xDisplayFirstFloor + 70);
            labelButton.setTranslateY(yDisplayFirstFloor);
            displayLabelObjectsHome.add(labelButton);
            ImageView imgViewLight1;
            if (oH.isState() && oH instanceof Light ) {
                imgViewLight1 = new ImageView(new Image("file:images/switch_on_blue.png"));
            }else if(oH.isState() && oH instanceof Radiator ){
                imgViewLight1 = new ImageView(new Image("file:images/switch_on_red.png"));
            }
            else {
                imgViewLight1 = new ImageView(new Image("file:images/switch_off.png"));
            }
            imgViewLight1.setTranslateX(xDisplayFirstFloor);
            imgViewLight1.setTranslateY(yDisplayFirstFloor);
            displayObjectsHome.add(imgViewLight1);

            yDisplayFirstFloor = yDisplayFirstFloor + 20;

            if (count == 6) {
                xDisplayFirstFloor = xDisplayFirstFloor + 130;
                yDisplayFirstFloor = ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;
                numberObject = 0;

            } else if (count == 12) {
                numberObject = 0;

                xDisplayFirstFloor = xDisplayFirstFloor + 150;
                yDisplayFirstFloor = ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;

                Label lblSecondFloor = new Label("Etage 1");
                lblSecondFloor.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                lblSecondFloor.setTranslateX(xDisplayFirstFloor);
                lblSecondFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
                displayLabelObjectsHome.add(lblSecondFloor);


            } else if (count == 16) {
                numberObject = 0;
            } else if (count == 20) {
                numberObject = 0;

                xDisplayFirstFloor = xDisplayFirstFloor + 150;
                yDisplayFirstFloor = ParamDisplay.LEGEND_FIRST_FLOOR_LIGHT_1_Y;

                Label lblThirdFloor = new Label("Etage 2");
                lblThirdFloor.setFont(Font.font("Verdana", FontWeight.BOLD, 10));
                lblThirdFloor.setTranslateX(xDisplayFirstFloor);
                lblThirdFloor.setTranslateY(ParamDisplay.LEGEND_FIRST_FLOOR_LABEL_Y);
                displayLabelObjectsHome.add(lblThirdFloor);
            } else if (count == 22) {
                numberObject = 0;
            }
            count++;
            numberObject++;
        }
        root.getChildren().addAll(displayLabelObjectsHome);
        root.getChildren().addAll(displayObjectsHome);
        return root;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }

    public void setFirstFloorToDisplay(int firstFloorToDisplay) {
        this.firstFloorToDisplay = firstFloorToDisplay;
    }
}

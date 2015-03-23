package app.display;

import app.common.ParamDisplay;
import app.common.ParamFirstFloor;
import app.services.DataService;
import app.services.RequireDataService;
import app.services.ViewerService;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

/**
 * Created by Nicolas on 19/03/2015.
 */
public class Viewer implements ViewerService, RequireDataService {
    DataService data;
    Base basePlan;
    HandlerSwitch handlerSwitch;
    HomeViewer homeViewer;
    int i, firstFloorToDisplay;



    public void init() {
        i = 0;
        firstFloorToDisplay = 2;
        handlerSwitch = new HandlerSwitch();
        homeViewer = new HomeViewer();
        homeViewer.bindDataService(data);
        handlerSwitch.bindDataService(data);

        homeViewer.setFirstFloorToDisplay(firstFloorToDisplay);
        handlerSwitch.setFirstFloorToDisplay(firstFloorToDisplay);

//        data.init();
    }

    public Group getPanel() {
        Group root = new Group();

        basePlan = new Base(root);

        root.getChildren().add(basePlan);
        root.getChildren().add(homeViewer.init());
        root.getChildren().add(handlerSwitch.getBtnSwitchObjectFloor());
//        root.getChildren().add(homeViewer.changeMap());

        return root;
    }

    public void setFirstFloorToDisplay(int firstFloorToDisplay) {
//        this.firstFloorToDisplay = firstFloorToDisplay;
        homeViewer.setFirstFloorToDisplay(firstFloorToDisplay);
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

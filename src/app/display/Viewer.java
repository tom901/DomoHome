package app.display;

import app.services.DataService;
import app.services.RequireDataService;
import app.services.ViewerService;
import javafx.scene.Group;

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
        firstFloorToDisplay = 1;
        handlerSwitch = new HandlerSwitch();
        homeViewer = new HomeViewer();
        homeViewer.bindDataService(data);
        handlerSwitch.bindDataService(data);

        homeViewer.setFirstFloorToDisplay(firstFloorToDisplay);
        handlerSwitch.setFirstFloorToDisplay(firstFloorToDisplay);

    }

    public Group getPanel() {
        Group root = new Group();

        basePlan = new Base(root);

        root.getChildren().add(basePlan);
        root.getChildren().add(homeViewer.getPanel());
        root.getChildren().add(handlerSwitch.getBtnSwitchObjectFloor());

        return root;
    }

    public void setFirstFloorToDisplay(int firstFloorToDisplay) {
        homeViewer.setFirstFloorToDisplay(firstFloorToDisplay);
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

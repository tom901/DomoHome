package app.display;

import app.services.DataService;
import app.services.RequireDataService;
import app.services.ViewerService;
import javafx.scene.Group;
import javafx.scene.Parent;

/**
 * Created by Nicolas on 19/03/2015.
 */
public class Viewer implements ViewerService, RequireDataService {
    DataService data;
    Base basePlan;
    HandlerSwitch handlerSwitch;
    HomeViewer homeViewer;
    int i;

    public void init() {
        i = 0;
        handlerSwitch = new HandlerSwitch();
        homeViewer = new HomeViewer();
        homeViewer.bindDataService(data);

    }

    public Parent getPanel() {
        Group root = new Group();
        basePlan = new Base(root);

        root.getChildren().add(basePlan);
        root.getChildren().add(homeViewer.init());
        root.getChildren().add(handlerSwitch.getBtnSwitchFirstFloor());

        return root;
    }

    @Override
    public void bindDataService(DataService service) {
        data = service;
    }
}

/* ******************************************************
 * Project alpha - Composants logiciels 2015.
 * Copyright (C) 2015 <Binh-Minh.Bui-Xuan@ens-lyon.org>.
 * GPL version>=3 <http://www.gnu.org/licenses/>.
 * $Id: engine/Engine.java 2015-03-11 buixuan.
 * Modified 2015/03/26 by :
 * - nicolas.didier.fd@gmail.com
 * - leslie.cha@hotmail.fr
 * - thomas.paraison@me.com
 * ******************************************************/
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

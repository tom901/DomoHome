package app.services;

import javafx.scene.Parent;

/**
 * Created by Nicolas on 19/03/2015.
 */
public interface ViewerService {
    public void init();
    public Parent getPanel();
    public void setFirstFloorToDisplay(int firstFloorToDisplay);
}

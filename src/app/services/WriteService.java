package app.services;

import app.data.Dimension;

/**
 * Created by Nicolas on 16/03/2015.
 */
public interface WriteService {

    public void setCharacterPosition(double x, double y);
    public void setObjectsOn();
    public void setObjectsOff();
    public void setObjectsOn(int roomID);

}

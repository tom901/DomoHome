package app.services;

/**
 * Created by Nicolas on 13/03/2015.
 */
public interface SimulatorService {
    public void init();
    public void start();
    public void destroy();
    public void setCharacterMove(int direction);
    public void pause();
}

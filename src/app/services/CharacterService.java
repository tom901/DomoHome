package app.services;

import app.data.Dimension;

/**
 * Created by Nicolas on 16/03/2015.
 */
public interface CharacterService {
    public Dimension getPosition();
    public void setPosition(Dimension position);
}
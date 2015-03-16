package app.data;

import app.services.CharacterService;

/**
 * Created by Nicolas on 16/03/2015.
 */
public class Character implements CharacterService {

    private Dimension position;
    private double speed;
//
//    public Character(Dimension position) {
//        this.position = position;
//    }

    public Dimension getPosition() {
        return position;
    }

    public void setPosition(Dimension position) {
        this.position = position;
    }

    //Methode to move the character in the house
    public void move() {

    }
    //Methode for rotate the character to 90°
    public void rotationRight(){

    }
    //Methode for rotate the character to -90°
    public void rotationLeft(){

    }
    //Methode to check if something is behind
    public void checkStraightAHead(){

    }
}

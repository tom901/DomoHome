package app.data;

/**
 * Created by Nicolas on 16/03/2015.
 */
public class Character {

    private Dimension position;
    private int orientation;

    public Character() {
        orientation = 0;
    }

    public Character(Dimension position) {
        this.setPosition(position);
    }

    public Dimension getPosition() {
        return position;
    }

    public void setPosition(Dimension position) {
        this.position = position;
    }

    public int getOrientation() {
        return orientation;
    }

    public void setOrientation(int orientation) {
        this.orientation = orientation;
    }
}

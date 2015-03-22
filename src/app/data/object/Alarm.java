package app.data.object;

import javafx.scene.Group;

/**
 * Created by Thomas on 04/03/15.
 */
public class Alarm extends ObjectHome {

    //Attributes
    public boolean stateAlarm;

    public Alarm(){
        stateAlarm = false;
    }

    @Override
    public Group getGroup() {
        return null;
    }

    //Function to switch the state of the alarm
    public void switchAlarm(boolean stateAlarm){
        this.stateAlarm = stateAlarm;
    }
    //Function to detect if the charactere is in the house
    public void detectCharacter(){

    }



}

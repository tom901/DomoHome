package app.object;

/**
 * Created by Thomas on 04/03/15.
 */
public class Alarm extends ObjectHome {

    //Attributes
    public boolean stateAlarm;

    public Alarm(){
        stateAlarm = false;
    }
    //Function to switch the state of the alarm
    public void switchAlarm(boolean stateAlarm){
        this.stateAlarm = stateAlarm;
    }
    //Function to detect if the charactere is in the house
    public void detectCharacter(){

    }



}

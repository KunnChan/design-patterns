package min.kunnchan.bridge;
/*
 * Created by kunnchan on 10/03/2021
 * package :  min.kunnchan.bridge
 */

public class RemoteControl {

    protected final Device device;

    public RemoteControl(Device device) {
        this.device = device;
    }

    public void turnOn(){
        device.turnOn();
    }

    public void turnOff(){
        device.turnOff();
    }

}

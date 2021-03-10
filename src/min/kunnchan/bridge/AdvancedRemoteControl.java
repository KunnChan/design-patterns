package min.kunnchan.bridge;
/*
 * Created by kunnchan on 10/03/2021
 * package :  min.kunnchan.bridge
 */

public class AdvancedRemoteControl extends RemoteControl{
    public AdvancedRemoteControl(Device device) {
        super(device);
    }

    public void setChannel(int channel){
        device.setChannel(channel);
    }
}

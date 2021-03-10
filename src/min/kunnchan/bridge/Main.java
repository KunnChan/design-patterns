package min.kunnchan.bridge;
/*
 * Created by kunnchan on 10/03/2021
 * package :  min.kunnchan.bridge
 */

public class Main {

    public static void main(String[] args) {
        AdvancedRemoteControl remoteControl = new AdvancedRemoteControl(new SamsungTV());
        remoteControl.turnOn();
        remoteControl.turnOff();
        remoteControl.setChannel(4);
    }
}

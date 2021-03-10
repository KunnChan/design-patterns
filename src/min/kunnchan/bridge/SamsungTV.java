package min.kunnchan.bridge;
/*
 * Created by kunnchan on 10/03/2021
 * package :  min.kunnchan.bridge
 */

public class SamsungTV implements Device{
    @Override
    public void turnOn() {
        System.out.println("Samsung: turnOn");
    }

    @Override
    public void turnOff() {
        System.out.println("Samsung: turnOff");
    }

    @Override
    public void setChannel(int channel) {
        System.out.println("Samsung: setChannel");
    }
}

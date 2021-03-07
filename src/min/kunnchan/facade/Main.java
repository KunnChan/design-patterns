package min.kunnchan.facade;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.facade
 */

// facade is used for hiding multiple step methods calls under service
public class Main {

    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.send("hello world", "target");
    }
}

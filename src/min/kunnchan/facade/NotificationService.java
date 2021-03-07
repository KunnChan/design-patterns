package min.kunnchan.facade;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.facade
 */

public class NotificationService {

    public void send(String message, String target){
        NotificationServer server = new NotificationServer();
        Connection connection = server.connect("ip");
        AuthToken authenticate = server.authenticate("appid", "key");
        server.send(authenticate, new Message(message), target);
        connection.disconnect();
    }
}

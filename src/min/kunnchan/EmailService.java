package min.kunnchan;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan
 */

// abstraction is hiding unnecessary methods to be visible
// in sending email, we don't care about connecting, disconnecting or authenticating
// we just care about sending email, so hiding those unnecessary
public class EmailService {

    // only sendEmail method will be visible
    public void sendEmail(){
        connect();
        authenticate();
        System.out.println("Sending Email");
        disconnected();
    }

    private void connect(){
        System.out.println("Connected");
    }
    private void disconnected(){
        System.out.println("Disconnected");
    }
    private void authenticate(){
        System.out.println("Authenticated");
    }
}

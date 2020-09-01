package min.kunnchan.command.fx;
/*
 * Created by kunnchan on 01/09/2020
 * package :  min.kunnchan.command
 */

public class Button {

    private String label;
    private Command command;

    public Button(Command command) {
        this.command = command;
    }

    public void click(){
        command.execute();
    }

    public String getLabel() {
        return label;
    }

    public void setLabel(String label) {
        this.label = label;
    }
}

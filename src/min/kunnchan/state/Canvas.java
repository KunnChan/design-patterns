package min.kunnchan.state;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan.state
 */

public class Canvas {

    private final Tool currentTool;

    public Canvas(Tool currentTool) {
        this.currentTool = currentTool;
    }

    public void mouseDown(){
        currentTool.mouseDown();
    }

    public void mouseUp(){
        currentTool.mouseUp();
    }


    public Tool getCurrentTool() {
        return currentTool;
    }
}

package min.kunnchan.state;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan.state
 */

public class EraserTool implements Tool {
    @Override
    public void mouseDown() {
        System.out.println("EraserTool mouseDown");
    }

    @Override
    public void mouseUp() {
        System.out.println("EraserTool mouseUp");
    }
}

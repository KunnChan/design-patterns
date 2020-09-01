package min.kunnchan.command.editor;
/*
 * Created by kunnchan on 02/09/2020
 * package :  min.kunnchan.command.editor
 */

public class UndoCommand implements Command{
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if(history.size() > 0){
            history.pop().unExecute();
        }
    }
}

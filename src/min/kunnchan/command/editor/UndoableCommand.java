package min.kunnchan.command.editor;
/*
 * Created by kunnchan on 02/09/2020
 * package :  min.kunnchan.command.editor
 */


public interface UndoableCommand extends Command{
    void unExecute();
}

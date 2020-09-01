package min.kunnchan.command.editor;
/*
 * Created by kunnchan on 02/09/2020
 * package :  min.kunnchan.command.editor
 */

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commands.push(command);
    }
    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }
}

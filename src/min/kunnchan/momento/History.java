package min.kunnchan.momento;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan.momento
 */

import java.util.ArrayList;
import java.util.List;

//Caretaker class in GoF Book
public class History {

    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        int lastIndex = states.size() - 1;
        EditorState lastState = states.get(lastIndex);
        states.remove(lastState);
        return lastState;
    }
}

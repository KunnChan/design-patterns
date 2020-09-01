package min.kunnchan.momento;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan.momento
 */

//Momento class in GoF Book
public class EditorState {

    private final String content;

    public EditorState(String content) {
        this.content = content;
    }
    public String getContent() {
        return content;
    }
}

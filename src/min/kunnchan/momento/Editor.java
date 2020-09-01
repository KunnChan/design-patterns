package min.kunnchan.momento;
/*
 * Created by kunnchan on 30/08/2020
 * package :  min.kunnchan.momento
 */

//Originator class in GoF Book
public class Editor {

    private String content;
    public EditorState createState(){
        return new EditorState(content);
    }
    public void restore(EditorState state){
        content = state.getContent();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}

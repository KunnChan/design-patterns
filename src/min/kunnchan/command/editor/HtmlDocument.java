package min.kunnchan.command.editor;
/*
 * Created by kunnchan on 02/09/2020
 * package :  min.kunnchan.command.editor
 */

public class HtmlDocument {
    private String content;

    public void makeBold(){
        content = "<b>" + content + "</b>";
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }
}

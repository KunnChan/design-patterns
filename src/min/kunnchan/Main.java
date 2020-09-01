package min.kunnchan;

import min.kunnchan.command.AddCustomerCommand;
import min.kunnchan.command.CustomerService;
import min.kunnchan.command.editor.BoldCommand;
import min.kunnchan.command.editor.HtmlDocument;
import min.kunnchan.command.editor.UndoCommand;
import min.kunnchan.command.fx.Button;
import min.kunnchan.iterator.BrowseHistory;
import min.kunnchan.iterator.Iterator;
import min.kunnchan.momento.Editor;
import min.kunnchan.momento.History;
import min.kunnchan.state.Canvas;
import min.kunnchan.state.SelectionTool;
import min.kunnchan.strategy.BlackAndWhiteFilter;
import min.kunnchan.strategy.ImageStorage;
import min.kunnchan.strategy.JpegCompressor;
import min.kunnchan.strategy.PngCompressor;
import min.kunnchan.template.TransferMoneyTask;

public class Main {

    public static void main(String[] args) {
        commandHtmlDocumentDemo();
    }

    private static void abstractionDemo(){
        EmailService emailService = new EmailService();
        emailService.sendEmail();
    }

    // Text Editor Undo demo
    private static void momentoDemo(){
        Editor editor = new Editor();
        History history = new History();

        editor.setContent("a");
        history.push(editor.createState());

        editor.setContent("b");
        history.push(editor.createState());

        editor.setContent("c");
        editor.restore(history.pop());

        System.out.println(editor.getContent()); // must be b
    }

    // photoshop selecting tools demo
    private static void stateDemo(){
        Canvas canvas = new Canvas(new SelectionTool());
        canvas.mouseDown();
        canvas.mouseUp();
    }

    // browser history demo
    private static void iteratorDemo(){
        BrowseHistory history = new BrowseHistory();
        history.push("a");
        history.push("b");
        history.push("c");

        Iterator iterator = history.createIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.current());
            iterator.next();
        }
    }

    private static void strategyDemo(){
        ImageStorage imageStorage = new ImageStorage();
        imageStorage.store("a", new JpegCompressor(), new BlackAndWhiteFilter());
        imageStorage.store("a", new PngCompressor(), new BlackAndWhiteFilter());
    }

    private static void templateDemo(){
        TransferMoneyTask transferMoneyTask = new TransferMoneyTask();
        transferMoneyTask.execute();
    }

    private static void commandDemo(){
        Button button = new Button(new AddCustomerCommand(new CustomerService()));
        button.click();
    }

    private static void commandHtmlDocumentDemo(){
        min.kunnchan.command.editor.History history = new min.kunnchan.command.editor.History();
        HtmlDocument document = new HtmlDocument();
        document.setContent("Hello World");

        BoldCommand boldCommand = new BoldCommand(document, history);
        boldCommand.execute();
        System.out.println(document.getContent());

        UndoCommand undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}

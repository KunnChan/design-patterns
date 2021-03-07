package min.kunnchan.proxy;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.proxy
 */
// Proxy is used for lazy loading the object.
// It serve like an agent between objects
public class Main {
    public static void main(String[] args) {
        Library library = new Library();
        String [] fileNames = {"a", "b", "c"};
        for (String fileName: fileNames) {
            library.add(new EbookProxy(fileName));
        }
        library.openEbook("a");
    }
}

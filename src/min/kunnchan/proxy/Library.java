package min.kunnchan.proxy;
/*
 * Created by kunnchan on 07/03/2021
 * package :  min.kunnchan.proxy
 */

import java.util.HashMap;
import java.util.Map;

public class Library {
    private Map<String, Ebook> ebookMap = new HashMap<>();

    public void add(Ebook ebook){
        ebookMap.put(ebook.getFileName(), ebook);
    }

    public void openEbook(String fileName){
        ebookMap.get(fileName).show();
    }
}
